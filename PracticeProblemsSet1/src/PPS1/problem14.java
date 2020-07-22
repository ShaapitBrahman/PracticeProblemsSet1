package PPS1;
import java.util.Scanner;
public class problem14 {

	public static void main(String[] args) {
		int arr[]= {33,108,786,8008,9431};
		String names[]= new String[]{"rishabh","sushmi","vineet"};
		int key=109;
		String name="sushmi";
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Binary search for integers \n2.Binary search for strings \n3.exit \n");
			System.out.println("Enter your choice :");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println(findElement(arr,key));break;
			case 2:System.out.println(findString(names,name));break;
			case 3:System.exit(0);
			}
		}while(ch!=3);
        sc.close();
	}
	public static boolean findElement(int arr[],int key)
	{
		int l=0,r=arr.length-1,mid;
		while(l<=r)
		{
			mid=(l+r)/2;
			if(arr[mid]==key)
				return true;
			if(arr[mid]<key)
			{
				l=mid+1;
			}
			else
				r=mid-1;
		}
		return false;
	}
	public static boolean findString(String names[],String name)
	{
		int l=0,r=names.length-1,mid;
		while(l<=r)
		{
			mid=(l+r)/2;
			int found=name.compareTo(names[mid]);
			if(found==1)
				 return true;
			if(found>0)
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
		}
		return false;
	}
}
