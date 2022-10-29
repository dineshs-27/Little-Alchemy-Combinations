package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class I extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("ice\nice cream\nice cream truck\nice sculpture\niceberg\nicedtea\nidea\nigloo\ninternet\nisland\nivy");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String i = input.nextLine();
        switch(i) {
            case "ice" -> Combination.ice();
            case "ice cream" -> Combination.icecream();
            case "ice cream truck" -> Combination.icecreamtruck();
            case "ice sculpture" -> Combination.icesculpture();
            case "iceberg" -> Combination.iceberg();
            case "icedtea" -> Combination.icedtea();
            case "idea" -> Combination.idea();
            case "igloo" -> Combination.igloo();
            case "internet" -> Combination.internet();
            case "island" -> Combination.island();
            case "ivy" -> Combination.ivy();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}