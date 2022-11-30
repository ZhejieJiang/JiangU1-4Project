public class Game {
    private int p1money;
    private int p2money;
    private boolean college;
    private int p1step;
    private int p2step;

    //Constructor 1, sets beginning money to $500
    public Game(){
        this.p1money = 500;
        this.p2money = 500;
    }

    //Constructor 2, sets beginning money to whatever.
    public Game(int beginningMoney){
        this.p1money = beginningMoney;
        this.p2money = beginningMoney;
    }

    //Dice roll to show how much the players move that round.
    public int Dice(){
        return (int)(Math.random()*3 + 1);
    }

    //Go to college (lose $500 in the beginning but after round 5, you make $200 more than what you would make)
    public void College (boolean college){
        this.college = college;
        p1money -= 500;
    }

    public void redspace(){
        if(p1step%5 -1 == 0){
        System.out.println("you have stepped on to a red space, you lost $500");
        }
    }

    public void beginGame(){
        int round = 1;
        int p1step = 0;
        int p2step = 0;
        System.out.println("Player 1 have $" + p1money );
        System.out.println("Player 2 have $" + p2money );
        while ( (round < 11) || ((p1step > 20) && (p2step > 20)) ){
           System.out.println("round: " + round);
           if(p1step < 20){
               int p1DiceRoll = Dice();
               p1step += p1DiceRoll;
               System.out.println("Player 1 moved " + p1DiceRoll + " steps, Player 1 is now at step " + p1step);

               if(college && p1step>5){p1money+=100;}
                p1money+=200;
                System.out.println("Player 1 have $" + p1money );
           }
           else{System.out.println("Player 1 have finished the game, wait");}

            if(p2step < 20){
                int p2DiceRoll = Dice();
                p2step += p2DiceRoll;
                System.out.println("Player 2 moved " + p2DiceRoll + " steps, Player 2 is now at step " + p2step);
                p2money += 200;
                System.out.println("Player 2 have $" + p2money );
            }
            else{System.out.println("Player 2 have finished the game, wait");}
            round++;
            System.out.println();
        }
        if(p1money > p2money){System.out.println("Player 1 has won the game");}
        else if(p1money < p2money){System.out.println("Player 2 has won the game");}
        else{System.out.println("The game is a tie");}
    }
}
