import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

    checkifNumber();


    }

    public static void checkifNumber() {
        while (true) {

            boolean containsLetter = false;

            System.out.print("Enter a number: ");
            String input = stdin.nextLine();

            for (int i = 0; i < input.length(); i++) {

                char currentChar = input.charAt(i);
                if ((currentChar >= 'A' && currentChar <= 'Z') || (currentChar >= 'a' && currentChar <= 'z')) {
                    containsLetter = true;
                }
            }

            if (containsLetter) {
                System.out.println("This input contains a letter, please try again.");
                System.out.print("Enter a number: ");
                input = stdin.nextLine();
            } else {
                System.out.println("This input is valid");
                break;
            }

        }
    }


}

