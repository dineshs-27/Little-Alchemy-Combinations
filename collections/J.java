package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class J extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("jack-o-lantern\njam\njar\njerky\njuice\njupiter");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String j = input.nextLine();
        switch(j) {
            case "jack-o-lantern" -> Combination.jackolantern();
            case "jam" -> Combination.jam();
            case "jar" -> Combination.jar();
            case "jerky" -> Combination.jerky();
            case "juice" -> Combination.juice();
            case "jupiter" -> Combination.jupiter();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}