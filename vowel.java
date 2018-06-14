public class vowel {

 public static void main(String[] args) {
        String str1 = "Anmol Singh";
        for(int i=0;i<str1.length();i++)
        {
        	if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'||str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||str1.charAt(i)=='O'||str1.charAt(i)=='U')
        	{
        		
        	}
        	else
        	{
        		System.out.print(str1.charAt(i));
        	}
        }  
    }
}