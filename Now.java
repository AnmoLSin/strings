import java.util.Scanner;

public class Now {
      int i=0,count=0;
	  void words(String s) 
	  {  
		while(i<s.length())
		{
			if(s.charAt(i)==' ') 
			{
			  count++;
			}
			i++;
		}
		count+=1;
		System.out.println("No. of Words --> "+count);
	  }
	  
	public static void main(String[] args) {

        Now a=new Now();
        Scanner in=new Scanner(System.in);
   		String b=in.nextLine();
       a.words(b);
	}

}