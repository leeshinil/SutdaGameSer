package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class UserInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String id, name, money, card1, card2, card3, card4;// card1은첫번째카드
	String type;// 상태(어떤메세지를보내는지?)
	GameData gameData = null;
	String totalMoney;
	int callMoney;
	int callCount=0;
	String finishResult;
	boolean Winner;
	

	public boolean isWinner() {
		return Winner;
	}

	public void setWinner(boolean winner) {
		Winner = winner;
	}

	public String getFinishResult() {
		return finishResult;
	}

	public void setFinishResult(String finishResult) {
		this.finishResult = finishResult;
	}

	public int getCallCount() {
		return callCount;
	}

	public void setCallCount(int callCount) {
		this.callCount = callCount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UserInfo() {

	}

	public UserInfo(String name, String money, String card1, String card2) {
		this.name = name;
		this.money = money;
		this.card1 = card1;
		this.card2 = card2;
	}

	boolean turn = false;

	public boolean isTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}

	public String getCard1() {
		return card1;
	}

	public void setCard1(String card1) {
		this.card1 = card1;
	}

	public String getCard2() {
		return card2;
	}

	public void setCard2(String card2) {
		this.card2 = card2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}

	public int getCallMoney() {
		return callMoney;
	}

	public void setCallMoney(int callMoney) {
		this.callMoney = callMoney;
	}

	public String getCard3() {
		return card3;
	}

	public void setCard3(String card3) {
		this.card3 = card3;
	}

	public String getCard4() {
		return card4;
	}

	public void setCard4(String card4) {
		this.card4 = card4;
	}
	
}
