import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Would Player 1 like to go to college, it costs $500 (yes or no) ");
        String choice1 = scan.nextLine();
        System.out.print("Would Player 2 like to go to college, it costs $500 (yes or no) ");
        String choice2 = scan.nextLine();
        System.out.print("How much money do you guys want to start with? (500 is the normal amount) ");
        int amount = scan.nextInt();


        Game GameOfLife = new Game(amount);
        if (choice1.equals("yes") && amount >= 500) {
            GameOfLife.p1College(true);
            System.out.println("Since you chose to go to college you will lose $500, but get an extra $100 after step 5");}
        else if (choice1.equals("yes") && amount < 500) {
            System.out.println("You can't go to college, you don't have enough money to.");
            GameOfLife.p1College(false);}
        else{
            GameOfLife.p1College(false);}
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
