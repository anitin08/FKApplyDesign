package com.company;

import java.util.Scanner;

public class Game_Mode_Human_Human extends GameMode {
    ChangePlayer playerChanger = new ChangePlayer();
    Scanner input = new Scanner(System.in);
    private int row,col;


    public void Start()
    {
        for(int i=0;i<board.tictactoeboard.length;i++)
        {
            for(int j=0;j<board.tictactoeboard[0].length;j++) {
                System.out.println("Game in Cell At position" +i+" "+j);
                board.winner[i][j] = StartGame(board.tictactoeboard[i][j].cell);
                //System.out.println("winner of this match is"+board.winner[i][j]);
            }
            if(!winner(board.winner))
                break;


        }
        char c =finalWinner(board.winner);

        System.out.println("winner is "+c);

        System.out.println("Do you want see leader Board:y");
        String state = input.next();
        if(state.equals("y"))
        {
            board.printLeaderBoard(board.winner);
        }

    }

    public char StartGame(char cell[][]) {

        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell[0].length; j++) {
                cell[i][j] = '_';
            }
        }


        board.printboard();

        while (winner(cell)) {
            if(isFull(cell)==false) {
                row = input.nextInt();
                col = input.nextInt();
                System.out.println("Do you want to undo your move press 1");
                String undo=input.next();
                if(undo.equals("1"))
                {
                    row = input.nextInt();
                    col = input.nextInt();
                }
                if ((row == 0 || col == 0) || (row > 3 || col > 3)) {
                    System.out.println("You've inputed place, which is out of the board!\nTry again!");

                } else {
                    if (FullPlace(cell,row, col)) {
                        System.err.println("The place is taken");

                    } else {
                        cell[row - 1][col - 1] = playerChanger.getTurn();
                        board.printboard();
                        playerChanger.whichPlayer();
                    }

                }

            }
            else
                break;
        }
        if(winner(cell)==false){
            playerChanger.whichPlayer();
            // System.out.println("the winner is " + playerChanger.getTurn());
            return playerChanger.getTurn();
        }
        return 'N';

    }
}