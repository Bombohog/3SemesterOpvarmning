/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 23-08-2021
 *
 * Description of program
 ********************************************/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    private static int max;
    private static int amountOfNumbers = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("You want to play a game? yes, no");
        if (input.nextLine().equals("yes")) {

            String inputSTR = "";

            while (true) {

                System.out.println("Write a number: ");
                inputSTR = input.next();

                if (inputSTR.equals("Q") || inputSTR.equals("q")) {
                    break;
                } else if (isNumeric(inputSTR)) {
                    try { updateMax(Integer.valueOf(inputSTR)); } catch (Exception e) { /* looks like something went wrong, but we dont care */ }
                } else {
                    System.out.println("Please write a number or 'q'/'Q' if you want to end the game.\n");
                }

                System.out.println("Average is: " + calculateAverage());

            }

        }

    }

    private static boolean isNumeric(String str) {
        String regexPattern = "[0-9]+[\\.]?[0-9]*";
        return Pattern.matches(regexPattern, str);
    }

    private static void updateMax(int number) {
        max += number;
        amountOfNumbers++;
    }

    private static String calculateAverage() {
        return String.valueOf(max / amountOfNumbers);
    }

}
