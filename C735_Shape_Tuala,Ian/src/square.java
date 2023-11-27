import java.lang.Math.*;

public class square extends shapes{

	double sides;
	
	public square(double sides) {
		this.sides = sides;
	}
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		return sides * sides;
	}

	@Override
	double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 4 * sides;
	}
	
}
