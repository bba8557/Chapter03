package com.javaex.ex05;

public class Rectangle {

	//필드
	private int width;
	private int height;
	
	
	//생성자
	public Rectangle() {
		
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	//메소드 - gs
	//=================get==============
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	//=================set==============
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	//메소드 - 일반
		@Override
		public String toString() {
			return "Point [width=" + width + ", height=" + height + "]";
		}
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		if((this.width*this.height) == (r.width*r.height)) {
			return true;
		}else {
			return false;
		}
	}
}
