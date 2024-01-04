import java.util.*;

public class LastOccuranceCharacterIndex
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String str = sc.nextLine();

        System.out.println("Enter the character: ");
        char targetChar = sc.next().charAt(0); //read the first character of string

        int index = -1;

        // Iterate through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            if (targetChar == str.charAt(i)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Last occurrence of " + targetChar + " at index " + index);
        } else {
            System.out.println(targetChar + " not found in the string.");
        }
    }//end main
}//end class
