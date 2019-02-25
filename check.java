package check;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class check {
	public static void main(String args[]) {
		System.out.println("Validate Password-");
		Scanner sc=new Scanner(System.in);
		String password=sc.nextLine();
		String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*$_#=@])(?=\\S+$).{6,10}$";
		Pattern p= Pattern.compile(pattern);
		Matcher m= p.matcher(password);
		String upperCase="(.*[A-Z].*)";
		String lowerCase="(.*[a-z].*)";
		String number="(.*[0-9].*)";
		String specialChar="(.*[@#$=_*].*$)";
		String InvalidChar="(.*[%!()].*)";
		if (m.find()) {
			if (password.matches(InvalidChar))
			{
				System.out.println("Password cannot contain %%!)(");
			}
			else
			{
				System.out.println("Success");
			}
		}
		else if(password.length()<6)
		{
			System.out.println("Password must be at least 6 characters long");
		}
		else if (password.length()>12)
		{
			System.out.println("Password must be at max 12 charachters long");
		}
		else if(!password.matches(lowerCase))
		{
			System.out.println("Password must contain at least one letter from a-z");
		}
		else if(!password.matches(upperCase))
		{
			System.out.println("Password must contain at least one letter from A-Z");
		}
		else if(!password.matches(number))
		{
			System.out.println("Password must contain at least one letter from 0-9");
		}
		else if(!password.matches(specialChar))
		{
			System.out.println("Password must contain at least one letter from @#$_*=");
		}
	}
}
