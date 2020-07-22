package PPS1;

public class problem13 {

	public static void main(String[] args) {
		int arr[]= {23,89,90,12,34};
		int key=283;
		boolean res= search(arr,key);
		System.out.println(res);

	}
	static boolean search(int[] arr,int key)
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				flag= true;
			}
		}
		return flag;
	}
}
