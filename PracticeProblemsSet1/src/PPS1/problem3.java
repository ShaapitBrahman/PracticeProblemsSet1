package PPS1;
import java.util.*;
public class problem3 {

	public static void hailStone(int n) {
		int k=0,temp ;
		while(n!=1)
		{
			k++;
			if(n%2!=0)
			{
				System.out.println(n +" is odd so I make 3n+1 :"+ ((n*3)+1));
				temp=(n*3)+1;	
			}
			else
			{
				System.out.println(n +" is even so I take half :" + (n/2));
				temp=n/2;
			}
			n=temp;
		}
		System.out.println("There are total "+ k + " steps to reach 1");

	}
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A Number to get the hailstone sequence");
	n=sc.nextInt();
	hailStone(n);
	sc.close();
}
}
