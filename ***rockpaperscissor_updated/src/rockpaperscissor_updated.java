/*
Mosammad Kabir
CUS 1115
March 28,2021
Professor DeBello
 */

import java.util.Scanner;
public class rockpaperscissor_updated {
        public static void main(String[] args){

            int yourCount= 0;// yourChoice wins, CompChoice loss
            int compCount = 0;// CompChoice wins, yourChoice loss.
            int round = 0;// 3 rounds
            int tied=0;
            while (round<3)
            {
                int yourChoice;
                System.out.println("We are going to play a game of rock, paper, scissors.\n" +
                        "\nPlease choose 1 for Rock, 2 for Paper, or 3 for Scissors: ");
                Scanner kb=new Scanner(System.in);
                yourChoice=kb.nextInt();
                if (yourChoice==1)
                    System.out.println("\nYou chose rock.");
                else if (yourChoice==2)
                    System.out.println("\nYou chose paper.");
                else if (yourChoice==3)
                    System.out.println("\nYou chose scissors.");



                int compChoice=(int)(3*Math.random())+1;
                if (compChoice==1)
                    System.out.println("\nThe Computer chose rock.");
                else if (compChoice==2)
                    System.out.println("\nThe Computer chose paper.");
                else if (compChoice==3)
                    System.out.println("\nThe Computer chose scissors.");

                //chooses random number between 1 and 3.

                if(yourChoice==compChoice) {
                    System.out.println("\nIt's a tie! \nYour choice was " + yourChoice + " and the Computer's choice was " + compChoice);
                    round = round + 1;
                    tied=tied+1;
                }
                else if (yourChoice == 1 && compChoice == 3 || yourChoice == 2 && compChoice==1 || yourChoice==3&&compChoice==2) {
                    System.out.println("\nYou win! Computer loses! \nYour choice was " + yourChoice + " and the Computer choice was " + compChoice);
                    compCount = 1 + compCount;
                    round = round + 1;
                }
                else
                {
                    System.out.println("\nYou lose! Computer wins! \nYour choice was "+yourChoice+" and the Computer choice was "+compChoice);
            compCount=compCount+1;
                round=round+1;

            }}
            System.out.println("\nYou won "+yourCount+" times.\n The computer won "+compCount+" times. \nYou tied "+tied+" times.");
                if(yourCount>compCount)
                {
                    System.out.println("\nYou Won The Best of Three!");
                }
                if(compCount>yourCount)
                {
                System.out.println("\nThe Computer Wins The Best of Three!");
            }
                if(compCount==yourCount)
                {
                    System.out.println("\nIt's a tie!");
                }
        }}
/*
We are going to play a game of rock, paper, scissors.

Please choose 1 for Rock, 2 for Paper, or 3 for Scissors:
1

You chose rock.

The Computer chose rock.

It's a tie!
Your choice was 1 and the Computer's choice was 1
We are going to play a game of rock, paper, scissors.

Please choose 1 for Rock, 2 for Paper, or 3 for Scissors:
2

You chose paper.

The Computer chose scissors.

You lose! Computer wins!
Your choice was 2 and the Computer choice was 3
We are going to play a game of rock, paper, scissors.

Please choose 1 for Rock, 2 for Paper, or 3 for Scissors:
3

You chose scissors.

The Computer chose rock.

You lose! Computer wins!
Your choice was 3 and the Computer choice was 1

You won 0 times.
 The computer won 2 times.
You tied 1 times.

The Computer Wins The Best of Three!
 */

/*
UPDATED LAB:
For extra credit revisit the Rock paper scissors lab.
Calculate the best of 3 between you and the computer
Keep a tally of yourCount and compCount for each time you or the computer wins.
If it is a tie no one wins.
In your final output you should have displayed number of times you win,
number of times computer wins
and number of times tied
and the final outcome of who wins or if it is an overall tie.
 */