package PPS1;
import java.util.Arrays;
public class problem16 {

	public static void main(String[] args) {
		String n[]= {"Tony","Stark","Bruce","Wayne"};
		bubbleSort(n);
		insertionSort(n);
	}
	public static void insertionSort(String[]a) {
		for(int i = 1; i < a.length; i++){
		    String value = a[i];
		    int j = i - 1;
		    while(j >= 0 && a[j].compareTo(value)>0){
		      a[j + 1] = a[j];
		      j = j - 1;
		    }
		    a[j + 1] = value;
		  }
		System.out.println(Arrays.toString(a));
		}
	private static void bubbleSort(String[] n) {
		String temp;
		for(int i=0;i<n.length;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[j].compareTo(n[i])<0) {
			
				temp=n[i];
				n[i]=n[j];
				n[j]=temp;
				}
			}
			System.out.print(n[i] +"  ");

		}
	}
}
