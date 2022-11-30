public class Game {
    private int p1money;
    private int p2money;
    private boolean p1college;
    private boolean p2college;
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
    public void p1College (boolean college){
        this.p1college = college;
        if(p1college){
        p1money -= 500;
        }
    }
    public void p2College (boolean college){
        this.p2college = college;
        if(p2college){
            p2money -= 500;
        }
    }
    public boolean p1RedSpace(){
        return p1step % 5 == 4;
    }
    public boolean p2RedSpace(){
        return p2step % 5 == 4;
    }


    public void beginGame(){
        int round = 1;
        p1step = 0;
        p2step = 0;
        System.out.println("Player 1 have $" + p1money );
        System.out.println("Player 2 have $" + p2money );
        while ( (round < 11) || ((p1step < 20) && (p2step < 20)) ){
           System.out.println("round: " + round);
           if(p1step < 20){
               int p1DiceRoll = Dice();
               p1step += p1DiceRoll;
               System.out.println("Player 1 moved " + p1DiceRoll + " steps, Player 1 is now at step " + p1step);

               if(p1college && p1step>5 && !p1RedSpace()){p1money+=100;}
                p1money+=200;
                if(p1RedSpace()){
                    System.out.println("Player 1 have stepped onto a red space, you lost $150.");
                    p1money -= 350;
                }
                System.out.println("Player 1 have $" + p1money );
           }
           else{System.out.println("Player 1 have finished the game, wait");}

            if(p2step < 20) {
                int p2DiceRoll = Dice();
                p2step += p2DiceRoll;
                System.out.println("Player 2 moved " + p2DiceRoll + " steps, Player 2 is now at step " + p2step);

                if (p2college && p2step > 5 && !p2RedSpace()) {
                    p2money += 100;
                }
                p2money += 200;
                if (p2RedSpace()) {
                    System.out.println("Player 2 have stepped onto a red space, you lost $150.");
                    p2money -= 350;
                }
                System.out.println("Player 2 have $" + p2money);
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
