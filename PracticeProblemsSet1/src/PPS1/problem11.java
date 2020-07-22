package PPS1;
import java.util.Scanner;
public class problem11 {

	public static void main(String[] args) {
		int l,b,r,a;
		float area=(float)0.00;
		System.out.println("Enter The Shape of your choice Circle,Square or Triangle :");
		Scanner sc = new Scanner(System.in);
        String Shape = sc.nextLine();
        switch(Shape) {
        case "Triangle":
        	System.out.println("Enter The Height & Base of the Triangle :");
        	l=sc.nextInt();
        	b=sc.nextInt();
        	area=(float)l*b;
        	break;
        case "Square":
        	System.out.println("Enter The Side Length of the Square :");
        	a=sc.nextInt();
        	area=(float)a*a;
        	break;
        case "Circle":
        	System.out.println("Enter The Radius Of the Circle :");
        	r=sc.nextInt();
        	area=(float)(3.14*r*r);
        	break;
        	default:System.out.println("You Entered Wrong Shape");
        }
        if((float)area>0.0) {
        	System.out.print("The Area Is :");
        	System.out.println(area);
        }
        sc.close();
	}

}
