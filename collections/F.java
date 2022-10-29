package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class F extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("fabric\nfactory\nfairytale\nfamily\nfamily tree\nfarm\nfarmer\nfaun\nfence\nfield\nfire\nfire extinguisher\nfirefighter\nfireplace\nfire station\nfiretruck\nfirewall\nfireworks\nfish\nfishing rod\nflamethrower\nflashlight\nflood\nflour\nflower\nflute\nflying fish\nflying squirrel\nfog\nforce knight\nforest\nfork\nfortune cookie\nfossil\nfountain\nfox\nfrankenstein's monster\nfrench fries\nfridge\nfrog\nfrozen yogurt\nfruit\nfruit tree");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String f = input.nextLine();
        switch(f) {
            case "fabric" -> Combination.fabric();
            case "factory" -> Combination.factory();
            case "fairytale" -> Combination.fairytale();
            case "family" -> Combination.family();
            case "family tree" -> Combination.familytree();
            case "farm" -> Combination.farm();
            case "farmer" -> Combination.farmer();
            case "faun" -> Combination.faun();
            case "fence" -> Combination.fence();
            case "field" -> Combination.field();
            case "fire" -> Combination.fire();
            case "fire extinguisher" -> Combination.fireextinguisher();
            case "firefighter" -> Combination.firefighter();
            case "fireplace" -> Combination.fireplace();
            case "fire station" -> Combination.firestation();
            case "firetruck" -> Combination.firetruck();
            case "firewall" -> Combination.firewall();
            case "fireworks" -> Combination.fireworks();
            case "fish" -> Combination.fish();
            case "fishing rod" -> Combination.fishingrod();
            case "flamethrower" -> Combination.flamethrower();
            case "flashlight" -> Combination.flashlight();
            case "flood" -> Combination.flood();
            case "flour" -> Combination.flour();
            case "flower" -> Combination.flower();
            case "flute" -> Combination.flute();
            case "flying fish" -> Combination.flyingfish();
            case "flying squirrel" -> Combination.flyingsquirrel();
            case "fog" -> Combination.fog();
            case "force knight" -> Combination.forceknight();
            case "forest" -> Combination.forest();
            case "fork" -> Combination.fork();
            case "fortune cookie" -> Combination.fortunecookie();
            case "fossil" -> Combination.fossil();
            case "fountain" -> Combination.fountain();
            case "fox" -> Combination.fox();
            case "frankenstein's monster" -> Combination.frankensteinsmonster();
            case "french fries" -> Combination.frenchfries();
            case "fridge" -> Combination.fridge();
            case "frog" -> Combination.frog();
            case "frozen yogurt" -> Combination.frozenyogurt();
            case "fruit" -> Combination.fruit();
            case "fruit tree" -> Combination.fruittree();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}