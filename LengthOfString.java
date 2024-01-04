import java.util.*;
public class LengthOfString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String str = sc.nextLine();
        int count = 0;

        for(int i=0; i<str.length(); i++)
        {
            count++;
        }

        System.out.println("Length of string: " + count);

    }//end main
}//end class        