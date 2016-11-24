package exercise;

public class AreaAndPerimeterOfCircle {

	public static void main(String[] args) {
		double radius;
		double perimeter;
		double area;
		
		radius = 5.5;
		perimeter = 2 * radius * Math.PI;
		area = radius * radius * Math.PI;
		
		System.out.println(perimeter);
		System.out.println(area);
	}
}
