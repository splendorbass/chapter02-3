package bit2016.goodsman.data;

public class Customer {
	public String name;
	protected String phone;
	private String email;
	
	
	void setName(){
		name = "도우넛";
		phone = "000-0000-0000";
		//private은 자기 안에서 접근 가능
		email = "asdfkjh@gmail.com";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
