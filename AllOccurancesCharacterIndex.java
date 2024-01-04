import java.util.*;

public class AllOccurancesCharacterIndex 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String str = sc.nextLine();

        System.out.println("Enter the character: ");
        char targetChar = sc.next().charAt(0); // read the first character of string

        boolean found = false;

        System.out.println("Occurrences of " + targetChar + " at indices:");

        for (int i = 0; i < str.length(); i++) {
            if (targetChar == str.charAt(i)) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println(targetChar + " not found in the string.");
        }
    }//end main
}//end class
