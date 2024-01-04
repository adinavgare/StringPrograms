import java.util.*;
public class CharacterAtParticularIndex
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String str = sc.nextLine();

        System.out.println("Enter index at which we want the character");
        int n = sc.nextInt();

            if(n >= 0 && n < str.length())
            {
                char charAtIndex = str.charAt(n);
                System.out.println("Character at " + n + " index is:" + charAtIndex);
            }
            else
            {
                System.out.println("Invalid Index");
            }
        

    }//end main
}//end class        