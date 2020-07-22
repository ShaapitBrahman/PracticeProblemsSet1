package PPS1;
import java.util.*;
public class problem8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to reverse ");
		int num=sc.nextInt();
		int rev= numReverse(num);
		System.out.println("Reverse of "+ num + " is : "+ rev);
        sc.close();
	}
	public static int numReverse(int num)
	{
		int temp=num,rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			temp=temp/10;
			rev=rev*10+rem;	
		}
		return rev;
	}
}
