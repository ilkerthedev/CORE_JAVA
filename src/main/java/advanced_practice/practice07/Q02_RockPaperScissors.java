package advanced_practice.practice07;

import java.util.Scanner;

public class Q02_RockPaperScissors {
    /*
        Taş-Kağıt-Makas oyunu yazınız.
            -Oyuncudan tahmin alınız.
            -Bilgisayarın tahmini ile karşılaştırınız.
            -3'e ilk ulaşan kazanır
            -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Bronz Skor ile kazanır.
     */
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     int playerWinCounter = 0;
     int computerWinCounter = 0;
     int counter = 0;

     while(playerWinCounter<3 && computerWinCounter<3){
         counter++;
         System.out.println("Please enter your "+counter+". selection: Rock, Paper, Scissors");
         String playerSelection = input.next().toLowerCase().trim();
         if (!(playerSelection.equals("rock") || playerSelection.equals("paper") || playerSelection.equals("scissors"))) {
             System.out.println("Please enter a valid select");
             counter--;
             continue;
         }

         //Computer Selection
         String[] arrRPC = {"rock","paper","scissors"};
         String computerSelection =arrRPC[(int)(Math.random()*3)];
         System.out.println("computerSelection = " + computerSelection);

         if (playerSelection.equals(computerSelection)){
             System.out.println("Draw ! Score: "+playerWinCounter+"=="+computerWinCounter);
         }else if(playerSelection.equals("rock")&&computerSelection.equals("scissors")
                 || playerSelection.equals("paper") && computerSelection.equals("rock")
                 || playerSelection.equals("scissors") && computerSelection.equals("paper")){
             playerWinCounter++;
             System.out.println("You won ! Score: "+playerWinCounter+"=="+computerWinCounter);
         }else {
             computerWinCounter++;
             System.out.println("You lost ! Score: "+playerWinCounter+"=="+computerWinCounter);
         }
     }
        System.out.println("Game Over !");

     int trophySelect = playerWinCounter-computerWinCounter;

     switch (trophySelect){
         case 3:
             System.out.println("You won with Gold Trophy !");
             break;
         case 2:
             System.out.println("You won with Silver Trophy !");
             break;
         case 1:
             System.out.println("You won with Bronze Trophy !");
             break;
         case -1:
             System.out.println("Computer won with Bronze Trophy !");
             break;
         case -2:
             System.out.println("Computer won with Silver Trophy !");
             break;
         case -3:
             System.out.println("Computer won with Gold Trophy !");
             break;
     }

    }

}
