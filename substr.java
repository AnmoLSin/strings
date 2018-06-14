import java.util.Scanner;

public class substr {
	
  Scanner s=new Scanner(System.in);
  String b=s.next();
  int i=0;
  void sub() 
  {  
	  while(i<b.length()) 
	  {
		  System.out.println(b.charAt(i));
		  i++;
	  }
	  
	  for(i=0;i<b.length();i++)
	  {
		  for(int j=0;j<b.length();j++) 
		  {
			  System.out.print(b.charAt(i));
			  System.out.println(b.charAt(j));
		}
	  }
	  System.out.print(b);
  }
	  
		public static void main(String[] args) {
			
			substr a=new substr();
			a.sub();
		}
}