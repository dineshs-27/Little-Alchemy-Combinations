package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class D extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("dam\ndarkness\ndawn\nday\ndeath\ndesert\ndew\ndiamond\ndinosaur\ndiver\ndoctor\ndog\ndoge\ndoghouse\ndomestication\ndon quixote\ndonut\ndouble rainbow!\ndough\ndragon\ndrone\ndrum\ndrunk\ndry ice\nduck\nduckling\ndune\ndust\ndynamite");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String d = input.nextLine();
        switch(d) {
            case "dam" -> Combination.dam();
            case "darkness" -> Combination.darkness();
            case "dawn" -> Combination.dawn();
            case "day" -> Combination.day();
            case "death" -> Combination.death();
            case "desert" -> Combination.desert();
            case "dew" -> Combination.dew();
            case "diamond" -> Combination.diamond();
            case "dinosaur" -> Combination.dinosaur();
            case "diver" -> Combination.diver();
            case "doctor" -> Combination.doctor();
            case "dog" -> Combination.dog();
            case "doge" -> Combination.doge();
            case "doghouse" -> Combination.doghouse();
            case "domestication" -> Combination.domestication();
            case "don quixote" -> Combination.donquixote();
            case "donut" -> Combination.donut();
            case "double rainbow!" -> Combination.doublerainbow();
            case "dough" -> Combination.dough();
            case "dragon" -> Combination.dragon();
            case "drone" -> Combination.drone();
            case "drum" -> Combination.drum();
            case "drunk" -> Combination.drunk();
            case "dry ice" -> Combination.dryice();
            case "duck" -> Combination.duck();
            case "duckling" -> Combination.duckling();
            case "dune" -> Combination.dune();
            case "dust" -> Combination.dust();
            case "dynamite" -> Combination.dynamite();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}