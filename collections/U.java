package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class U extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("ufo\numbrella\nunicorn\nuniverse");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String u = input.nextLine();
        switch(u) {
            case "ufo" -> Combination.ufo();
            case "umbrella" -> Combination.umbrella();
            case "unicorn" -> Combination.unicorn();
            case "universe" -> Combination.universe();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}