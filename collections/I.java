package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class I extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("ice\nicecream\nicecreamtruck\nicesculpture\niceberg\nicedtea\nidea\nigloo\ninternet\nisland\nivy");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String i = input.nextLine();
        switch (i){
            case "ice" -> Combination.ice();
            case "icecream" -> Combination.icecream();
            case "icecreamtruck" -> Combination.icecreamtruck();
            case "icesculpture" -> Combination.icesculpture();
            case "iceberg" -> Combination.iceberg();
            case "icedtea" -> Combination.icedtea();
            case "idea" -> Combination.idea();
            case "igloo" -> Combination.igloo();
            case "internet" -> Combination.internet();
            case "island" -> Combination.island();
            case "ivy" -> Combination.ivy();
        }
    }
}
