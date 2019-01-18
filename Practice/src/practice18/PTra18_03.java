/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> playerlist = new ArrayList<Player>();
		File file = new File("file/BestElevenCandidate.csv");
		try (Scanner scanner = new Scanner(file)) {
			//scannerインスタンスがhasNextメソッド（次にデータがある）を実行=true
			while (scanner.hasNext()) {
				///nextLineの戻り値をiiiに格納⇨1行そのまま格納されてる
				String iii = scanner.nextLine();
				String[] splitArray = iii.split(",");
				Player player1 = new Player();

				player1.setPosition(splitArray[0]);
				player1.setName(splitArray[1]);
				player1.setCountry(splitArray[2]);
				player1.setTeam(splitArray[3]);

				playerlist.add(player1);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}
		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		//splitArray[2]配列に"上記"があった場合に、それを含むplaylistのみを消すよ


		for(int i = playerlist.size() - 1;i >= 0 ;i--) {
			if(playerlist.get(i).getTeam().equals("レアル・マドリード") || playerlist.get(i).getTeam().equals("バルセロナ")){
				playerlist.remove(i);
			}
		}

		// ★ 削除後のArrayListの中身を全件出力してください
		for(Player alllist2:playerlist) {
			System.out.println(alllist2);
		}
	}
}
