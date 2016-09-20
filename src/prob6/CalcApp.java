package prob6;

import java.util.Scanner;


public class CalcApp {

	public static void main(String[] args) {
		// Scanner 와  String 클래스의 split 함수를 사용합니다.
		Scanner scanner = new Scanner( System.in );
		while(true){
		
			System.out.print( ">>" );
		
			String expression = scanner.nextLine();
			if("quit".equals(expression) == true){
				break;
			}
			
			String[] tokens = expression.split(" ");
		
			int lValue = Integer.parseInt(tokens[0]);
			String operator = tokens[1];
			int rValue = Integer.parseInt(tokens[2]);
		
			Arith arith = null;
			switch(operator){
				case "+":
					arith = new Add();
					break;
				case "-":
					arith = new Sub();					
					break;
				case "*":
					arith = new Mul();					
					break;
				case "/":
					arith = new Div();
					break;
			}
			arith.setValue(lValue, rValue);
			
			int result = arith.calculate();
			System.out.println(">> "+result);
				
		}
		
		scanner.close();

	}

}
