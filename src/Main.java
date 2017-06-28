import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String userName = null;
        String game = null;
        String chest = null;
        String cave = null;
        String wraith = null;

        System.out.print("Welcome! What is your name? ");
        userName = scnr.next();

        System.out.print("Hello there " + userName + ". " + "Would you like to play a game? (Yes or No): ");
        game = scnr.next();

        if (game.equals("Yes") | (game.equals("yes"))) {
            System.out.print("Excellent! Let's begin! You're walking through the woods, and you come across a chest. What do you do? (Open or Ignore): ");
            chest = scnr.next();

        }else{
            System.out.print("Okay, goodbye!");
        }

        if (chest.equals("Open") | (chest.equals("open"))) {
            System.out.print("You find a sword and shield! You continue on and discover a cave. What do you do? (Enter or Leave): ");
            cave = scnr.next();
        }else{
            System.out.println("You leave the cave, but get attacked by bandits along the road. How unfortunate.");
        }
    }
}
