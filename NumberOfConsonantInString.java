import java.util.*;
public class NumberOfConsonantInString
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

            if(isConsonent(currentChar) )
            {
                count++;

            }

        }       
        
         System.out.println("Number of vowels in the string are: " +count);

    }//end main


        //function to check if the character is consonent or not
        private static boolean isConsonent(char c)
        {
            return Character.isLetter(c) && !isVowel(c);
        }

        //function to check if the character is vowel or not
        private static boolean isVowel(char c)
        {
            return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ;
        }

        

    
}//end class      
