package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class O extends Abstract{
    @Override
    public void alphabet() {
        System.out.println("oasis\nobsidian\nocean\noil\nomelette\nopticalfiber\norchard\nore\norganicmatter\norigami\nostrich\nowl\noxygen\nozone");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String o = input.nextLine();
        switch (o) {
            case "oasis" -> Combination.oasis();
            case "obsidian" -> Combination.obsidian();
            case "ocean" -> Combination.ocean();
            case "oil" -> Combination.oil();
            case "omelette" -> Combination.omelette();
            case "opticalfiber" -> Combination.opticalfibre();
            case "orchard" -> Combination.orchard();
            case "ore" -> Combination.ore();
            case "organicmatter" -> Combination.organicmatter();
            case "origami" -> Combination.origami();
            case "ostrich" -> Combination.ostrich();
            case "owl" -> Combination.owl();
            case "oxygen" -> Combination.oxygen();
            case "ozone" -> Combination.ozone();
        }
    }
}
