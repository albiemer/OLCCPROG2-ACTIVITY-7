/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Password
{
	public static void main(String[] args) {
	
	    Scanner password = new Scanner(System.in);
	    //String password = "Albi3mer_";
	    
	    System.out.print("Password: ");
	    String mypass = password.next();
	
	    System.out.print("confirm Password: ");
	    String mypasscon = password.next();
	
        int invalid = 0;
        
        if(mypass.equals(mypasscon))
        {
            
            if (mypass.length() > 15 || mypass.length() < 8)
            {
                System.out.println("\nPassword should be less than 15 and more than 8 characters in length.");
                invalid += 1;
            }
            //if (password.indexOf(userName) > -1)
            //{
            //  System.out.println("Password Should not be same as user name");
            //valid += 1;
            //}
            
            String upperCaseChars = "(.*[A-Z].*)";
            if (!mypass.matches(upperCaseChars ))
            {
                System.out.println("Password should contain atleast one upper case alphabet");
                invalid += 1;
            }
            
            String lowerCaseChars = "(.*[a-z].*)";
            if (!mypass.matches(lowerCaseChars ))
            {
                System.out.println("Password should contain atleast one lower case alphabet");
                invalid += 1;
            }
                
            String numbers = "(.*[0-9].*)";
            if (!mypass.matches(numbers ))
            {
                System.out.println("Password should contain atleast one number.");
                invalid += 1;
            }
                
            String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
            if (!mypass.matches(specialChars ))
            {
                System.out.println("Password should contain atleast one special character");
                invalid += 1;
            }
            
            if (invalid <= 0)
            {
                System.out.println("Password is valid.");
                //System.out.println(invalid);
            
            }
            
        }else{
            
            System.out.print("Password and Confirm Password are not the same");
            
        } // pass == passcon end
	
	}
}

