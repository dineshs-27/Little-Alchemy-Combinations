package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class E extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("eagle\nearth\nearthquake\neclipse\negg\negg timer\nelectric car\nelectric eel\nelectrician\nelectricity\nemail\nenergy\nengineer\neruption\nexcalibur\nexplosion");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String e = input.nextLine();
        switch(e) {
            case "eagle" -> Combination.eagle();
            case "earth" -> Combination.earth();
            case "earthquake" -> Combination.earthquake();
            case "eclipse" -> Combination.eclipse();
            case "egg" -> Combination.egg();
            case "egg timer" -> Combination.eggtimer();
            case "electric car" -> Combination.electriccar();
            case "electric eel" -> Combination.electriceel();
            case "electrician" -> Combination.electrician();
            case "electricity" -> Combination.electricity();
            case "email" -> Combination.email();
            case "energy" -> Combination.energy();
            case "engineer" -> Combination.engineer();
            case "eruption" -> Combination.eruption();
            case "excalibur" -> Combination.excalibur();
            case "explosion" -> Combination.explosion();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}