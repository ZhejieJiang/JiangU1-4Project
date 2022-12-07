/** Class to represent the game of life */
public class Game {
    /** Player 1's money */
    private int p1money;

    /** Player 2's money */
    private int p2money;
    /** player 1 goes to college? */
    private boolean p1college;
    /** player 2 goes to college? */
    private boolean p2college;
    /** what step is player 1 on */
    private int p1step;
    /** what step is player 2 on */
    private int p2step;

    /** default constructor that sets beginning money to $500 */
    public Game(){
        this.p1money = 500;
        this.p2money = 500;
    }

    /** Constructor that sets beginning money to whatever.
     * @param beginningMoney - sets both player's money to this amount.
     */
    public Game(int beginningMoney){
        this.p1money = beginningMoney;
        this.p2money = beginningMoney;
    }


    /** Dice roll to show how much the players move that round.
    @return int - random between 1,2,3
    */

    public int Dice(){
        return (int)(Math.random()*3 + 1);
    }

    /** P1 Go to college (lose $500 in the beginning but after round 5, you make $100 more)
     * @param college - did player 1 go to college?
     */
    public void p1College (boolean college){
        this.p1college = college;
        if(p1college){
        p1money -= 500;
        }
    }
    /** P2 Go to college (lose $500 in the beginning but after round 5, you make $100 more)
     * @param college - did player 2 go to college?
     */
    public void p2College (boolean college){
        this.p2college = college;
        if(p2college){
            p2money -= 500;
        }
    }
    /** detects if player 1 stepped on a red space
    @return boolean - true if p1 stepped on 4, 9, 14, 19
   */
    public boolean p1RedSpace(){
        return p1step % 5 == 4;
    }

    /** detects if player 2 stepped on a red space
     @return boolean - true if p2 stepped on 4, 9, 14, 19
     */
    public boolean p2RedSpace(){
        return p2step % 5 == 4;
    }


    /** tells starting amount
    @return String saying you only have the starting amount
     */
    public String toString(){
        String returnString = "You only have " + p1money;
        return returnString;
    }


    /** the game */
    public void beginGame(){
        int round = 1;
        p1step = 0;
        p2step = 0;
        System.out.println("Player 1 have $" + p1money );
        System.out.println("Player 2 have $" + p2money );
        while ( (round < 11) && ((p1step < 20) && (p2step < 20)) ){
           System.out.println("round: " + round);
           if(p1step < 20){
               int p1DiceRoll = Dice();
               p1step += p1DiceRoll;
               System.out.println("Player 1 moved " + p1DiceRoll + " steps, Player 1 is now at step " + p1step);

               if(p1college && p1step>5 && !p1RedSpace()){
                   p1money+=100;
               }
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
        if(p1money > p2money){System.out.println("Player "+ 1 +" has won the game");}
        else if(p1money < p2money){System.out.println("Player " + 2 + " has won the game");}
        else{System.out.println("The game is" + " a tie");}
    }
}
