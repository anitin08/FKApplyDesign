package com.company;

import java.util.Scanner;

public class PlayTicTacToe extends GetTicTacToeMove {
    static char TicTacToeBoard[][];
    static boolean CheckMove[][];
  public PlayTicTacToe()
  {
      System.out.println("Starting new Game");
      TicTacToeBoard = new char[3][3];
      CheckMove = new boolean[3][3];
  }

  public boolean checkMove(int x,int y)
    {
     if(CheckMove[x][y]==true) {
         System.out.println("illegal Move");
     return false;
     }
     return true;
    }

    public boolean addMove(GetTicTacToeMove getmove)
    {  int x=getmove.x;
        int y= getmove.y;
       char c=getmove.c;

     if(x<3&&y<3&&(c=='x'||c=='o')&&checkMove(x, y))
     {
        TicTacToeBoard[x][y]=c;
        CheckMove[x][y]=true;
        return true;
     }

    return false;
    }

    public char checkWinner(char TicTacToeBoard[][])
    {
        int countx=0;
        int counto=0;

        for(int i=0;i<TicTacToeBoard.length;i++)
        {
        for(int j=0;j<TicTacToeBoard[0].length;j++)
        {
            if(TicTacToeBoard[i][j]=='x')
                countx++;
            else if(TicTacToeBoard[i][j]=='o')
              counto++;

        }
         if(counto==3)
           return 'o' ;

         else if(countx==3)
             return 'x';


        }
         counto=0;
        countx=0;

        for(int j=0;j<TicTacToeBoard[0].length;j++)
        {
            for(int i=0;i<TicTacToeBoard.length;i++)
            {
                if(TicTacToeBoard[j][i]=='x')
                    countx++;
                else if(TicTacToeBoard[i][j]=='o')
                    counto++;

            }
            if(counto==3)
                return 'o' ;

            else if(countx==3)
                return 'x';

        }
        //right diagonal
        counto=0;
        countx=0;
        for(int i=0;i<3;i++)
        {
            if(TicTacToeBoard[i][i]=='x')
                countx++;
            else if(TicTacToeBoard[i][i]=='o')
                counto++;

        }
        if(counto==3)
            return 'o' ;

        else if(countx==3)
            return 'x';

        //left diagonal
        counto=0;
        countx=0;

        for(int i=0;i<TicTacToeBoard.length;i++)
        {

            if(TicTacToeBoard[i][TicTacToeBoard[0].length-i-1]=='x')
                countx++;
            else if(TicTacToeBoard[i][TicTacToeBoard[0].length-i-1]=='o')
                counto++;

        }
        if(counto==3)
            return 'o' ;

        else if(countx==3)
            return 'x';



        return 'n';

    }

    public void print(char TicTacBoard[][])
    {
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++)
         {
          System.out.print(TicTacBoard[i][j]+" ");
         }
         System.out.println();



        }
    }




}
