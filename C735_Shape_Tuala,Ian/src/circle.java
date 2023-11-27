import java.lang.Math.*;

public class circle extends shapes {

	double rad;

	public circle(double rad) {
		this.rad = rad;
	}

	@Override
	double CalculateArea() {
		// TODO Auto-generated method stub
		return Math.PI *(rad*2);
	}

	@Override
	double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*(Math.PI *(rad));
	}

	 
}
