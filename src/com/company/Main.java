package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //I'm thinking of a number. Guess it.
    // If you've ever played that game or some version of it you're ready for the next assignment.
    // The computer will "pick" a number. Actually, you'll program one in the code. You can use a random number if you're ambitious.
    //
    //Create a number-guessing game using a while-loop.
    // The loop will allow users to guess until they get the number right.
    // Your program will keep looping as long as the guess is different from the secret number.
    //
    //The output should look like this: (Secret number = 6)
    //
    //I have chosen a number between 1 and 10. Try to guess it.
    //Your guess: 5
    //That is incorrect. Guess again.
    //Your guess: 8
    //That is incorrect. Guess again.
    //Your guess: 6
    //That's right! You're a good guesser.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randNum = rand.nextInt(10)+1;

        System.out.println("I Have chosen a number between 1 and 10. Try to guess it.");

       while (true) {
           System.out.print("Your guess: ");
           int guess = input.nextInt();
           if (guess == randNum){
               System.out.println("Bravo!!");
               break;
            }else if (guess!=randNum){
               System.out.println("Do you wanna try again? (y/n): ");
               String ans = input.next();
                if (ans.equalsIgnoreCase("n")){
                    break;
                }
               }
           }


        System.out.println("Random number: "+ randNum);

       }


    }

