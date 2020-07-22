package PPS1;
import java.util.Scanner;
public class problem24 {
	static void compress(String s) 
	{ 
		String result="";
		for (int i = 0; i < s.length(); i++) { 
			int count = 1; 
			while ((i+1<s.length()&&(s.charAt(i)==(s.charAt(i+1)-32)||s.charAt(i)==(s.charAt(i+1)+32))||(i+
					1<s.length()&&s.charAt(i)==s.charAt(i+1)))) { 
				i++; 
				count++; 
			}
			result = result +""+ s.charAt(i)+""+count; 
		}
		if(result.length()>s.length()) {
			System.out.println(result);
		}
		else
			System.out.println("The length of the compressed string is equal to the length of given string.");
	} 
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the string to be compressed :");
		String a=obj.next();
		int len=a.length();
		char[]use=new char[len];
		for(int i=0;i<len;i++)
			use[i]=a.charAt(i);
		for(int i=0;i<len;i++)
		if(use[i]>='A' && use[i]<='Z')
        { 
			use[i]=(char)((int)use[i]+32);
        }
		String str = String.valueOf(use);
		compress(str);
		obj.close();

	}

}
