package Model;
import java.util.ArrayList;

public class UserData {
	private static UserData userData = null;
	public int callCount = 0;
	public static UserData getInstance() {
		if (userData == null) {
			userData = new UserData();
		}
		return userData;
	}
	private ArrayList<UserInfo> userList = new ArrayList<UserInfo>();
	private String totalMoney;
	private int callMoney;


	public int getCallMoney() {
		return callMoney;
	}

	public void setCallMoney(int callMoney) {
		this.callMoney = callMoney;
	}

	public String getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}

	

	public ArrayList<UserInfo> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<UserInfo> userList) {
		this.userList = userList;
	}
	public void setUser(UserInfo userInfo) {
		this.userList.add(userInfo);
	}
	public void setUser(UserInfo userInfo, int index) {
		this.userList.set(index, userInfo);
	}
}
