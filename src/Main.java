import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("How much money do you want to start with? (500 is the normal amount)");


        //Fix this
        if (scan.nextInt() == 500){
            Game GameOfLife = new Game();}
        Game GameOfLife = new Game(scan.nextInt());


        //College?
        System.out.print("Would you like to go to college (yes or no)");
        if(scan.nextLine().equals("yes")){
            GameOfLife.College(true);}
        else{
            GameOfLife.College(false);}

        //Start Game
        GameOfLife.beginGame();





    }
}
