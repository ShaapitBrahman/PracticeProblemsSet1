package PPS1;

public class problem12 {
public static void bubbleSort(int arr[]) {
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=1;j<arr.length-i;j++)
		{
			if(arr[j-1]>arr[j])
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) 
		System.out.print(arr[i] +" ");

}
	public static void main(String[] args) {
		int arr[]= {5,1,4,2,8};
		bubbleSort(arr);
	}

}
