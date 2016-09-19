package chapter02;

public class ArrayUtilTest {

	public static void main(String[] args) {
		
		// int 배열을 double 배열로 변환
		int[] arrayInt = { 10, 20, 30, 40, 50 };
		double[] arrayDouble = ArrayUtil.intToDouble(arrayInt);
		
		for( int i =0 ; i < arrayDouble.length; i++){
			System.out.println(arrayDouble[i]);
		}
		
		// double 배열을 int 배열로 변환
		double[] arrayDouble2 = { 10.1, 20.2 , 30.3, 40.4, 50.5 };
		int[] arrayInt2 = ArrayUtil.doubleToInt(arrayDouble2);
		
		for(int i = 0 ; i < arrayInt2.length; i++){
			System.out.println(arrayInt2[i]);
		}
		
		// int 배열 두 개를 연결한 새로운 배열 리턴
		int[] arrayInt_1 = { 1,2,3 };
		int[] arrayInt_2 = { 4,5,6 };
		
		
		int[] arrayInt_3 = ArrayUtil.concat(arrayInt_1, arrayInt_2);

	
		
		for( int i = 0; i < arrayInt_3.length ; i++){
			System.out.println(arrayInt_3[i]);
		}
	}

}
