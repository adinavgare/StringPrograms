import java.util.*;
public class PalindromeStringCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String str = sc.nextLine();
        String result  = "";

        for(int i = str.length()-1; i>=0; i--)
        {
            result = result + str.charAt(i);
        }

        if(str.equals(result))
        {
            System.out.println("The entered string is palindrome");
        }
        else
        {
            System.out.println("The entered string is notpalindrome");
        }

    }//end main
    
}//end class    