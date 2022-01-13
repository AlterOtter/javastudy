package prob6;

import java.io.IOException;
import java.nio.CharBuffer;

public class Rectangle extends Shape implements Resizable {
	double width=0;
	double height=0;
	
	public Rectangle(double w, double h) {
		width=w;
		height=h;
	}
	@Override
	public double getArea() {
		return (height*width);
			
	}
	@Override
	public double getPerimeter() {
	
		return (height+width)*2
				;

	}
	@Override
	public void resize(double s) {
		this.width=this.width*s;
		this.height=this.height*s;
	}


}
