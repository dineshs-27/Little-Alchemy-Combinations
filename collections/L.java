package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class L extends Abstract{
    @Override
    public void alphabet() {
        System.out.println(""lake\nlamp\nland\nlaptop\nlasso\nlava\nlavalamp\nlawn\nlawnmower\nleaf\nleather\nlegend\nlens\nletter\nlibrarian\nlibrary\nlife\nlight\nlightbulb\nlightsword\nlighthouse\nlightning\nlion\nliquid\nlittlealchemy\nlivestock\nlizard\nlogcabin\nlove\nlumberjack"");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String l = input.nextLine();
        switch (l) {
            case "lake" -> Combination.lake();
            case "lamp" -> Combination.lamp();
            case "land" -> Combination.land();
            case "laptop" -> Combination.laptop();
            case "lasso" -> Combination.lasso();
            case "lava" -> Combination.lava();
            case "lavalamp" -> Combination.lavalamp();
            case "lawn" -> Combination.lawn();
            case "lawnmower" -> Combination.lawnmover();
            case "leaf" -> Combination.leaf();
            case "leather" -> Combination.leather();
            case "legend" -> Combination.legend();
            case "lens" -> Combination.lens();
            case "letter" -> Combination.letter();
            case "librarian" -> Combination.librarian();
            case "library" -> Combination.library();
            case "life" -> Combination.life();
            case "light" -> Combination.light();
            case "lightbulb" -> Combination.lightbulb();
            case "lightsword" -> Combination.lightsword();
            case "lighthouse" -> Combination.lighthouse();
            case "lightning" -> Combination.lightning();
            case "lion" -> Combination.lion();
            case "liquid" -> Combination.liquid();
            case "littlealchemy" -> Combination.littlealchemy();
            case "livestock" -> Combination.livestock();
            case "lizard" -> Combination.lizard();
            case "logcabin" -> Combination.logcabin();
            case "love" -> Combination.love();
            case "lumberjack" -> Combination.lumberjack();
        }
    }
}
