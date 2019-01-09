package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */


		Car car1 = new Car();
		car1.color = "Red";
		car1.gasoline = 100;

		Car car2 = new Car();
		car2.color = "Blue";
		car2.gasoline = 1000;

		Car car3 = new Car();
		car3.color = "Green";
		car3.gasoline = 10;

		final int distance = 300;

		int progress1 = 0;
		for(int time = 1; car1.gasoline>0; time++ ) {
			progress1 += car1.run();

			if (car1.gasoline == 0) {
				System.out.println("目的地に到達できませんでした");

			}else if(distance <= progress1) {
				System.out.println("目的地にまで" + time+ "時間かかりました。残りのガソリンは、" + (car1.gasoline)+ "リットルです");
				break;
			}
		}

		int progress2 = 0;

		for(int time = 1; car2.gasoline>0; time++ ) {
			progress2 += car2.run();


			if (car2.gasoline == 0) {
				System.out.println("目的地に到達できませんでした");

			}else if(distance <= progress2) {
				System.out.println("目的地にまで" + time+ "時間かかりました。残りのガソリンは、" + (car2.gasoline)+ "リットルです");
				break;
			}
		}


		int progress3 = 0;
		for(int time = 1; car3.gasoline>0; time++ ) {
			progress3 += car3.run();

			if (car3.gasoline == 0) {
				System.out.println("目的地に到達できませんでした");

			}else if(distance <= progress3) {
				System.out.println("目的地にまで" + time+ "時間かかりました。残りのガソリンは、" + (car3.gasoline)+ "リットルです");
				break;
			}
		}


	}
}
