package PPS1;

public class problem5 {
public static void sumOfArrays(double arr[] , double arr2[]) {
	int size1,size2;
	size1 = arr.length;
	size2 = arr2.length;
	if(size1>size2) {
		double c[] = new double[size1];
		for(int i=0;i<size1;i++) {
			c[i]=arr[i];
		}
		for(int i=0;i<size2;i++) {
			c[i]=c[i]+arr2[i];
		}
		for(int i=0;i<size1;i++) {
			System.out.println((int)Math.round(c[i])+" ");
	}
	}
		else {
			double c[] = new double[size2];
			for(int i=0;i<size2;i++) {
			c[i]= arr2[i];	
			}
			for(int i=0;i<size1;i++) {
				c[i]=c[i]+arr[i];
			}
			for(int i=0;i<size2;i++) {
				System.out.println((int)Math.round(c[i])+" ");
			}
		}
}
	public static void main(String[] args) {
		double arr[]= {10,20,30};
		double arr2[]= {20,50,30,70,80};
		sumOfArrays(arr,arr2);
	}

}
