package practice14.common;

public class JavaCourse implements practice14.common.Course {

	public String PREFIX = "【Eラーニング】Java";
	public String[] CourseUnit= {"式と演算,制御構文,メソッド,配列,オブジェクト指向,継承,高度な継承"};



	public String getCourseName(){
	return PREFIX;
	}


	public String[] getCourseUnit(){
	return CourseUnit;


	}
}
