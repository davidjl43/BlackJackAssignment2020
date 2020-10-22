package nz.ac.eit.blackjack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Main class for all the code
        InputCollecter collector = new InputCollecter();
        Dice dice1 = newDice();
        Dice dice2 = newDice();
        PlayerComputer computer = new PlayerComputer();
        PlayerHuman human = new PlayerHuman();
    }
}
