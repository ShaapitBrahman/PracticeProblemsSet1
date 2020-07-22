package PPS1;
import java.util.Scanner;
public class problem23 {
	static void printConsecutiveChars(String s) 
	{ 
		int i,f,j=65,c=0;
		char x='0';
		char y='0';
		while(j<=90) {
			c=f=0;
			for(i=1;i<s.length();i++) {
				if((s.charAt(i-1)==(char)j)&&(s.charAt(i)==(char)(j+1))) {
					x=s.charAt(i-1);
					y=s.charAt(i);
					c++;
					f++;
				}
			}
			if(f!=0) {
				System.out.print(x);
				System.out.print(y+":"+c+" ");
			}
			j++;
		}
	}
	public static void main(String[] args) {
		String x,y;
		y="";
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		x= sc.nextLine();
		sc.close();
		for(i=0;i<x.length();i++) {
			int ch= (int)x.charAt(i);
			if(ch>=97&&ch<=122) {
				ch=ch-32;
				y=y+(char)ch;
			}
			else{
				y=y+(char)ch;
		    }
		}
		System.out.println(y);
		printConsecutiveChars(y);
	}
}
