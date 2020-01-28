package com.company;

import java.util.Scanner;

public class Game_Mode_Human_Human extends GameMode {
    ChangePlayer playerChanger = new ChangePlayer();
    Scanner input = new Scanner(System.in);
    private int row,col;

    public void StartGame() {
        for (int i = 0; i < board.tictactoeboard.length; i++) {
            for (int j = 0; j < board.tictactoeboard[0].length; j++) {
                board.tictactoeboard[i][j] = '_';
            }
        }


        board.printboard();

        while (winner()) {
            if(isFull()==false) {
                row = input.nextInt();
                col = input.nextInt();
                if ((row == 0 || col == 0) || (row > 3 || col > 3)) {
                    System.out.println("You've inputed place, which is out of the board!\nTry again!");

                } else {
                    if (FullPlace(row, col)) {
                        System.err.println("The place is taken");

                    } else {
                        board.tictactoeboard[row - 1][col - 1] = playerChanger.getTurn();
                        board.printboard();
                        playerChanger.whichPlayer();
                    }

                }

            }
            else
                break;
        }
            if(winner()==false){
                playerChanger.whichPlayer();
            System.out.println("the winner is " + playerChanger.getTurn());
            }
            else
            {
              System.out.println("No one is winner");
            }

    }
}