package PPS1;

import java.util.Scanner;
public class problem20{
	String value= "";
public int compare(String anotherString) {
	int len1 = value.length();
	int len2 = anotherString.length();
	int lim = Math.min(len1,len2);
	char v1[]= value.toCharArray();
	char v2[]= anotherString.toCharArray();
	int k=0;
	while(k<lim) {
		char c1= v1[k];
		char c2= v2[k];
		if(c1!=c2) {
			return c1-c2;
		}
		k++;
	}
	return len1-len2;
  }
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strings to be compared :");
		String str1 = sc.nextLine();
	    String str2 = sc.nextLine();
	    problem20 str = new problem20();
	    str.value = str1;
	    int result = str.compare( str2 );
	    if(result==0) {
	    	System.out.println("Both Strings are equal.");
	    }
	    if(result<0) {
	    	System.out.println("1st String is greater Lexicographically.");
	    }
	    else
	    	System.out.println("2nd String is greater Lexicographically.");
	    sc.close();
	}

}