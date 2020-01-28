package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args)
        {
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
