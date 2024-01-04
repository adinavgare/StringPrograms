import java.util.Scanner;

public class NumberOfDigitInString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String str = sc.nextLine();

        int digit = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(Character.isDigit(str.charAt(i)))
            { 
                digit++;
            }
        }

        System.out.println("Number of digit in " + str + " is: " + digit);

    }//end main    
    
}//end class
