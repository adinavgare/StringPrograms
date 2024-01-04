import java.util.*;
public class FirstOccuranceCharacterIndexInString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String str = sc.nextLine();

        System.out.println("Enter the character");
        char targetChar = sc.next().charAt(0); //read the first character of string

        int index = -1;

        for(int i=0; i<str.length(); i++)
        {
            if(targetChar == str.charAt(i))
            {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("First occurrence of " + targetChar + " at index " + index);
        } else {
            System.out.println(targetChar + " not found in the string.");
        }

    }//end main
}//end class        