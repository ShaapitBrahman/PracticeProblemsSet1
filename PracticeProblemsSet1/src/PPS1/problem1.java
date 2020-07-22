package PPS1;
import java.util.Scanner;
public class problem1 {
	public static int factorial(int num) 
	{
		int res=1;
		while(num!=1) {
			res*=num;
			num--;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,res;
		System.out.println("Enter the number :");
		number=sc.nextInt();
		res=factorial(number);
		System.out.println("Factorial of " + number + " is : "+ res);
        sc.close();
	}

}