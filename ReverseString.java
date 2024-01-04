import java.util.*;
public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String str = sc.nextLine();
        String result  = "";

        for(int i=str.length()-1; i>=0; i--)
        {
            result = result + str.charAt(i);
        }

        System.out.println("Reverse String is: " + result);

    }//end main
}//end class