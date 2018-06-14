import java.util.Scanner;

public class occur {

	void compare(String str1,String str2) 
	{
		 if(str1.contains(str2)==true) 
		 {
			  System.out.println("String2 contains String1");
		 }
		 else 
		 {
			  System.out.println("String2 doesn't contain String1");
		 }
	}

	public static void main(String[] args) {

	occur a=new occur();
	Scanner in=new Scanner(System.in);
	String str1=in.nextLine();
	String str2=in.nextLine();
	a.compare(str1,str2);
	
	}
}