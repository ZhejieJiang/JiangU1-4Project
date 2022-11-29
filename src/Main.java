import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Would you like to go to college (yes or no) ");
        String choice = scan.nextLine();
        System.out.print("How much money do you want to start with? (500 is the normal amount) ");
        int amount = scan.nextInt();


        Game GameOfLife = new Game(amount);
        if(choice.equals("yes")){
            GameOfLife.College(true);
            System.out.println("Since you chose to go to college you will lose $500, but get an extra $100 after step 5");
        }
        else{
            GameOfLife.College(false);}

        //Start Game
        GameOfLife.beginGame();




    }
}
