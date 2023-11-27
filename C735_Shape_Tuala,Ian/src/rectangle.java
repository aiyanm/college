import java.lang.Math.*;

public class rectangle extends shapes{

	double l,w;
	
	public rectangle(double l,double w) {
		this.l = l;
		this.w = w;
	}
	@Override
	double CalculateArea() {
		// TODO Auto-generated method stub
		return l * w;
	}

	@Override
	double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*(l+w);
	}
}
