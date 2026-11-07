//shift alt f to auto format
//i or row = what row ur on
//c or count = how many times to print the character
//
// Class author: Rayne Christopher
// Date created: November 2, 2026
// General description: print five different patterns using loops
//

import java.util.Scanner;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of rows for stars: ");
    int rows = input.nextInt();

    Patterns.stars(rows);

    System.out.print("Enter number of rows for triangle: ");
    int triangleRows = input.nextInt();

    Patterns.triangle(triangleRows);

    System.out.print("Enter number of rows for odds: ");
    int oddsRows = input.nextInt();

    Patterns.odds(oddsRows);

    System.out.print("Enter number of rows for EO's: ");
    int eoRows = input.nextInt();

    Patterns.eo(eoRows);

    System.out.print("Enter number of rows for pyramid: ");
    int pyramidRows = input.nextInt();

    Patterns.pyramid(pyramidRows);

    input.close();

}

public class Patterns

{
    //
    // Pre-cond: # of rows must be positive int
    // Post-cond: prints a triangle of stars with the # number of rows given
    //
    public static void stars(int rows) {
        int i = 1;

        while (i <= rows) // if user inserts 7 into rows, while 1 <= 7 run count where it increases star
                          // every line //controls # of rows
        {
            int c = 1;

            while (c <= (2 * i - 1)) { // if user insterts 7, and i is <=7 then count = 1,
                                       // and if count is <= 13 itll print stars for every row //controls # of
                                       // stars printed
                System.out.print("*");
                c++; // everytime star is printed, count increases, once at 13, loop stops
            }
            System.out.println(); // part of the first while loop, increases row (1-7) until it hits 7+
            i++; // moves to next row
        }
    }

    //
    // Pre-cond: # of rows must be positive int
    // Post-cond: prints each row number the amount of times whatever its row number
    // is. (1, 22, 333, etc)
    //

    public static void triangle(int rows) {
        int i = 1;

        while (i <= rows) // if user inserts 9 into rows, while 1 <= 9, runs count //row = # printed
        {
            int c = 1;

            while (c <= i) { // when c is <=9 then the # of times i is printed starts at 1, prints the row
                             // its on, and then increases
                System.out.print(i); // prints whatever # row code is on
                c++; // everytime row is printed, whenever its less than 9, the # of times its
                     // printed increases, once at 9, loop stops
            }
            System.out.println(); // first while loop, makes new line until i is equal to # of rows given
            i++; // prints 1, 2, 3, 4 etc
        }
    }

    //
    // Pre-cond: # of rows must be positive int & must be an odd input
    // Post-cond: prints odd numbers from input to 1
    // prints each number how everr many times according to its row
    //

    public static void odds(int start) {

        for (int i = start; i >= 1; i -= 2) { // if you insert 9, and 9 is greater than 1, subtract 2 from 9, repeat
                                              // until equal to 1, also subtracts 2 from every i //see
            for (int c = 1; c <= i; c++) { // when above line happens, and c is less than 9, it prints out 9, then
                                           // increases. once equal to 9, it stops printing
                System.out.print(i);
            }
            System.out.println(); // CONDITIONS OF FIRST LOOP CAUSE LINE BREAK/NEW LINE!!!
        }

    }

    //
    // pre-cond: # of rows must be positive int
    // post-cond: prints pattern with alternating
    // E and O rows with the input being the row with the most characters.
    //
    public static void eo(int maxE) {
        String output = "E";

        if (maxE % 2 == 0) {
            output = "O";
        }
        for (int i = 1; i <= maxE; i++) { // if user inserts 6 into maxE, while 1 <= 6, run's code on line below
                                          // and increases what row we are on from 1 -> 2. and i
            for (int c = 1; c <= i; c++) { // when count is less than 6, increases by 1 AND prints out whatever output
                                           // is
                System.out.print(output); // prints O if even, prints E if odd
            }
            if (output.equals("E")) // if statement for alternating between E and O
                output = "O";
            else
                output = "E";
            System.out.println();
        } // new line/outer loop
        {

            for (int i = maxE - 1; i >= 1; i--) { // counting down, i is equal to the maxE or widest line, so that minus
                                                  // 1 for the next line
                                                  // and also subtracts 1 from i until it is equal to 1 so that the last
                                                  // line is only 1 character

                for (int c = 1; c <= i; c++) { // when # of letters become equal to the maxE or whatever, the code stops
                                               // printing
                    System.out.print(output);
                }
                if (output.equals("O")) {
                    output = "E";
                } else {
                    output = "O";
                }
                System.out.println();
            }
        }
    }

    //
    // pre-cond: # of rows must be positive int
    // post-cond: prints an upside down pyramid where the numbers of characters in
    // each row decrease but the number increases
    //
    public static void pyramid(int rows) {
        for (int i = 1; i <= rows; i++) // if user inserts 5 into rows, while 1 <= 5 run's code on line 162 and 167
        // increases row from 1 -> 2, creates one new line, and makes it so the actual
        // printed number goes up
        {
            for (int s = 1; s < i; s++) // when s is less than 5, increases by 1 AND prints a space
            {
                System.out.print(" ");
            }

            int numbers = 2 * (rows - i) + 1; // the amount of numbers being printed (5 - 1 * 2 = 8 + 1 = 9 so first
                                              // line has nine 1s)
            // i and s increase at the same time ???

            for (int c = 1; c <= numbers; c++) // when the count is equal to shfaksjhfjashfksajhdf prints out whatever i
                                               // is.
            {
                System.out.print(i);
            }

            System.out.println(); // see line 167 (produced from outer/first loop)
        }
    }
}
