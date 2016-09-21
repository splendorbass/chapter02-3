package com.bit2016.paint.point;

public class Point {
	private int x;
	private int y;
	
	
	public Point(){
	}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("객체 생성");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show(){
		System.out.println("점[x="+x+",y="+y+"]을 그렸습니다.");
	}
	
	public void show(boolean visible){
		if( visible == true){
			show();
		} else {
			System.out.println("점[x="+x+",y="+y+"]을 지웠습니다.");
		}
	}
}