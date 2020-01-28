package com.company;

public abstract class GameMode {


    Board board =  new Board(3);


    ///function for checking winner
    public boolean checkSame(char a,char b,char c)
    {
      if((a!='_')&&(a==b)&&(a==c))
         return true;

     return false;
    }
    public boolean winner()
    {
    for(int i=0;i<board.tictactoeboard.length;i++)
    {
       if( checkSame(board.tictactoeboard[i][0],board.tictactoeboard[i][1],board.tictactoeboard[i][2]))
          return false;

    }

        for(int i=0;i<board.tictactoeboard.length;i++)
        {
            if( checkSame(board.tictactoeboard[0][i],board.tictactoeboard[1][i],board.tictactoeboard[2][i]))
              return false;

        }

        if(checkSame(board.tictactoeboard[0][0],board.tictactoeboard[1][1],board.tictactoeboard[2][2]))
          return  false;

        if(checkSame(board.tictactoeboard[0][2],board.tictactoeboard[1][1],board.tictactoeboard[2][0]))
            return false;

            return true;
    }





    public boolean isFull()
    {
      int n=0;
     for(int i =0;i<board.tictactoeboard.length;i++)
     {
      for(int j=0;j<board.tictactoeboard[0].length;j++)
      {
          if(board.tictactoeboard[i][j]=='X'||board.tictactoeboard[i][j]=='O')
          {
              n++;
          }
      }

     }
       if(n==(board.tictactoeboard.length*board.tictactoeboard[0].length))
            return true;

       return false;
    }

    ///function for checking cell is already full
    public boolean FullPlace(int row ,int col) {
        {

            if (board.tictactoeboard[row - 1][col - 1] == 'X' ||
                    board.tictactoeboard[row - 1][col - 1] == 'O') {
                return true;
            }
            return false;

        }
    }
      //function for starting a game

       public abstract void StartGame ();
    }

