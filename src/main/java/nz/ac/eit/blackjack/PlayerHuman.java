package nz.ac.eit.blackjack;

public class PlayerHuman {
    //Holds the information about the user and the computer
    //Implementation in App class -
    //Player human = new Player();

    public static void play() {

        InputCollector collector=new InputCollector();

        int sum = 0;

        do {
            int dice1Score = Dice.dice1.throwDice();
            int dice2Score = Dice.dice2.throwDice();
            sum = sum + (dice1Score + dice2Score);
            System.out.println("Your score is: " + sum);
        } while (collector.continuePlaying());
    }
}