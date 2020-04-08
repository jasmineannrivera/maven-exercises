
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string!");
        String userInput = scanner.nextLine();
        if (StringUtils.isNumeric(userInput)){
            System.out.println("That's a number not a string");
        } else {
            System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
            System.out.println("Reversed: " + StringUtils.reverse(userInput));
        }




    }
}
