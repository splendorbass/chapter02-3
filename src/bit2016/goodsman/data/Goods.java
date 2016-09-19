package bit2016.goodsman.data;

public class Goods {
	public Goods(){
		System.out.println("생성자 호출");
		count++;
	}
	public static int count;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;


	
	public String getName() {
		return name;
	}
	//return 값이 없고 매개변수 (parameter)가 있는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	//return 값이 있고 매개변수 (parameter) 가 없는 메소드
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		// 정보 보호
		if( price < 0){
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	//return 값과 매개변수(parameter)가 없는 메소드
	public void showInfo(){
		System.out.println(
				"name" + name + 
				", price=" + price + 
				", countStock=" + countStock + 
				", countSold=" + countSold );
	}
	
	//return 값과 매개변수(parameter)가 모두 있는 메소드
	public int calcDiscountPrice(double rate){
		int discountPrice = (int)(price * rate);
		return discountPrice;
	}
	
	
		
}
