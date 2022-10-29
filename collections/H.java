package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class H extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("hacker\nhail\nham\nhamburger\nhammer\nhamster\nhangar\nharp\nhay\nhay bale\nheat\nhedge\nhedgehog\nhelicopter\nhero\nhill\nhippo\nhoney\nhorizon\nhorse\nhorseshoe\nhospital\nhot chocolate\nhourglass\nhouse\nhuman\nhummingbird\nhurricane\nhusky");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String h = input.nextLine();
        switch(h) {
            case "hacker" -> Combination.hacker();
            case "hail" -> Combination.hail();
            case "ham" -> Combination.ham();
            case "hamburger" -> Combination.hamburger();
            case "hammer" -> Combination.hammer();
            case "hamster" -> Combination.hamster();
            case "hanger" -> Combination.hanger();
            case "harp" -> Combination.harp();
            case "hay" -> Combination.hay();
            case "hay bale" -> Combination.haybale();
            case "heat" -> Combination.heat();
            case "hedge" -> Combination.hedge();
            case "hedgehog" -> Combination.hedgehog();
            case "helicopter" -> Combination.helicopter();
            case "hero" -> Combination.hero();
            case "hill" -> Combination.hill();
            case "hippo" -> Combination.hippo();
            case "honey" -> Combination.honey();
            case "horizon" -> Combination.horizon();
            case "horse" -> Combination.horse();
            case "horseshoe" -> Combination.horseshoe();
            case "hospital" -> Combination.hospital();
            case "hot chocolate" -> Combination.hotchocolate();
            case "hourglass" -> Combination.hourglass();
            case "house" -> Combination.house();
            case "human" -> Combination.human();
            case "hummingbird" -> Combination.hummingbird();
            case "hurricane" -> Combination.hurricane();
            case "husky" -> Combination.husky();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}