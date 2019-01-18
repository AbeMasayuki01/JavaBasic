/*
 * PTra18_02.java
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

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		//fileクラスを使ってパスを呼び出し
        ArrayList<Player> playerlist = new ArrayList<Player>();
		File file = new File("file/BestElevenCandidate.csv");
		 try(Scanner scanner = new Scanner(file)){
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
	     }catch(FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	       }


		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう

		 //イテレータを使って拡張for文で全出力する
		 for(Player alllist: playerlist) {
			 System.out.println(alllist.toString());

		 }
	}
}
