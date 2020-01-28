package com.company;

public class Human extends GetTicTacToeMove
{   String Name;

 public Human(String Name)
 {
     this.Name=Name;
  System.out.println("Player Name"+" "+Name);
 }
  public GetTicTacToeMove getMove(int x,int y,char move)
  {
      return new GetTicTacToeMove(x,y,move);
  }


}

