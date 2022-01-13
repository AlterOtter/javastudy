package prob6;

public class RectTriangle extends Shape {
	private double width=0;
	private double height=0;
	
	public RectTriangle(double w, double h) {
		width=w;
		height=h;
	}
	@Override
	public double getArea() {
		return (height*width)/2;
			
	}
	@Override
	public double getPerimeter() {
		double temp = Math.sqrt(Math.pow(width, 2)+Math.pow(height,2));
		return temp+height+width;

	}

}
