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
    }



    public void beginGame(){
        int round = 1;
        int p1step = 0;
        int p2step = 0;
        while ( (round < 10) || ((p1step > 20) && (p2step > 20)) ){
           System.out.println(round);
           if(p1step < 20){
               int p1DiceRoll = Dice();
               p1step += p1DiceRoll;

           }
            if(p2step < 20){
                int p2DiceRoll = Dice();
                p2step += p2DiceRoll;
            }


            round++;
        }
        if(p1money > p2money){System.out.println("Player 1 has won the game");}
        if(p1money < p2money){System.out.println("Player 2 has won the game");}
        if(p1money == p2money){System.out.println("The game is a tie");}
    }



}
