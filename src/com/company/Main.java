package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args)
        { /* Scanner sc = new Scanner(System.in);
            PlayTicTacToe NewGame = new PlayTicTacToe();
            Human Player1 = new Human("Jack");
            Human Player2 = new Human("jerry");
            boolean win = false;

            while(true)
            {
                System.out.println("player 1 turn Enter x y and Move");
                int x=sc.nextInt();
                int y=sc.nextInt();
                char move= 'x';

                if(!NewGame.addMove(Player1.getMove(x,y,move)))
                    break;

                NewGame.print(NewGame.TicTacToeBoard);


                System.out.println("player 2 turn Enter x y and Move");
                int x1=sc.nextInt();
                int y1=sc.nextInt();
                char move1= 'o';

                if(!NewGame.addMove(Player2.getMove(x1,y1,move1)))
                {

                    System.out.println("Game over");
                    break;
                }
                NewGame.print(NewGame.TicTacToeBoard);
            }
            System.out.println("Game is finished let me check winner");
            char winner= NewGame.checkWinner(NewGame.TicTacToeBoard);

            if(winner=='x')
                System.out.println("winner is player 1");
            else if(winner=='o')
                System.out.println("winner is player 2");

            else
                System.out.println("no one is winner");*/
            Scanner sc  = new Scanner(System.in);

            System.out.println("enter the Game mode ");
            System.out.println("press1:human to human");
            System.out.println("press2:human to computer");
            int input = sc.nextInt();
            // System.out.println((input==1));

            while(!((input==1)||(input==2)))
            {
                System.out.println("invalid input please enter a valid input");
                input = sc.nextInt();

            }
            if(input==1)
            {
                Game_Mode_Human_Human allGame = new Game_Mode_Human_Human();
                allGame.StartGame();
            }
            else if(input==2)
            {
                Game_Mode_Human_Computer humantocomputer= new Game_Mode_Human_Computer();
                humantocomputer.StartGame();
            }





        }
}
