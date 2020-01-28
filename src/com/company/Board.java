package com.company;

public class Board {
   static char tictactoeboard[][];
   Board(int n)
   {
       tictactoeboard = new char[n][n];
   }
    public void printboard() {

        System.out.println("-------------");
        for (int i = 0; i <tictactoeboard.length ; i++) {
            System.out.print("| ");
            for (int j = 0; j <tictactoeboard[0].length ; j++) {

                System.out.print(tictactoeboard[i][j] + " | ");

            }
            System.out.println();

        }
        System.out.println("-------------");

    }
}
