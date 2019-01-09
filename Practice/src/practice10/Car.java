package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline =1;

	int run() {
		this.gasoline -= 1;


		if(gasoline <0) {
			return -1;

		}else {
			int go = new java.util.Random().nextInt(15)+1;

		return go;
		}


	}


}
