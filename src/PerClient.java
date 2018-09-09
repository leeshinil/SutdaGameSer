
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Model.GameData;
import Model.UserData;
import Model.UserInfo;

public class PerClient implements Runnable {
	static List<ObjectOutputStream> list = Collections.synchronizedList(new ArrayList<ObjectOutputStream>());
	Socket socket;
	UserData userData;
	GameData gameData;

	public PerClient(Socket socket) {
		this.userData = UserData.getInstance();
		this.socket = socket;
		this.gameData = GameData.getInstance();
		gameData.settingRanking();
		System.out.println("connect client");
		try {
			ObjectOutputStream writer = new ObjectOutputStream(socket.getOutputStream());
			list.add(writer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			ObjectInputStream reader = new ObjectInputStream(socket.getInputStream());// 스트림얻어오기)
			UserInfo userInfo = (UserInfo) reader.readObject();
			System.out.println("name : " + userInfo.getName() + " ,  money : " + userInfo.getMoney());
			userData.getUserList().add(userInfo);/* userList.(userInfo); */
			// userData.getUserList().get(0).setCallMoney(user);

			if (userData.getUserList().size() == 2) {// 게임시작
				userData.getUserList().get(1).setType("VisibleStartButton");
				userData.getUserList().get(0).setType("gest");
				userData.getUserList().get(0).setTurn(true);
				userData.getUserList().get(1).setTurn(false);
				send(userData.getUserList().get(1), 0);
				send(userData.getUserList().get(0), 1);

				System.out.println("GameStart");
			}

			while (true) {// 게임 스테이트 줘서 finish일시 폴스로 적용
				// started game.

				userInfo = (UserInfo) reader.readObject();

				// 게임이 시작되면, user1, user2에게 각자 카드를 한장 뿌려줌.
				// 한 server만 호출돼. 방장과 연결된 서버.
				if (userInfo.getType().equals("GameStart")) {

					gameData.setRandomCard();
					userData.setTotalMoney("2000");
					userData.setCallMoney(1000);
					// setting for user1
					gameData.setUser1List();
					userInfo.setCard1(gameData.getUser1List().get(0));

					userInfo.setTurn(true);
					userInfo.setTotalMoney(userData.getTotalMoney());
					userInfo.setCallMoney(userData.getCallMoney());
					send(userInfo, 0);

					// setting for user2
					UserInfo user2Info = userData.getUserList().get(1);
					user2Info.setType("GameStart");
					gameData.setUser2List();
					user2Info.setCard1(gameData.getUser2List().get(0));
					user2Info.setTurn(false);
					user2Info.setTotalMoney(userData.getTotalMoney());
					user2Info.setCallMoney(userData.getCallMoney());
					send(user2Info, 1);

				} else if (userInfo.getType().equals("call")) {
					userData.callCount++;
					System.out.println("call");
					userData.setTotalMoney(userInfo.getTotalMoney());
					System.out.println("Total Money :  " + userData.getTotalMoney());

					if (userData.getUserList().get(0).isTurn()) {
						userData.getUserList().get(0).setTurn(false);
						userData.getUserList().get(1).setTurn(true);
						userData.setUser(userInfo, 0);
						send(userInfo,1);
						if(userData.callCount == 4)
							send(userInfo, 1);
					} else {
						userData.getUserList().get(1).setTurn(false);
						userData.getUserList().get(0).setTurn(true);
						userData.setUser(userInfo, 1);
						send(userInfo, 0);
						if(userData.callCount == 4)
							send(userInfo,0);
					}
					if (userData.callCount == 4) {
						//finish
						finishGame();
					} else if (userData.callCount == 2) {
						Thread.sleep(500);
						// card2 setting and send totalmoney
						setCard2(userInfo);
					}
				}
				else if(userInfo.getType().equals("die")) {
					userData.setTotalMoney(userInfo.getTotalMoney());
					//다이일때 보내주는 정보
					System.out.println("die");
					
					if (userData.getUserList().get(0).isTurn()) {
						userData.getUserList().get(0).setTurn(false);
						userData.getUserList().get(1).setTurn(true);
						userData.setUser(userInfo, 0);
						send(userInfo,1);
					} else {
						userData.getUserList().get(1).setTurn(false);
						userData.getUserList().get(0).setTurn(true);
						userData.setUser(userInfo, 1);
						send(userInfo, 0);
					}
					finishGame1();
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void send(UserInfo userList, int index) {
		try {
			list.get(index).writeObject(userList);
			list.get(index).flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setCard2(UserInfo userInfo) {
		UserInfo user1Info = userData.getUserList().get(0);
		user1Info.setType("card2");
		user1Info.setCard2(gameData.getUser1List().get(1));
		user1Info.setTurn(true);
		user1Info.setTotalMoney(userData.getTotalMoney());
		user1Info.setCallMoney(userData.getCallMoney());
		send(user1Info, 0);

		// user 2
		userInfo.setCard2(gameData.getUser2List().get(1));
		userInfo.setTurn(false);
		userInfo.setTotalMoney(userData.getTotalMoney());
		userInfo.setCallMoney(userData.getCallMoney());
		userInfo.setType("card2");
		send(userInfo, 1);
	}
	public void finishGame1() {//다이 누를때 지는것.
		UserInfo user1Info = userData.getUserList().get(0);
		UserInfo user2Info = userData.getUserList().get(1);
		
		if(user1Info.getType().equals("die")) {
			String finishResult = user1Info.getName() + "win";
			user1Info.setType("finishGame1");
			user1Info.setFinishResult(finishResult);
			send(user1Info,0);
		}
		else if(user2Info.getType().equals("die")) {
			String finishResult = user2Info.getName() + "win";
			user1Info.setType("finishGame1");
			user1Info.setFinishResult(finishResult);
			send(user2Info,1);
		}
	}
	public void finishGame() {
		// ranking setting
		UserInfo user1Info = userData.getUserList().get(0);
		UserInfo user2Info = userData.getUserList().get(1);
		int user1Rank = gameData.resultMap.get(user1Info.getCard1() + "," + user1Info.getCard2()).getRank();
		int user2Rank = gameData.resultMap.get(user2Info.getCard1() + "," + user2Info.getCard2()).getRank();
		String finishResult = user1Rank < user2Rank ? user1Info.getName() + " win" : user2Info.getName() + " win";

		if (user1Rank < user2Rank) {
			user1Info.setWinner(true);
		} else {
			user2Info.setWinner(true);
		}
		// user1 setting
		user1Info.setType("finishGame");
		user1Info.setFinishResult(finishResult);
		user1Info.setCard3(user2Info.getCard1());
		user1Info.setCard4(user2Info.getCard2());
		send(user1Info, 0);

		// user2 setting
		user2Info.setType("finishGame");
		user2Info.setFinishResult(finishResult);
		user2Info.setCard3(user1Info.getCard1());
		user2Info.setCard4(user1Info.getCard2());
		send(user2Info, 1);

	}
}
