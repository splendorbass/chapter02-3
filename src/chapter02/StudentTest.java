package chapter02;

public class StudentTest {

	public static void main(String[] args) {
		Person p = new Student();
		
		Person p2 = new Student( 10 );
		
//		Student s = new Student();
//		Person p3 = s;
		Person p3 = new Student();
		
		Student s = (Student)p3; //down casting 명시적(explicit) 캐스팅을 해야 한다
		Person p4 = s;
	}

}
