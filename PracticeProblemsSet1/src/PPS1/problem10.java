package PPS1;
import java.util.*;
public class problem10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower and upper range within which you want to check the prime numbers");
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		getPrimes(r1,r2);
        sc.close();
	}
	public static void getPrimes(int r1,int r2)
	{
		int flag;
		int arr[]=new int[r2-r1],count=0,k=0;
		while(r1<r2)
		{
			flag=0;
		for(int i=2;i<=r1/2;i++)
		{
			if(r1%i==0)
			{
				flag=1;
				break;
			}
		}
			if(flag==0 && (r1>1))
			{
				arr[k]=r1;
				k++;
				count++;	  
			}	
			r1++;
			}
		System.out.println("The Prime Numbers within the given range are :");
		for(int i=0;i<count;i++)
		{
			if(i==count-1)
			{
				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i]+",");
			}
		}
	}
}
