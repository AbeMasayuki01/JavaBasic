package practice14.common;

public class DBCourse implements practice14.common.Course {

	public String PREFIX = "【Eラーニング】DB基礎";
	public String[] CourseUnit= {"DB基礎,SQL基礎,正規化,SQL応用"};

	public String getCourseName(){
	return PREFIX;
	}

	public String[] getCourseUnit(){
		return CourseUnit;

	}


}
