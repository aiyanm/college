
public class test {

	public static void main (String a[]) {
		
	    square s = new square(5);
	    circle c = new circle(12);
	    rectangle r = new rectangle(10,10);
	    triangle t = new triangle(5,5,5);
	
	    System.out.println("Area of Square: " + s.CalculateArea());
	    System.out.println("Perimeter of Square: " + s.CalculatePerimeter());
	    System.out.println();
	    
	    System.out.println("Area of circle: " + c.CalculateArea());
	    System.out.println("Perimeter of circle: " + c.CalculatePerimeter());
	    System.out.println();
	    
	    System.out.println("Area of rectangle: " + r.CalculateArea());
	    System.out.println("Perimeter of rectangle: " + r.CalculatePerimeter());
	    System.out.println();
	    
	    System.out.println("Area of triangle: " + t.CalculateArea());
	    System.out.println("Perimeter of triangle: " + t.CalculatePerimeter());
	    System.out.println();
	    
	}
}
