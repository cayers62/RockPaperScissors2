
import jdk.nashorn.internal.runtime.regexp.RegExp;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import sun.misc.Regexp;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Declare Variables
        String player1 = "RPS";
        String player2 = "RPS";
        String trash = "";
        boolean done = false;
        String quit = "";
        Regex RPS = null;
        Scanner in = new Scanner(System.in);

        // Get Players  moves//

do {

    System.out.print("Enter R, P, or S for your move:  ");
    player1= in.nextLine();
    in.nextLine(); // Clear the buffer

        System.out.print("Enter R, P, or S for your move: ");
        player2 = in.nextLine();
        in.nextLine(); // Clear the buffer


    if (player1.equalsIgnoreCase("R"))


        if (player2.equalsIgnoreCase("S")) {

            System.out.println("Rock breaks scissors player1 wins");
        } else if (player2.equalsIgnoreCase("P"))


    System.out.println("Paper covers rock player 2 wins");

    if (player1.equalsIgnoreCase("R"))

    if (player2.equalsIgnoreCase("R"))

    System.out.println("Rock vs. Rock tie game");

    if (player2.equalsIgnoreCase("S"))

    if (player1.equalsIgnoreCase("P")) {

        System.out.println("Scissors cuts paper player2 wins");
    } else if (player1.equalsIgnoreCase("S")) {
        System.out.println("Scissors vs. Scissors tie game");
    }
    if (player1.equalsIgnoreCase("S")) {
        if (player2.equalsIgnoreCase("P")) {

            System.out.println("Scissors cuts paper player1 wins");

            if (player1.equalsIgnoreCase("P"))

            if (player2.equalsIgnoreCase("R")) {
                System.out.println("Paper covers rock player1 wins");

            } else if (player2.equalsIgnoreCase("P")) {
                System.out.println("Paper vs. Paper tie game");
            }
        } else {
            if (player2.equalsIgnoreCase("R")) {
                System.out.println("Rock breaks scissors player 2 wins ");
            }
            if (player1.equalsIgnoreCase("P"))

            if (player2.equalsIgnoreCase("R")) {
                System.out.println("Paper covers rock player1 wins");

            } else if (player2.equalsIgnoreCase("P")) {
                System.out.println("Paper vs. Paper tie game");
            }
        }
        if (player1.equalsIgnoreCase("P"))

        if (player2.equalsIgnoreCase("R")) {
            System.out.println("Paper covers rock player1 wins");

        } else if (player2.equalsIgnoreCase("P")) {
            System.out.println("Paper vs. Paper tie game");
        }
    }

    // Asking players to play again

    System.out.print("Would you like to play again enter Y/N: ");

        quit = in.nextLine();
        in.nextLine(); // clears buffer

         if(quit.equalsIgnoreCase("N"))
            done = true;




}while(!(done));








    }



}






