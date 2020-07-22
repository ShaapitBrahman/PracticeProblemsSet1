package PPS1;
import java.util.Scanner;
public class problem18 {
public static void createPassword(String name,int age) {
	int len=name.length();
	char[] ch=new char[len];
	char[] initials=new char[len];
	int j=0;
	for(int i=0;i<len;i++)
		ch[i]=name.charAt(i);
	for(int i=0;i<len;i++) {
		if(ch[i]>='A'&&ch[i]<='Z') {
			initials[j++]=ch[i];
			}
		}
	System.out.println("Your Password is   ");
	for(int i=0;i<j;i++) {
	System.out.print(initials[i]);
	System.out.print(age);	
}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Full Name Without any spaces example : JohnDoe");
		String name=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		createPassword(name,age);
        sc.close();
  }

}
