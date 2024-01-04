import java.util.*;
public class NumberOfVowelsInString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String str = sc.nextLine();
        int count = 0;

        for(int i=0; i<str.length(); i++)
        {
            char currentChar = Character.toLowerCase(str.charAt(i));

            if(currentChar=='a' || currentChar=='e'|| currentChar=='i' || currentChar=='o' || currentChar=='u' )
            {
                count++;

            }
        }

        System.out.println("Number of vowels in the string are: " +count);


    }//end main
}//end class      
