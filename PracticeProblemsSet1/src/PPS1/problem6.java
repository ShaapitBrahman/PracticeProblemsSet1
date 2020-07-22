package PPS1;
import java.util.Scanner;
public class problem6 {

	public static void main(String[] args) {
		System.out.println("Enter a name:");
		Scanner sc = new Scanner(System.in);
		String name= sc.nextLine();
		sayHello(name);
		sc.close();
	}
	public static void sayHello(String name) {
		System.out.println("Hello, " +name +"!");	
	}

	}