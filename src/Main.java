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

public class Main {

    private static int max;
    private static int amountOfNumbers = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("You want to play a game? yes, no");
        if (input.nextLine().equals("yes")) {


                System.out.println("Write a number: ");
                try { updateMax(input.nextInt()); } catch (Exception e) { /* looks like something went wrong, but we dont care */ }

                while (true) {

                    System.out.println("Write another number: ");
                    try { updateMax(input.nextInt()); } catch (Exception e) { /* looks like something went wrong, but we dont care */ }

                    System.out.println("Average is: " + calculateAverage());

                }


        }

    }

    private static void updateMax(int number) {
        max += number;
        amountOfNumbers++;
    }

    private static String calculateAverage() {
        return String.valueOf(max / amountOfNumbers);
    }

}
