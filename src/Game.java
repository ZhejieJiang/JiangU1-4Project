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
        return (int)(Math.random()*4);
    }

    //Go to college (lose $500 in the beginning but after round 5, you make $200 more than what you would make)
    public void College (boolean college){
        this.college = college;
    }


    public void beginGame(){
        int round = 0;

        while (round<10 || (p1step >20 && p2step>20)){






            round++;
        }
    }













}
