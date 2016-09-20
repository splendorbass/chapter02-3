package bit2016.paint;

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
		
		Shape rectangle = new Rectangle();
		rectangle.draw();
		
		Shape circle = new Circle();
		//circle.draw();
		draw(circle);
		
		Shape triangle = new Triangle();
		triangle.draw();
		
		draw( new Pentagon() );

	}
	
	public static void draw( Shape shape ){
		shape.draw();
		
	}

}
