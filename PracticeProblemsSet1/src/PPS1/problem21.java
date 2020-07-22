package PPS1;

public class problem21 {
public static void authenticateUserName(String usn) {
	 if(usn.length()==10 && ((usn.charAt(0)=='1') || (usn.charAt(0)=='2')) && ((usn.charAt(1)>='A') && (usn.charAt(1)<='Z'))
				&& ((usn.charAt(2)>='A') && (usn.charAt(2)<='Z')) && ((usn.charAt(3)>='0') && (usn.charAt(3)<='9')) && ((usn.charAt(4)>='0') && (usn.charAt(4)<='9'))
				&& (((usn.charAt(5)=='C') && (usn.charAt(6)=='S')) || ((usn.charAt(5)=='I') && (usn.charAt(6)=='S')) ||((usn.charAt(5)=='E') && (usn.charAt(6)=='C')) || ((usn.charAt(5)=='M') && (usn.charAt(6)=='E')) )
				&& (usn.charAt(7)>='0') && (usn.charAt(7)<='9') && (usn.charAt(8)>='0') && (usn.charAt(8)<='9') && (usn.charAt(9)>='0') && (usn.charAt(9)<='9') )
				{
						 System.out.println("Success");
						 
				 }
					 else
					 System.out.println("Failure");
}
	public static void main(String[] args) {
		 String username="1DS09CS010";
		 authenticateUserName(username);
	}


 }

