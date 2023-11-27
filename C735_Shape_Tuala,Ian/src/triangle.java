import java.lang.Math.*;

public class triangle extends shapes{

	double a,b,c;
	
	public triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	double CalculateArea() {
		 double s = (a + b + c) / 2;
	     return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return a + b + c;
	}
}
