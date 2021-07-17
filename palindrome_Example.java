import java.util.Scanner;

public class palindrome_Example {

	static void palind(String str) {
		boolean flag=true,string=false;
		for(int i=0;i<str.length()/2;++i)
		{
			if((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z'))
				string=true;
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag=false;
				break;
			}
		}
		if(flag&&string) System.out.println("It is string and Palindrome");
		else if(flag&&!string) System.out.println("It is number and palindrome");
		else System.out.println("Not a Palindrome");
	
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(str.length()!=0)
		palind(str);
		else
			System.out.println("Empty String!");
		s.close();
	}

}
