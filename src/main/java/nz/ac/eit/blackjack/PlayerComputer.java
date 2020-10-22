package nz.ac.eit.blackjack;

public class PlayerComputer {
    //Holds the information about the user and the computer
    //Implementation in App class -
    //Player computer = new Player();
    public void play() {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        InputCollector collector=new InputCollector();

        int sum = 0;

        do {
            int dice1Score = dice1.throwDice();
            int dice2Score = dice2.throwDice();
            sum = sum + (dice1Score + dice2Score);
            System.out.println("Your score is: " + sum);
        } while (computerSum <= PlayerHuman.sum);
        tracker.winAssessment(computerSum, sum);
}
