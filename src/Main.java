import java.util.Scanner;

/** Class that runs the game */
public class Main {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        //intro
        System.out.println("Welcome to a worse version of \" The Game Of Life\"");

        //college for player 1?
        System.out.print("Would Player 1 like to go to college, it costs $500 (yes or no) ");
        String choice1 = scan.nextLine();
        //college for player 2?
        System.out.print("Would Player 2 like to go to college, it costs $500 (yes or no) ");
        String choice2 = scan.nextLine();
        //Starting money
        System.out.print("How much money do you guys want to start with? (500 is the normal amount) ");
        int amount = scan.nextInt();

        //Makes the game
        Game GameOfLife = new Game(amount);

        //Checks if Player 1 can go to college
        if (choice1.equals("yes") && amount >= 500) {
            GameOfLife.p1College(true);
            System.out.println("Since you chose to go to college you will lose $500, but get an extra $100 after step 5");}
        else if (choice1.equals("yes") && amount < 500) {
            System.out.println("You can't go to college, you don't have enough money to.");
            GameOfLife.p1College(false);}
        else{
            GameOfLife.p1College(false);}

        //Checks if Player 2 can go to college
        if (choice2.equals("yes") && amount >= 500) {
            GameOfLife.p2College(true);
            System.out.println("Since you chose to go to college you will lose $500, but get an extra $100 after step 5");}
        else if (choice2.equals("yes") && amount < 500) {
            System.out.println("You can't go to college, you don't have enough money to.");
            GameOfLife.p2College(false);}
        else{
            GameOfLife.p2College(false);}

        //Start Game
        System.out.println();
        GameOfLife.beginGame();




    }
}
