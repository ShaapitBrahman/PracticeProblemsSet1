package PPS1;
import java.util.*;
public class problem2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		n = sc.nextInt();
	        for(int i=1;i<=12;i++)
	        {
	            System.out.println(n+ " x " +i+ " = "+ (n*i));
	        }
        sc.close();
	}

}
