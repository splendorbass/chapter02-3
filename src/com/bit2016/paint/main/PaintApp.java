package com.bit2016.paint.main;

import com.bit2016.paint.i.Drawable;
import com.bit2016.paint.i.Resizable;
import com.bit2016.paint.point.ColorPoint;
import com.bit2016.paint.point.Point;
import com.bit2016.paint.shape.Circle;
import com.bit2016.paint.shape.Rectangle;
import com.bit2016.paint.shape.Shape;
import com.bit2016.paint.shape.Triangle;

public class PaintApp {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX(100);
		point.setY(1000);
		point.show();
		
		
		Point point2 = new Point(200 , 200);
		point2.show(true);
		point2.show(false);
		
		
		Point point3 = new ColorPoint(50, 50, "red");
		point3.show();
		point3.show(false);
		point3.show(true);
		
		Drawable rectangle = new Rectangle();
		draw( rectangle );
		draw( new Circle() );
		draw( new Triangle() );
		draw( new Rectangle() );
		
		draw( new ColorPoint(200,100,"white") );
		
		
		resize( new Circle( 10 ) );
		
		// instanceof test
		Circle c10 = new Circle();
		System.out.println( c10 instanceof Circle );
		// 오류 instanceof 는 상속관계에 있는 클래스만 확인할 수 있다.
		//System.out.println( c10 instanceof Rectangle );
		System.out.println( c10 instanceof Shape );
		
		// instanceof는 모든 인터페이스에 구현관계를 확인할수 있다.
		System.out.println( c10 instanceof Drawable );
		System.out.println( c10 instanceof Resizable );
		
		Rectangle rect = new Rectangle();
		System.out.println( rect instanceof Rectangle );
		System.out.println( rect instanceof Shape );
		System.out.println( rect instanceof Drawable );
		System.out.println( rect instanceof Resizable );
		
		resize2( new Rectangle() );
		
//		Shape circle = new Circle();
//		//circle.draw();
//		draw(circle);
//		
//		Shape triangle = new Triangle();
//		triangle.draw();
//		
//		draw( new Pentagon() );

	}
	
	public static void draw( Drawable drawable ){
		drawable.draw();
		
	}
	public static void resize2( Drawable drawable ){
		if( drawable instanceof Resizable == false){
			return;
		}
		Resizable re = (Resizable)drawable;
		re.resize( 0.8 );
	}
	
	public static void resize( Resizable resizable){
		Shape shape = (Shape)resizable;
		double area = shape.calculateArea();
		System.out.println(area);
		
		resizable.resize(0.5);
	}
	
//	public static void draw( Shape shape ){
//		shape.draw();
//		
//	}

}
