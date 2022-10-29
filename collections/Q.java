package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class Q extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("quicksand\nquicksilver");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String q = input.nextLine();
        switch(q) {
            case "quicksand" -> Combination.quicksand();
            case "quicksilver" -> Combination.quicksilver();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}