package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class J extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("Jack-O-Lantern\nJam\nJar\nJerky\nJuice\nJupiter");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String j = input.nextLine();
        switch (j){
            case "jack-o-lantern" -> Combination.jackolantern();
            case "jam" -> Combination.jam();
            case "jar" -> Combination.jar();
            case "jerky" -> Combination.jerky();
            case "juice" -> Combination.juice();
            case "jupiter" -> Combination.jupiter();
        }
    }
}