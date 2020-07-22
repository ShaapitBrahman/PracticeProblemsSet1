package PPS1;
import java.util.*;
public class problem7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 3 numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int res=getMax(num1,num2,num3);
		System.out.println("Greatest number among the 3 numbers is :"+ res);
		sc.close();
	}
	static int getMax(int a,int b,int c)
	{
		int temp=a>b?a:b;
		temp=temp>c?temp:c;
		return temp;	
	}
}