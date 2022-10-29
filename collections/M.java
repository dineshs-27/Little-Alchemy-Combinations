package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class M extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("mac and cheese\nmachine\nmagic\nmagma\nmailbox\nmailman\nmail truck\nmanatee\nmap\nmaple syrup\nmars\nmarshmallows\nmayonnaise\nmeat\nmedusa\nmercury\nmermaid\nmetal\nmeteor\nmeteoroid\nmicroscope\nmilk\nmilkshake\nmineral\nminotaur\nmirror\nmist\nmold\nmonarch\nmoney\nmonkey\nmoon\nmoon rover\nmoss\nmoth\nmotion\nmotorcycle\nmountain\nmountain goat\nmountain range\nmouse\nmousetrap\nmud\nmummy\nmusic\nmusician");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String m = input.nextLine();
        switch(m) {
            case "mac and cheese" -> Combination.macandcheese();
            case "machine" -> Combination.machine();
            case "magic" -> Combination.magic();
            case "magma" -> Combination.magma();
            case "mailbox" -> Combination.mailbox();
            case "mailman" -> Combination.mailman();
            case "mail truck" -> Combination.mailtruck();
            case "manatee" -> Combination.manatee();
            case "map" -> Combination.map();
            case "maple" -> Combination.maplesyrup();
            case "mars" -> Combination.mars();
            case "marshmallows" -> Combination.marshmallows();
            case "mayonnaise" -> Combination.mayonnaise();
            case "meat" -> Combination.meat();
            case "medusa" -> Combination.medusa();
            case "mercury" -> Combination.mercury();
            case "mermaid" -> Combination.mermaid();
            case "metal" -> Combination.metal();
            case "meteor" -> Combination.meteor();
            case "meteoroid" -> Combination.meteoroid();
            case "microscope" -> Combination.microscope();
            case "milk" -> Combination.milk();
            case "milkshake" -> Combination.milkshake();
            case "mineral" -> Combination.mineral();
            case "minotaur" -> Combination.minotaur();
            case "mirror" -> Combination.mirror();
            case "mist" -> Combination.mist();
            case "mold" -> Combination.mold();
            case "monarch" -> Combination.monarch();
            case "money" -> Combination.money();
            case "monkey" -> Combination.monkey();
            case "moon" -> Combination.moon();
            case "moon rover" -> Combination.moonrover();
            case "moss" -> Combination.moss();
            case "moth" -> Combination.moth();
            case "motion" -> Combination.motion();
            case "motorcycle" -> Combination.motorcycle();
            case "mountain" -> Combination.mountain();
            case "mountain goat" -> Combination.mountaingoat();
            case "mountain range" -> Combination.mountainrange();
            case "mouse" -> Combination.mouse();
            case "mousetrap" -> Combination.mousetrap();
            case "mud" -> Combination.mud();
            case "mummy" -> Combination.mummy();
            case "music" -> Combination.music();
            case "musician" -> Combination.musician();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}