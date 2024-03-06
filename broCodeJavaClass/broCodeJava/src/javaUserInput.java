// Take user input

import java.util.Scanner;

public class javaUserInput {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = userInput.nextLine();
        System.out.println("How old are you? ");
        int age = userInput.nextInt();
        userInput.nextLine();
        System.out.println("What is your favorite food?");
        String food = userInput.nextLine();

        System.out.println("Hello " + name + ". ");
        System.out.println("You are " + age + " years old. ");
        System.out.println("Your favorite food is: " + food + ". ");

    }
}
