package com.bit2016.paint.shape;

public abstract class Shape {
	private String fillColor;
	private String lineColor;
	
	public Shape(){
	}
	
	public Shape( String fillColor, String lineColor){
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public abstract double calculateArea();
}
