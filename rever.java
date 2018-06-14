import java.util.Scanner;

  class rever {
  Scanner in=new Scanner(System.in);
  String c=in.nextLine();
  void reverse() 
  {
	  
  for(int i=c.length()-1;i>=0;i--) 
  {
	  System.out.print(c.charAt(i));
  }

  
  }
	public static void main(String[] args) {
		
		rever a=new rever();
		String s;
		a.reverse();
		
	}

}