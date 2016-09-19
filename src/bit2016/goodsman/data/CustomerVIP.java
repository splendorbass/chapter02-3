package bit2016.goodsman.data;

public class CustomerVIP extends Customer {
	void setName(){
		// public은 자식 패키지에서 접근 가능
		name = "둘리";
		
		// protected는 자식에서 접근 O
		phone = "010-4761-6934";
		
		//private은 자식에서 접근 X
		//email = "sdfkjh@gmail.com";
		
	}

}
