package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class Z extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("zombie\nzoo");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String z = input.nextLine();
        switch(z) {
            case "zombie" -> Combination.zombie();
            case "zoo" -> Combination.zoo();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}