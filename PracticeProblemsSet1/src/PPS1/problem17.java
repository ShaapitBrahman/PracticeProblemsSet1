package PPS1;
import java.util.Scanner;
public class problem17 {
public static void getInitials(String name) {
	System.out.println("Your Initials Are : ");
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)>='A' && name.charAt(i)<='Z') {
			System.out.print(name.charAt(i));
		}
	}
}
	public static void main(String[] args) {
		System.out.println("Enter Your Full Name : ");
		Scanner sc = new Scanner(System.in);
		String name= sc.nextLine();
		getInitials(name);
        sc.close();
	}

}
