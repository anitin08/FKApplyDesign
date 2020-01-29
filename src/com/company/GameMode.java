package com.company;
import java.util.Scanner;

public abstract class GameMode {


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Board board =  new Board(n);



    public boolean checkSame(char a,char b,char c)
    {
        if((a!='N')&&(a!='\u0000')&&(a!='_')&&(a==b)&&(a==c))
            return true;

        return false;
    }

    public boolean winner(char cell[][])
    {
        int countx=0;
        int counto=0;

        for(int i=0;i<cell.length;i++)
        {
            for(int j=0;j<cell[0].length;j++)
            {
                if(cell[i][j]=='X')
                    countx++;
                else if(cell[i][j]=='O')
                    counto++;

            }
            if(counto==cell.length||countx==cell.length)
                return false ;
            counto=0;
            countx=0;
        }
        counto=0;
        countx=0;

        for(int j=0;j<cell[0].length;j++)
        {
            for(int i=0;i<cell.length;i++)
            {
                if(cell[j][i]=='X')
                    countx++;
                else if( cell[i][j]=='O')
                    counto++;

            }
            if(counto==cell.length||countx==cell.length)
                return false;
            counto=0;
            countx=0;

        }
        //right diagonal
        counto=0;
        countx=0;
        for(int i=0;i<cell.length;i++)
        {
            if(cell[i][i]=='X')
                countx++;
            else if(cell[i][i]=='O')
                counto++;

        }
        if(counto==cell.length||countx==cell.length)
            return false ;



        //left diagonal
        counto=0;
        countx=0;

        for(int i=0;i<cell.length;i++)
        {

            if(cell[i][cell[0].length-i-1]=='X')
                countx++;
            else if(cell[i][cell[0].length-i-1]=='O')
                counto++;

        }
        if(counto==cell.length|| countx==cell.length)
            return false ;




        return true;

//       for(int i=0;i<cell.length;i++)
//    {
//       if( checkSame(cell[i][0],cell[i][1],cell[i][2]))
//              return false;
//
//    }
//
//        for(int i=0;i<cell[0].length;i++)
//        {
//            if( checkSame(cell[0][i],cell[1][i],cell[2][i]))
//              return false;
//
//        }
//
//        if(checkSame(cell[0][0],cell[1][1],cell[2][2]))
//            return  false;
//
//        if(checkSame(cell[0][2],cell[1][1],cell[2][0]))
//            return false;
//
//            return true;
    }

    public char finalWinner(char cell[][])
    {
        int countx=0;
        int counto=0;

        for(int i=0;i<cell.length;i++)
        {
            for(int j=0;j<cell[0].length;j++)
            {
                if(cell[i][j]=='X')
                    countx++;
                else if(cell[i][j]=='O')
                    counto++;

            }
            if(counto==cell.length)
                return 'O';
            else if(countx==cell.length)
                return 'X';
            counto=0;
            countx=0;
        }
        counto=0;
        countx=0;

        for(int j=0;j<cell[0].length;j++)
        {
            for(int i=0;i<cell.length;i++)
            {
                if(cell[j][i]=='X')
                    countx++;
                else if( cell[i][j]=='O')
                    counto++;

            }
            if(counto==cell.length)
                return 'O';
            else if(countx==cell.length)
                return 'X';

            counto=0;
            countx=0;
        }
        //right diagonal
        counto=0;
        countx=0;
        for(int i=0;i<cell.length;i++)
        {
            if(cell[i][i]=='X')
                countx++;
            else if(cell[i][i]=='O')
                counto++;

        }
        if(counto==cell.length)
            return 'O';
        else if (countx==cell.length)
            return 'X' ;



        //left diagonal
        counto=0;
        countx=0;

        for(int i=0;i<cell.length;i++)
        {

            if(cell[i][cell[0].length-i-1]=='X')
                countx++;
            else if(cell[i][cell[0].length-i-1]=='O')
                counto++;

        }
        if(counto==cell.length)
            return 'O';

        else if( countx==cell.length)
            return 'X';




        return 'N';
//        for(int i=0;i<cell.length;i++)
//        {
//            if( checkSame(cell[i][0],cell[i][1],cell[i][2]))
//                return cell[i][0];
//
//        }
//
//        for(int i=0;i<cell[0].length;i++)
//        {
//            if( checkSame(cell[0][i],cell[1][i],cell[2][i]))
//                return cell[0][i];
//
//        }
//
//        if(checkSame(cell[0][0],cell[1][1],cell[2][2]))
//            return  cell[0][0];
//
//        if(checkSame(cell[0][2],cell[1][1],cell[2][0]))
//            return cell[0][0];
//
//        return 'N';
    }





    public boolean isFull(char cell[][])
    {
        int n=0;
        for(int i =0;i<cell.length;i++)
        {
            for(int j=0;j<cell[0].length;j++)
            {
                if(cell[i][j]=='X'||cell[i][j]=='O')
                {
                    n++;
                }
            }

        }
        if(n==(cell.length*cell[0].length))
            return true;

        return false;
    }



    public boolean FullPlace(char cell[][],int row ,int col) {
        {

            if (cell[row - 1][col - 1] == 'X' ||
                    cell[row - 1][col - 1] == 'O') {
                return true;
            }
            return false;

        }
    }
    //function for starting a game

    public abstract char StartGame (char cell[][]);
}

