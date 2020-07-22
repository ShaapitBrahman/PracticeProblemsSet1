package PPS1;

public class problem4 {
public static void arraySum(int[] n) {
	int sum = 0;
	for(int i=0;i<n.length;i++)
	{
		sum=sum+n[i];
	}
	System.out.println("Sum of array elements is "+ sum);
}
	public static void main(String[] args) {
		int a[]= {119,81,53,497,435};
		arraySum(a);
	}

}
