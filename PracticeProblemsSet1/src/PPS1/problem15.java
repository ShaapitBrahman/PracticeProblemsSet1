package PPS1;
import java.util.*;
public class problem15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter one by one the Array Elements to be sorted : ");
		for(int i=0;i<n;i++) {
		nums[i]= sc.nextInt();
		}
		i_sort(nums);
		sc.close();
	}
	private static void i_sort(int[] nums) {
		for(int i=1;i<nums.length;i++)
		{
			int value=nums[i];
			int j=i-1;
			while(j>=0 && nums[j]>value)
			{
				nums[j+1]=nums[j];
				j=j-1;
			}
			nums[j+1]=value;
		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]+" ");
		}
	}
}
