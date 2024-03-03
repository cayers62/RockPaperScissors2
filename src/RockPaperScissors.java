
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Declare Variables
        String player1 = "";
        String player2 = "";
        String trash = "";
        String done = "true";

        Scanner in = new Scanner(System.in);

        // Get Players  moves

        System.out.print("Enter R, P, or S for your move: ");
        player1 = in.nextLine();
        in.nextLine(); // Clear the buffer

        System.out.print("Enter R, P, or S for your move: ");
        player2 = in.nextLine();
        in.nextLine(); // Clear the buffer

do {
    if (player1.equalsIgnoreCase("R"))


        if (player2.equalsIgnoreCase("S")) {

            System.out.println("Rock breaks scissors player1 wins");
        } else if (player2.equalsIgnoreCase("P")) {

        }

    System.out.println("Paper covers rock player 2 wins");

    if (player1.equalsIgnoreCase("R")) ;

    if (player2.equalsIgnoreCase("R")) ;

    System.out.println("Rock vs. Rock tie game");

    if (player2.equalsIgnoreCase("S")) ;

    if (player1.equalsIgnoreCase("P")) {

        System.out.println("Scissors cuts paper player2 wins");
    } else if (player1.equalsIgnoreCase("S")) {
        System.out.println("Scissors vs. Scissors tie game");
    }
    if (player1.equalsIgnoreCase("S"))

        if (player2.equalsIgnoreCase("P")) {

            System.out.println("Scissors cuts paper player1 wins");

        } else if (player2.equalsIgnoreCase("R")) {
            System.out.println("Rock breaks scissors player 2 wins ");
        }
    if (player1.equalsIgnoreCase("P")) ;

    if (player2.equalsIgnoreCase("R")) {
        System.out.println("Paper covers rock player1 wins");

    } else if (player2.equalsIgnoreCase("P")) {
        System.out.println("Paper vs. Paper tie game");
    }

    // Asking players to play again

    System.out.print("Would you like to play again enter Y/N");

    done.equalsIgnoreCase("N");

}while(!done);








    }



}






