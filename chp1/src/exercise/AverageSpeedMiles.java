package exercise;

public class AverageSpeedMiles {

	public static void main(String[] args) {
		double hours;
		double miles;
		double average;
		
		hours = (45 * 60 + 30) / 3600.0;
		miles = 14 / 1.6;
		average = miles / hours;
		System.out.println(average);
	}
}
