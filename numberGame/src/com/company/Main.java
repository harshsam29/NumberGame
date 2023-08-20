package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out.println("WELCOME TO THE NUMBER GAME");
        System.out.println("Guess the Number Form  1 to 100");

    }
    public int computerNo(){
        return computer;
    }
}
class user {
    static int takeUserInput() {
        int user;
        System.out.println("Enter : ");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int x, int y) {
        if (x == y) {
            System.out.println("Correct NO. Guess");
        } else if (x > y) {
            System.out.println("Too HIGH , Enter Small No.");
        } else {
            System.out.println("Too LOW , Enter Big No.");
        }
    }

    public static void main(String[] args) {
        int user = 0, computer = 0, score = 0;
        Game g = new Game();
        do {
            user = takeUserInput();
            computer = g.computerNo();
            isCorrectNumber(user, computer);
            score++;
        } while (user != computer);
        System.out.println("YOUR SCORE IS : " + score);
    }
}

