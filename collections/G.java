package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class G extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("galaxy\ngalaxy cluster\ngarage\ngarden\ngardener\ngas\ngeyser\nghost\ngift\nginger bread house\ngingerbread man\nglacier\nglass\nglasses\ngnome\ngoat\ngold\ngolem\ngranite\ngrass\ngrave\ngravestone\ngraveyard\ngreenhouse\ngrenade\ngrilled cheese\ngrim reaper\ngun\ngunpowder\ngust");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String g = input.nextLine();
        switch(g) {
            case "galaxy" -> Combination.galaxy();
            case "galaxy cluster" -> Combination.galaxycluster();
            case "garage" -> Combination.garage();
            case "garden" -> Combination.garden();
            case "gardener" -> Combination.gardener();
            case "gas" -> Combination.gas();
            case "geyser" -> Combination.geyser();
            case "ghost" -> Combination.ghost();
            case "gift" -> Combination.gift();
            case "gingerbread house" -> Combination.gingerbreadhouse();
            case "gingerbread man" -> Combination.gingerbreadman();
            case "glacier" -> Combination.glacier();
            case "glass" -> Combination.glass();
            case "glasses" -> Combination.glasses();
            case "gnome" -> Combination.gnome();
            case "goat" -> Combination.goat();
            case "gold" -> Combination.gold();
            case "golem" -> Combination.golem();
            case "granite" -> Combination.granite();
            case "grass" -> Combination.grass();
            case "grave" -> Combination.grave();
            case "gravestone" -> Combination.gravestone();
            case "graveyard" -> Combination.graveyard();
            case "greenhouse" -> Combination.greenhouse();
            case "grenade" -> Combination.grenade();
            case "grilled cheese" -> Combination.grilledcheese();
            case "grim reaper" -> Combination.grimreaper();
            case "gun" -> Combination.gun();
            case "gunpowder" -> Combination.gunpowder();
            case "gust" -> Combination.gust();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}