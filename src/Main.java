import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

    checkifNumber();


    }

    public static void checkifNumber() {
        System.out.print("Enter a number: ");
        String input = stdin.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'A') {
                System.out.print("This number has a letter");
            }

        }
        //System.out.println(charArray);
        //System.out.println(input);


    }


}

