package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
	String q = new StringBuilder(s).reverse().toString();
System.out.println(q);
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String total = "";
			for(int i =0; i < s.length()-1;i++)
			{
				if(i % 2 == 0)
				{
					String ss = s.substring(i, i+1);
					ss.toUpperCase();
					total+= ss;
				}
				String sss = s.substring(i,i+1);
				total+=sss;
				
			}
		}, "mixed");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			for(int  i=0; i<s.length()-1;i++)
			{
				System.out.println(s.substring(i,i+1));
				System.out.println(".");
			}
		}, "inbetween");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String t = "";
			for(int i = 0; i < s.length()-1; i++) {
				if(!s.substring(i,i+1).equals("a") || !s.substring(i,i+1).equals("e") || !s.substring(i,i+1).equals("i") || !s.substring(i,i+1).equals("o") || !s.substring(i,i+1).equals("u") || !s.substring(i,i+1).equals("y"))
				{
					t+=s.substring(i,i+1);
				}
			}
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
