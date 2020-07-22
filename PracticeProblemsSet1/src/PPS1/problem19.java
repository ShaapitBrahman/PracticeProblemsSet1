package PPS1;
import java.util.Scanner;
public class problem19 {
public static void nameSwapper(String a,String b) {
	String firstName = a.substring(0,a.indexOf(" "));
	String lastName = a.substring(a.indexOf(" "));
	String firstName1 = b.substring(0,b.indexOf(" "));
	String lastName1 = b.substring(b.indexOf(" "));
	String nameSwap = firstName + " " + lastName1;
	String nameSwap1 = firstName1 + " " + lastName;
	System.out.println(nameSwap);
	System.out.println(nameSwap1);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		nameSwapper(a,b);
		sc.close();
	}

}
