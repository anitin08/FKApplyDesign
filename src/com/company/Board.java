package com.company;

public class Board {
    static  Cell tictactoeboard[][];
    static char winner[][];
    Board(int n)
    {
        tictactoeboard = new Cell[n][n];
        winner = new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                tictactoeboard[i][j]= new Cell();

    }
    public void printboard()
    {
        for(int i=0;i<tictactoeboard.length;i++)
        {
            for(int j=0;j<tictactoeboard[0].length;j++)
            {
                print(tictactoeboard[i][j].cell);
            }
            System.out.println();
        }

    }

    public void printLeaderBoard(char winner[][])
    {
        for(int i=0;i<winner.length;i++)
        {
            for(int j=0;j<winner[0].length;j++)
            {
                if(winner[i][j]=='X')
                    System.out.print("winner is Player 1"+"  ");

                else if(winner[i][j]=='O')
                    System.out.print(" winner is Player 2"+"  ");
                else
                    System.out.print("No one is winner"+"  ");

            }
            System.out.println();
        }

    }


    public void print(char cell[][]) {

        System.out.println("-------------");
        for (int i = 0; i <3 ; i++) {
            System.out.print("| ");
            for (int j = 0; j <3 ; j++) {

                System.out.print(cell[i][j] + " | ");

            }
            System.out.println();

        }
        System.out.println("-------------");

    }
}
