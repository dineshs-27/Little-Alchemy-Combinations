package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class A extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("acid rain\nair\nairplane\nalarm clock\nalchemist\nalcohol\nalgae\nalien\nallergy\nalligator\nalpaca\nambulance\nangel\nangler\nanimal\nant\nant farm\nantarctica\nanthill\napron\naquarium\narcheologist\narchipelago\narctic\narmadillo\narmor\narrow\nash\nastronaut\natmosphere\natomic bomb\naurora\navalanche\naviary\naxe");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String a = input.nextLine();
        switch(a) {
            case "acid rain" -> Combination.acidrain();
            case "air" -> Combination.air();
            case "airplane" -> Combination.airplane();
            case "alarm clock" -> Combination.alarmclock();
            case "alchemist" -> Combination.alchemist();
            case "alcohol" -> Combination.alcohol();
            case "algae" -> Combination.algae();
            case "alien" -> Combination.alien();
            case "allergy" -> Combination.allergy();
            case "alligator" -> Combination.alligator();
            case "alpaca" -> Combination.alpaca();
            case "ambulance" -> Combination.ambulance();
            case "angel" -> Combination.angel();
            case "angler" -> Combination.angler();
            case "animal" -> Combination.animal();
            case "ant" -> Combination.ant();
            case "ant farm" -> Combination.antfarm();
            case "antarctica" -> Combination.antarctica();
            case "anthill" -> Combination.anthill();
            case "apron" -> Combination.apron();
            case "aquarium" -> Combination.aquarium();
            case "archeologist" -> Combination.archeologist();
            case "archipelago" -> Combination.archipelago();
            case "arctic" -> Combination.arctic();
            case "armadillo" -> Combination.armadillo();
            case "armor" -> Combination.armor();
            case "arrow" -> Combination.arrow();
            case "ash" -> Combination.ash();
            case "astronaut" -> Combination.astronaut();
            case "atmosphere" -> Combination.atmosphere();
            case "atomic bomb" -> Combination.atomicbomb();
            case "aurora" -> Combination.aurora();
            case "avalanche" -> Combination.avalanche();
            case "aviary" -> Combination.aviary();
            case "axe" -> Combination.axe();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}