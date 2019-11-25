/* Author : Saakshi 
 Programm to accept values and calculate the area of the floor and the flooring material required...*/
import java.util.Scanner;
class floorplan
{       
	public static final double wasterate= 10.0;
	//Main
	public static void main (String[] p)
	{        
		double length= inl();
		double width= inw();
		double arm= (length*width)/ 10000.0; //arm= area in meters
		print("Area of the floor = " + arm+"m^2");
		double waste=  (wasterate/100.0)*arm;
		double arinw= (int) ((arm + waste)*10.0);
		double arinwaste= arinw/10.0;
		print("The extra you need for wastage is " + waste + " m^2");
		print("The total area of the flooring material required is "+ arinwaste+" m^2");

		System.exit(0);
	}

	//Method to accept the length
	public static double inl()
	{
		String d;
		double x;
		Scanner scanner = new Scanner(System.in);
		print ("Please enter the length of the floor in centimeteres");
		d= scanner.nextLine();
		x= Double.parseDouble(d);
		return x;
	}

	// to input width
	public static double inw()
	{
		double wi;
		Scanner scanner= new Scanner(System.in);
		print("Please enter the width of the floor in centimeters");
		wi= Double.parseDouble(scanner.nextLine());
		return wi;
	}

	// to print
	public static void print(String s)
	{ System.out.println(s);}
}
 
