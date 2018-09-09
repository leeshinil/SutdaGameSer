package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GameData {
	private static GameData gameData = null;

	public static GameData getInstance() {
		if (gameData == null) {
			gameData = new GameData();
		}
		return gameData;
	}
	public Map<String, CardVO> resultMap;
	ArrayList<String> user1List = new ArrayList<String>();
	ArrayList<String> user2List = new ArrayList<String>();
	int x[] = new int[4];
	int y[] = new int[4];

	public ArrayList<String> getUser1List() {
		return user1List;
	}

	public void setUser1List(ArrayList<String> user1List) {
		this.user1List = user1List;
	}

	public void setUser1List() {
		this.user1List.add(x[0] + "." + y[0]);
		this.user1List.add(x[2] + "." + y[2]);
	}

	public ArrayList<String> getUser2List() {
		return user2List;
	}

	public void setUser2List(ArrayList<String> user2List) {
		this.user2List = user2List;
	}

	public void setUser2List() {
		this.user2List.add(x[1] + "." + y[1]);
		this.user2List.add(x[3] + "." + y[3]);
	}

	public void setRandomCard() {
		Random random = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = random.nextInt(10) + 1;
			y[i] = random.nextInt(2) + 1;
			for (int a = 0; a < i; a++) {
				if (x[i] == x[a] && y[i] == y[a])
					i--;
			}
		}
	}
	
	public void settingRanking() {
		resultMap = new HashMap<String, CardVO>();
		// ����
		resultMap.put("3.2,8.2", new CardVO("38����", 1));
		resultMap.put("1.2,8.2", new CardVO("����", 2));
		resultMap.put("1.2,3.2", new CardVO("����", 3));
		resultMap.put("8.2,3.2", new CardVO("38����", 1));
		resultMap.put("8.2,1.2", new CardVO("����", 2));
		resultMap.put("3.2,1.2", new CardVO("����", 3));
		// ��
		resultMap.put("10.1,10.2", new CardVO("�嶯", 4));
		resultMap.put("9.1,9.2", new CardVO("����", 5));
		resultMap.put("8.1,8.2", new CardVO("�ȶ�", 6));
		resultMap.put("7.1,7.2", new CardVO("ĥ��", 7));
		resultMap.put("6.1,6.2", new CardVO("����", 8));
		resultMap.put("5.1,5.2", new CardVO("����", 9));
		resultMap.put("4.1,4.2", new CardVO("�綯", 10));
		resultMap.put("3.1,3.2", new CardVO("�ﶯ", 11));
		resultMap.put("2.1,2.2", new CardVO("�̶�", 12));
		resultMap.put("1.1,1.2", new CardVO("�϶�", 13));
		resultMap.put("10.2,10.1", new CardVO("�嶯", 4));
		resultMap.put("9.2,9.1", new CardVO("����", 5));
		resultMap.put("8.2,8.1", new CardVO("�ȶ�", 6));
		resultMap.put("7.2,7.1", new CardVO("ĥ��", 7));
		resultMap.put("6.2,6.1", new CardVO("����", 8));
		resultMap.put("5.2,5.1", new CardVO("����", 9));
		resultMap.put("4.2,4.1", new CardVO("�綯", 10));
		resultMap.put("3.2,3.1", new CardVO("�ﶯ", 11));
		resultMap.put("2.2,2.1", new CardVO("�̶�", 12));
		resultMap.put("1.2,1.1", new CardVO("�϶�", 13));
		// �˸�
		resultMap.put("1.2,2.2", new CardVO("�˸�", 14));
		resultMap.put("2.2,1.2", new CardVO("�˸�", 14));

		resultMap.put("1.2,2.1", new CardVO("�˸�", 15));
		resultMap.put("2.1,1.2", new CardVO("�˸�", 15));

		resultMap.put("1.1,2.2", new CardVO("�˸�", 16));
		resultMap.put("2.2,1.1", new CardVO("�˸�", 16));

		resultMap.put("1.1,2.1", new CardVO("�˸�", 17));
		resultMap.put("2.1,1.1", new CardVO("�˸�", 17));

		// ����
		resultMap.put("1.2,4.2", new CardVO("����", 18));
		resultMap.put("4.2,1.2", new CardVO("����", 18));

		resultMap.put("1.2,4.1", new CardVO("����", 19));
		resultMap.put("4.1,1.2", new CardVO("����", 19));

		resultMap.put("1.1,4.2", new CardVO("����", 20));
		resultMap.put("4.2,1.1", new CardVO("����", 20));

		resultMap.put("1.1,4.1", new CardVO("����", 21));
		resultMap.put("4.1,1.1", new CardVO("����", 21));

		// ����
		resultMap.put("1.2,9.2", new CardVO("����", 22));
		resultMap.put("9.2,1.2", new CardVO("����", 22));

		resultMap.put("1.2,9.1", new CardVO("����", 23));
		resultMap.put("9.1,1.2", new CardVO("����", 23));

		resultMap.put("1.1,9.2", new CardVO("����", 24));
		resultMap.put("9.2,1.1", new CardVO("����", 24));

		resultMap.put("1.1,9.1", new CardVO("����", 25));
		resultMap.put("9.1,1.1", new CardVO("����", 25));

		// ���
		resultMap.put("1.2,10.2", new CardVO("���", 26));
		resultMap.put("10.2,1.2", new CardVO("���", 26));

		resultMap.put("1.2,10.1", new CardVO("���", 27));
		resultMap.put("10.1,1.2", new CardVO("���", 27));

		resultMap.put("1.1,10.2", new CardVO("���", 28));
		resultMap.put("10.2,1.1", new CardVO("���", 28));

		resultMap.put("1.1,10.1", new CardVO("���", 29));
		resultMap.put("10.1,1.1", new CardVO("���", 29));

		// ���
		resultMap.put("4.2,10.2", new CardVO("���", 30));
		resultMap.put("10.2,4.2", new CardVO("���", 30));

		resultMap.put("4.2,10.1", new CardVO("���", 31));
		resultMap.put("10.1,4.2", new CardVO("���", 31));

		resultMap.put("4.1,10.2", new CardVO("���", 32));
		resultMap.put("10.2,4.1", new CardVO("���", 32));

		resultMap.put("4.1,10.1", new CardVO("���", 33));
		resultMap.put("10.1,4.1", new CardVO("���", 33));

		// ����
		resultMap.put("4.2,6.2", new CardVO("����", 34));
		resultMap.put("6.2,4.2", new CardVO("����", 34));

		resultMap.put("4.2,6.1", new CardVO("����", 35));
		resultMap.put("6.1,4.2", new CardVO("����", 35));

		resultMap.put("4.1,6.2", new CardVO("����", 36));
		resultMap.put("6.2,4.1", new CardVO("����", 36));

		resultMap.put("4.1,6.1", new CardVO("����", 37));
		resultMap.put("6.1,4.1", new CardVO("����", 37));

		// ����(1,8)
		// resultMap.put("1.2,8.2", new CardVO("����", 38));
		// resultMap.put("8.2,1.2", new CardVO("����", 38));

		resultMap.put("1.2,8.1", new CardVO("����", 39));
		resultMap.put("8.1,1.2", new CardVO("����", 39));

		resultMap.put("1.1,8.2", new CardVO("����", 40));
		resultMap.put("8.2,1.1", new CardVO("����", 40));

		resultMap.put("1.1,8.1", new CardVO("����", 41));
		resultMap.put("8.1,1.1", new CardVO("����", 41));

		// ����(2,7)
		resultMap.put("2.2,7.2", new CardVO("����", 42));
		resultMap.put("7.2,2.2", new CardVO("����", 42));

		resultMap.put("2.2,7.1", new CardVO("����", 43));
		resultMap.put("7.1,2.2", new CardVO("����", 43));

		resultMap.put("2.1,7.2", new CardVO("����", 44));
		resultMap.put("7.2,2.1", new CardVO("����", 44));

		resultMap.put("2.1,7.1", new CardVO("����", 45));
		resultMap.put("7.1,2.1", new CardVO("����", 45));

		// ����(3,6)
		resultMap.put("3.2,6.2", new CardVO("����", 46));
		resultMap.put("6.2,3.2", new CardVO("����", 46));

		resultMap.put("3.2,6.1", new CardVO("����", 47));
		resultMap.put("6.1,3.2", new CardVO("����", 47));

		resultMap.put("3.1,6.2", new CardVO("����", 48));
		resultMap.put("6.2,3.1", new CardVO("����", 48));

		resultMap.put("3.1,6.1", new CardVO("����", 49));
		resultMap.put("6.1,3.1", new CardVO("����", 49));

		// ����(4,5)
		resultMap.put("4.2,5.2", new CardVO("����", 50));
		resultMap.put("5.2,4.2", new CardVO("����", 50));

		resultMap.put("4.2,5.1", new CardVO("����", 51));
		resultMap.put("5.1,4.2", new CardVO("����", 51));

		resultMap.put("4.1,5.2", new CardVO("����", 52));
		resultMap.put("5.2,4.1", new CardVO("����", 52));

		resultMap.put("4.1,5.1", new CardVO("����", 53));
		resultMap.put("5.1,4.1", new CardVO("����", 53));

		// ����(9,10)
		resultMap.put("9.2,10.2", new CardVO("����", 54));
		resultMap.put("10.2,9.2", new CardVO("����", 54));

		resultMap.put("9.2,10.1", new CardVO("����", 55));
		resultMap.put("10.1,9.2", new CardVO("����", 55));

		resultMap.put("9.1,10.2", new CardVO("����", 56));
		resultMap.put("10.2,9.1", new CardVO("����", 56));

		resultMap.put("9.1,10.1", new CardVO("����", 57));
		resultMap.put("10.1,9.1", new CardVO("����", 57));

		// �ȳ�(1,7)
		resultMap.put("1.2,7.2", new CardVO("�ȳ�", 58));
		resultMap.put("7.2,1.2", new CardVO("�ȳ�", 58));

		resultMap.put("1.2,7.1", new CardVO("�ȳ�", 59));
		resultMap.put("7.1,1.2", new CardVO("�ȳ�", 59));

		resultMap.put("1.1,7.2", new CardVO("�ȳ�", 60));
		resultMap.put("7.2,1.1", new CardVO("�ȳ�", 60));

		resultMap.put("1.1,7.1", new CardVO("�ȳ�", 61));
		resultMap.put("7.1,1.1", new CardVO("�ȳ�", 61));

		// �ȳ�(2,6)
		resultMap.put("2.2,6.2", new CardVO("�ȳ�", 62));
		resultMap.put("6.2,2.2", new CardVO("�ȳ�", 62));

		resultMap.put("2.2,6.1", new CardVO("�ȳ�", 63));
		resultMap.put("6.1,2.2", new CardVO("�ȳ�", 63));

		resultMap.put("2.1,6.2", new CardVO("�ȳ�", 64));
		resultMap.put("6.2,2.1", new CardVO("�ȳ�", 64));

		resultMap.put("2.1,6.1", new CardVO("�ȳ�", 65));
		resultMap.put("6.1,2.1", new CardVO("�ȳ�", 65));

		// �ȳ�(3,5)
		resultMap.put("3.2,5.2", new CardVO("�ȳ�", 66));
		resultMap.put("5.2,3.2", new CardVO("�ȳ�", 66));

		resultMap.put("3.2,5.1", new CardVO("�ȳ�", 67));
		resultMap.put("5.1,3.2", new CardVO("�ȳ�", 67));

		resultMap.put("3.1,5.2", new CardVO("�ȳ�", 68));
		resultMap.put("5.2,3.1", new CardVO("�ȳ�", 68));

		resultMap.put("3.1,5.1", new CardVO("�ȳ�", 69));
		resultMap.put("5.1,3.1", new CardVO("�ȳ�", 69));

		// �ȳ�(8,10)
		resultMap.put("8.2,10.2", new CardVO("�ȳ�", 70));
		resultMap.put("10.2,8.2", new CardVO("�ȳ�", 70));

		resultMap.put("8.2,10.1", new CardVO("�ȳ�", 71));
		resultMap.put("10.1,8.2", new CardVO("�ȳ�", 71));

		resultMap.put("8.1,10.2", new CardVO("�ȳ�", 72));
		resultMap.put("10.2,8.1", new CardVO("�ȳ�", 72));

		resultMap.put("8.1,10.1", new CardVO("�ȳ�", 73));
		resultMap.put("10.1,8.1", new CardVO("�ȳ�", 73));

		// ĥ��(1,6)
		resultMap.put("1.2,6.2", new CardVO("ĥ��", 74));
		resultMap.put("6.2,1.2", new CardVO("ĥ��", 74));

		resultMap.put("1.2,6.1", new CardVO("ĥ��", 75));
		resultMap.put("6.1,1.2", new CardVO("ĥ��", 75));

		resultMap.put("1.1,6.2", new CardVO("ĥ��", 76));
		resultMap.put("6.2,1.1", new CardVO("ĥ��", 76));

		resultMap.put("1.1,6.1", new CardVO("ĥ��", 77));
		resultMap.put("6.1,1.1", new CardVO("ĥ��", 77));

		// ĥ��(2,5)
		resultMap.put("2.2,5.2", new CardVO("ĥ��", 78));
		resultMap.put("5.2,2.2", new CardVO("ĥ��", 78));

		resultMap.put("2.2,5.1", new CardVO("ĥ��", 79));
		resultMap.put("5.1,2.2", new CardVO("ĥ��", 79));

		resultMap.put("2.1,5.2", new CardVO("ĥ��", 80));
		resultMap.put("5.2,2.1", new CardVO("ĥ��", 80));

		resultMap.put("2.1,5.1", new CardVO("ĥ��", 81));
		resultMap.put("5.1,2.1", new CardVO("ĥ��", 81));

		// ĥ��(3,4)
		resultMap.put("3.2,4.2", new CardVO("ĥ��", 82));
		resultMap.put("4.2,3.2", new CardVO("ĥ��", 82));

		resultMap.put("3.2,4.1", new CardVO("ĥ��", 83));
		resultMap.put("4.1,3.2", new CardVO("ĥ��", 83));

		resultMap.put("3.1,4.2", new CardVO("ĥ��", 84));
		resultMap.put("4.2,3.1", new CardVO("ĥ��", 84));

		resultMap.put("3.1,4.1", new CardVO("ĥ��", 85));
		resultMap.put("4.1,3.1", new CardVO("ĥ��", 85));

		// ĥ��(7,10)
		resultMap.put("7.2,10.2", new CardVO("ĥ��", 86));
		resultMap.put("10.2,7.2", new CardVO("ĥ��", 86));

		resultMap.put("7.2,10.1", new CardVO("ĥ��", 87));
		resultMap.put("10.1,7.2", new CardVO("ĥ��", 87));

		resultMap.put("7.1,10.2", new CardVO("ĥ��", 88));
		resultMap.put("10.2,7.1", new CardVO("ĥ��", 88));

		resultMap.put("7.1,10.1", new CardVO("ĥ��", 89));
		resultMap.put("10.1,7.1", new CardVO("ĥ��", 89));

		// ĥ��(8,9)
		resultMap.put("8.2,9.2", new CardVO("ĥ��", 90));
		resultMap.put("9.2,8.2", new CardVO("ĥ��", 90));

		resultMap.put("8.2,9.1", new CardVO("ĥ��", 91));
		resultMap.put("9.1,8.2", new CardVO("ĥ��", 91));

		resultMap.put("8.1,9.2", new CardVO("ĥ��", 92));
		resultMap.put("9.2,8.1", new CardVO("ĥ��", 92));

		resultMap.put("8.1,9.1", new CardVO("ĥ��", 93));
		resultMap.put("9.1,8.1", new CardVO("ĥ��", 93));

		// ����(1,5)
		resultMap.put("1.2,5.2", new CardVO("����", 94));
		resultMap.put("5.2,1.2", new CardVO("����", 94));

		resultMap.put("1.2,5.1", new CardVO("����", 95));
		resultMap.put("5.1,1.2", new CardVO("����", 95));

		resultMap.put("1.1,5.2", new CardVO("����", 96));
		resultMap.put("5.2,1.1", new CardVO("����", 96));

		resultMap.put("1.1,5.1", new CardVO("����", 97));
		resultMap.put("5.1,1.1", new CardVO("����", 97));

		// ����(2,4)
		resultMap.put("2.2,4.2", new CardVO("����", 98));
		resultMap.put("4.2,2.2", new CardVO("����", 98));

		resultMap.put("2.2,4.1", new CardVO("����", 99));
		resultMap.put("4.1,2.2", new CardVO("����", 9));

		resultMap.put("2.1,4.2", new CardVO("����", 100));
		resultMap.put("4.2,2.1", new CardVO("����", 100));

		resultMap.put("2.1,4.1", new CardVO("����", 101));
		resultMap.put("4.1,2.1", new CardVO("����", 101));

		// ����(6,10)
		resultMap.put("6.2,10.2", new CardVO("����", 102));
		resultMap.put("10.2,6.2", new CardVO("����", 102));

		resultMap.put("6.2,10.1", new CardVO("����", 103));
		resultMap.put("10.1,6.2", new CardVO("����", 103));

		resultMap.put("6.1,10.2", new CardVO("����", 104));
		resultMap.put("10.2,6.1", new CardVO("����", 104));

		resultMap.put("6.1,10.1", new CardVO("����", 105));
		resultMap.put("10.1,6.1", new CardVO("����", 105));

		// ����(7,9)
		resultMap.put("7.2,9.2", new CardVO("����", 106));
		resultMap.put("9.2,7.2", new CardVO("����", 106));

		resultMap.put("7.2,9.1", new CardVO("����", 107));
		resultMap.put("9.1,7.2", new CardVO("����", 107));

		resultMap.put("7.1,9.2", new CardVO("����", 108));
		resultMap.put("9.2,7.1", new CardVO("����", 108));

		resultMap.put("7.1,9.1", new CardVO("����", 109));
		resultMap.put("9.1,7.1", new CardVO("����", 109));

		// ����(2,3)
		resultMap.put("2.2,3.2", new CardVO("����", 110));
		resultMap.put("3.2,2.2", new CardVO("����", 110));

		resultMap.put("2.2,3.1", new CardVO("����", 111));
		resultMap.put("3.1,2.2", new CardVO("����", 111));

		resultMap.put("2.1,3.2", new CardVO("����", 112));
		resultMap.put("3.2,2.1", new CardVO("����", 112));

		resultMap.put("2.1,3.1", new CardVO("����", 113));
		resultMap.put("3.1,2.1", new CardVO("����", 113));

		// ����(5,10)
		resultMap.put("5.2,10.2", new CardVO("����", 114));
		resultMap.put("10.2,5.2", new CardVO("����", 114));

		resultMap.put("5.2,10.1", new CardVO("����", 115));
		resultMap.put("10.1,5.2", new CardVO("����", 115));

		resultMap.put("5.1,10.2", new CardVO("����", 116));
		resultMap.put("10.2,5.1", new CardVO("����", 116));

		resultMap.put("5.1,10.1", new CardVO("����", 117));
		resultMap.put("10.1,5.1", new CardVO("����", 117));

		// ����(6,9)
		resultMap.put("6.2,9.2", new CardVO("����", 118));
		resultMap.put("9.2,6.2", new CardVO("����", 118));

		resultMap.put("6.2,9.1", new CardVO("����", 119));
		resultMap.put("9.1,6.2", new CardVO("����", 119));

		resultMap.put("6.1,9.2", new CardVO("����", 120));
		resultMap.put("9.2,6.1", new CardVO("����", 120));

		resultMap.put("6.1,9.1", new CardVO("����", 121));
		resultMap.put("9.1,6.1", new CardVO("����", 121));

		// ����(7,8)
		resultMap.put("7.2,8.2", new CardVO("����", 122));
		resultMap.put("8.2,7.2", new CardVO("����", 122));

		resultMap.put("7.2,8.1", new CardVO("����", 123));
		resultMap.put("8.1,7.2", new CardVO("����", 123));

		resultMap.put("7.1,8.2", new CardVO("����", 124));
		resultMap.put("8.2,7.1", new CardVO("����", 124));

		resultMap.put("7.1,8.1", new CardVO("����", 125));
		resultMap.put("8.1,7.1", new CardVO("����", 125));

		// �糡(1,3)
		// resultMap.put("1.2,3.2", new CardVO("�糡", 126));
		// resultMap.put("3.2,1.2", new CardVO("�糡", 126));

		resultMap.put("1.2,3.1", new CardVO("�糡", 127));
		resultMap.put("3.1,1.2", new CardVO("�糡", 127));

		resultMap.put("1.1,3.2", new CardVO("�糡", 128));
		resultMap.put("3.2,1.1", new CardVO("�糡", 128));

		resultMap.put("1.1,3.1", new CardVO("�糡", 129));
		resultMap.put("3.1,1.1", new CardVO("�糡", 129));

		// �糡(5,9)
		resultMap.put("5.2,9.2", new CardVO("�糡", 130));
		resultMap.put("9.2,5.2", new CardVO("�糡", 130));

		resultMap.put("5.2,9.1", new CardVO("�糡", 131));
		resultMap.put("9.1,5.2", new CardVO("�糡", 131));

		resultMap.put("5.1,9.2", new CardVO("�糡", 132));
		resultMap.put("9.2,5.1", new CardVO("�糡", 132));

		resultMap.put("5.1,9.1", new CardVO("�糡", 133));
		resultMap.put("9.1,5.1", new CardVO("�糡", 133));

		// �糡(6,8)
		resultMap.put("6.2,8.2", new CardVO("�糡", 134));
		resultMap.put("8.2,6.2", new CardVO("�糡", 134));

		resultMap.put("6.2,8.1", new CardVO("�糡", 135));
		resultMap.put("8.1,6.2", new CardVO("�糡", 135));

		resultMap.put("6.1,8.2", new CardVO("�糡", 136));
		resultMap.put("8.2,6.1", new CardVO("�糡", 136));

		resultMap.put("6.1,8.1", new CardVO("�糡", 137));
		resultMap.put("8.1,6.1", new CardVO("�糡", 137));

		// 3��(3,10)
		resultMap.put("3.2,10.2", new CardVO("�ﳡ", 138));
		resultMap.put("10.2,3.2", new CardVO("�ﳡ", 138));

		resultMap.put("3.2,10.1", new CardVO("�ﳡ", 139));
		resultMap.put("10.1,3.2", new CardVO("�ﳡ", 139));

		resultMap.put("3.1,10.2", new CardVO("�ﳡ", 140));
		resultMap.put("10.2,3.1", new CardVO("�ﳡ", 140));

		resultMap.put("3.1,10.1", new CardVO("�ﳡ", 141));
		resultMap.put("10.1,3.1", new CardVO("�ﳡ", 141));

		// 3��(4,9)
		resultMap.put("4.2,9.2", new CardVO("�ﳡ", 142));
		resultMap.put("9.2,4.2", new CardVO("�ﳡ", 142));

		resultMap.put("4.2,9.1", new CardVO("�ﳡ", 143));
		resultMap.put("9.1,4.2", new CardVO("�ﳡ", 143));

		resultMap.put("4.1,9.2", new CardVO("�ﳡ", 144));
		resultMap.put("9.2,4.1", new CardVO("�ﳡ", 144));

		resultMap.put("4.1,9.1", new CardVO("�ﳡ", 145));
		resultMap.put("9.1,4.1", new CardVO("�ﳡ", 145));

		// 3��(5,8)
		resultMap.put("5.2,8.2", new CardVO("�ﳡ", 146));
		resultMap.put("8.2,5.2", new CardVO("�ﳡ", 146));

		resultMap.put("5.2,8.1", new CardVO("�ﳡ", 147));
		resultMap.put("8.1,5.2", new CardVO("�ﳡ", 147));

		resultMap.put("5.1,8.2", new CardVO("�ﳡ", 148));
		resultMap.put("8.2,5.1", new CardVO("�ﳡ", 148));

		resultMap.put("5.1,8.1", new CardVO("�ﳡ", 149));
		resultMap.put("8.1,5.1", new CardVO("�ﳡ", 149));

		// 3��(6,7)
		resultMap.put("6.2,7.2", new CardVO("�ﳡ", 150));
		resultMap.put("7.2,6.2", new CardVO("�ﳡ", 150));

		resultMap.put("6.2,7.1", new CardVO("�ﳡ", 151));
		resultMap.put("7.1,6.2", new CardVO("�ﳡ", 151));

		resultMap.put("6.1,7.2", new CardVO("�ﳡ", 152));
		resultMap.put("7.2,6.1", new CardVO("�ﳡ", 152));

		resultMap.put("6.1,7.1", new CardVO("�ﳡ", 153));
		resultMap.put("7.1,6.1", new CardVO("�ﳡ", 153));

		// 2��(2,10)
		resultMap.put("2.2,10.2", new CardVO("�̳�", 154));
		resultMap.put("10.2,2.2", new CardVO("�̳�", 154));

		resultMap.put("2.2,10.1", new CardVO("�̳�", 155));
		resultMap.put("10.1,2.2", new CardVO("�̳�", 155));

		resultMap.put("2.1,10.2", new CardVO("�̳�", 156));
		resultMap.put("10.2,2.1", new CardVO("�̳�", 156));

		resultMap.put("2.1,10.1", new CardVO("�̳�", 157));
		resultMap.put("10.1,2.1", new CardVO("�̳�", 157));

		// 2��(3,9)
		resultMap.put("3.2,9.2", new CardVO("�̳�", 158));
		resultMap.put("9.2,3.2", new CardVO("�̳�", 158));

		resultMap.put("3.2,9.1", new CardVO("�̳�", 159));
		resultMap.put("9.1,3.2", new CardVO("�̳�", 159));

		resultMap.put("3.1,9.2", new CardVO("�̳�", 160));
		resultMap.put("9.2,3.1", new CardVO("�̳�", 160));

		resultMap.put("3.1,9.1", new CardVO("�̳�", 161));
		resultMap.put("9.1,3.1", new CardVO("�̳�", 161));

		// 2��(4,8)
		resultMap.put("4.2,8.2", new CardVO("�̳�", 162));
		resultMap.put("8.2,4.2", new CardVO("�̳�", 162));

		resultMap.put("4.2,8.1", new CardVO("�̳�", 163));
		resultMap.put("8.1,4.2", new CardVO("�̳�", 163));

		resultMap.put("4.1,8.2", new CardVO("�̳�", 164));
		resultMap.put("8.2,4.1", new CardVO("�̳�", 164));

		resultMap.put("4.1,8.1", new CardVO("�̳�", 165));
		resultMap.put("8.1,4.1", new CardVO("�̳�", 165));

		// 2��(5,7)
		resultMap.put("5.2,7.2", new CardVO("�̳�", 166));
		resultMap.put("7.2,5.2", new CardVO("�̳�", 166));

		resultMap.put("5.2,7.1", new CardVO("�̳�", 167));
		resultMap.put("7.1,5.2", new CardVO("�̳�", 167));

		resultMap.put("5.1,7.2", new CardVO("�̳�", 168));
		resultMap.put("7.2,5.1", new CardVO("�̳�", 168));

		resultMap.put("5.1,7.1", new CardVO("�̳�", 169));
		resultMap.put("7.1,5.1", new CardVO("�̳�", 169));

		// 1��(2,9)
		resultMap.put("2.2,9.2", new CardVO("�ϳ�", 170));
		resultMap.put("9.2,2.2", new CardVO("�ϳ�", 170));

		resultMap.put("2.2,9.1", new CardVO("�ϳ�", 171));
		resultMap.put("9.1,2.2", new CardVO("�ϳ�", 171));

		resultMap.put("2.1,9.2", new CardVO("�ϳ�", 172));
		resultMap.put("9.2,2.1", new CardVO("�ϳ�", 172));

		resultMap.put("2.1,9.1", new CardVO("�ϳ�", 173));
		resultMap.put("9.1,2.1", new CardVO("�ϳ�", 173));

		// 1��(3,8)
		// resultMap.put("3.2,8.2", new CardVO("�ϳ�", 174));
		// resultMap.put("8.2,3.2", new CardVO("�ϳ�", 174));

		resultMap.put("3.2,8.1", new CardVO("�ϳ�", 175));
		resultMap.put("8.1,3.2", new CardVO("�ϳ�", 175));

		resultMap.put("3.1,8.2", new CardVO("�ϳ�", 176));
		resultMap.put("8.2,3.1", new CardVO("�ϳ�", 176));

		resultMap.put("3.1,8.1", new CardVO("�ϳ�", 177));
		resultMap.put("8.1,3.1", new CardVO("�ϳ�", 177));

		// 1��(4,7)
		resultMap.put("4.2,7.2", new CardVO("�ϳ�", 178));
		resultMap.put("7.2,4.2", new CardVO("�ϳ�", 178));

		resultMap.put("4.2,7.1", new CardVO("�ϳ�", 179));
		resultMap.put("7.1,4.2", new CardVO("�ϳ�", 179));

		resultMap.put("4.1,7.2", new CardVO("�ϳ�", 180));
		resultMap.put("7.2,4.1", new CardVO("�ϳ�", 180));

		resultMap.put("4.1,7.1", new CardVO("�ϳ�", 181));
		resultMap.put("7.1,4.1", new CardVO("�ϳ�", 181));

		// 1��(5,6)
		resultMap.put("5.2,6.2", new CardVO("�ϳ�", 182));
		resultMap.put("6.2,5.2", new CardVO("�ϳ�", 182));

		resultMap.put("5.2,6.1", new CardVO("�ϳ�", 183));
		resultMap.put("6.1,5.2", new CardVO("�ϳ�", 183));

		resultMap.put("5.1,6.2", new CardVO("�ϳ�", 184));
		resultMap.put("6.2,5.1", new CardVO("�ϳ�", 184));

		resultMap.put("5.1,6.1", new CardVO("�ϳ�", 185));
		resultMap.put("6.1,5.1", new CardVO("�ϳ�", 185));

		// ����(2,8)
		resultMap.put("2.2,8.2", new CardVO("����", 186));
		resultMap.put("8.2,2.2", new CardVO("����", 186));

		resultMap.put("2.2,8.1", new CardVO("����", 187));
		resultMap.put("8.1,2.2", new CardVO("����", 187));

		resultMap.put("2.1,8.2", new CardVO("����", 188));
		resultMap.put("8.2,2.1", new CardVO("����", 188));

		resultMap.put("2.1,8.1", new CardVO("����", 189));
		resultMap.put("8.1,2.1", new CardVO("����", 189));

		// ����(3,7)
		resultMap.put("3.2,7.2", new CardVO("����", 190));
		resultMap.put("7.2,3.2", new CardVO("����", 190));

		resultMap.put("3.2,7.1", new CardVO("����", 191));
		resultMap.put("7.1,3.2", new CardVO("����", 191));

		resultMap.put("3.1,7.2", new CardVO("����", 192));
		resultMap.put("7.2,3.1", new CardVO("����", 192));

		resultMap.put("3.1,7.1", new CardVO("����", 193));
		resultMap.put("7.1,3.1", new CardVO("����", 193));

	}

	public static class CardVO {
		String value;
		int rank;

		CardVO(String value, int rank) {
			this.value = value;
			this.rank = rank;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}

	}

}
