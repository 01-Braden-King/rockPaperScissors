package rockpaperscissorshw;

import java.util.*;

public class RockPaperScissorsHw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int round = 0;
        int score = 0;
        int win = 0;
        int lose = 0;
        int draw = 0;
        boolean stop = true;
        while (stop == true) {
            int ai = random.nextInt(3);
            String[] option = {"Rock", "Paper", "Scissors"};
            String aiChoice = option[ai];
            System.out.println("\nChoose either \"Rock\",\"Paper\",\"Scissors\" or \"Stop\" if you want to stop playing.");
            
            if (win>=3) {
                System.out.println("You can take a risk by doubling your points if you win, however if you lose you lose all your points\nType \"Double\" to take the risk.");
                
            }
            System.out.println("Your score is "+score);
           
            String choice = input.next();
            if(choice.equalsIgnoreCase("double")){
                int doubleRand = random.nextInt(2);
                if (doubleRand == 1) {
                    System.out.println("You got lucky and doubled your points");
                    score = score * 2;
                }else{
                    System.out.println("You lost all your points unlucky");
                    score = 0;
                }
            }
            boolean valid = true;
            while (valid == true) {

                if (choice.equalsIgnoreCase("paper") || choice.equalsIgnoreCase("scissors") || choice.equalsIgnoreCase("rock") || choice.equalsIgnoreCase("stop")||choice.equalsIgnoreCase("double")) {
                    valid = false;
                } else {
                    System.out.println("That is an invalid input.\nEnter a valid input");
                    valid = true;
                    System.out.println("\nChoose either \"Rock\",\"Paper\",\"Scissors\" or \"Stop\" if you want to stop playing.");
                    choice = input.next();
                }
            }
            
            

            if (choice.equalsIgnoreCase("stop")) {
                stop = false;
            }

            if (aiChoice.equalsIgnoreCase(choice)) {
                System.out.println("You both chose " + aiChoice + " so you tied.");
                round++;
                draw++;
            } else if (choice.equalsIgnoreCase("rock") && aiChoice.equalsIgnoreCase("paper")) {
                System.out.println("You chose " + choice + " and the computer chose " + aiChoice + " so you lost.");
                round++;
                lose++;
            } else if (choice.equalsIgnoreCase("rock") && aiChoice.equalsIgnoreCase("scissors")) {
                System.out.println("You chose " + choice + " and the computer chose " + aiChoice + " so you won.");
                win++;
                round++;
                score++;
            } else if (choice.equalsIgnoreCase("scissors") && aiChoice.equalsIgnoreCase("paper")) {
                System.out.println("You chose " + choice + " and the computer chose " + aiChoice + " so you won.");
                win++;
                round++;
                score++;
            } else if (choice.equalsIgnoreCase("scissors") && aiChoice.equalsIgnoreCase("rock")) {
                System.out.println("You chose " + choice + " and the computer chose " + aiChoice + " so you lost.");
                round++;
                lose++;
            } else if (choice.equalsIgnoreCase("paper") && aiChoice.equalsIgnoreCase("rock")) {
                System.out.println("You chose " + choice + " and the computer chose " + aiChoice + " so you won.");
                win++;
                round++;
                score++;
            } else if (choice.equalsIgnoreCase("paper") && aiChoice.equalsIgnoreCase("scissors")) {
                System.out.println("You chose " + choice + " and the computer chose " + aiChoice + " so you lost.");
                round++;
                lose++;
            }
        }
        System.out.println("You won a total of " + win + " out of " + round + " games");
        System.out.println("You lost a total of " + lose + " out of " + round + " games");
        System.out.println("You drew a total of " + draw + " out of " + round + " games");
        System.out.println("You ended up with a total score of "+score);
    }

}
