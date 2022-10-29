package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class C extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("cable car\ncactus\ncage\ncake\ncamel\ncampfire\ncandle\ncandy cane\ncannon\ncanvas\ncar\ncaramel\ncarbon dioxide\ncarrot\ncart\ncashmere\ncastle\ncat\ncatnip\ncauldron\ncave\ncaviar\ncentaur\ncereal\nchain\nchainsaw\nchameleon\ncharcoal\ncheese\ncheeseburger\nchicken\nchicken coop\nchicken soup\nchicken wing\nchill\nchimney\nchocolate\nchocolate milk\nchristmas stocking\nchristmas tree\ncigarette\ncity\nclay\nclock\ncloset\ncloud\ncoal\ncoconut\ncoconut milk\ncoffin\ncold\ncombustion engine\ncomputer\ncomputer mouse\nconfetti\nconstellation\ncontainer\ncontinent\ncook\ncookbook\ncookie\ncookiecutter\ncookie dough\ncoral\ncorpse\ncotton\ncotton candy\ncow\ncrayon\ncrow\ncrystal ball\ncuckoo\ncup\ncurrent\ncutting board\ncyborg\ncyclist");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String c = input.nextLine();
        switch(c) {
            case "cable car" -> Combination.cablecar();
            case "cactus" -> Combination.cactus();
            case "cage" -> Combination.cage();
            case "cake" -> Combination.cake();
            case "camel" -> Combination.camel();
            case "campfire" -> Combination.campfire();
            case "candle" -> Combination.candle();
            case "candy cane" ->Combination.candycane();
            case "cannon" -> Combination.cannon();
            case "canvas" -> Combination.canvas();
            case "car" -> Combination.car();
            case "caramel" -> Combination.caramel();
            case "carbon dioxide" -> Combination.carbondioxide();
            case "carrot" -> Combination.carrot();
            case "cart" -> Combination.cart();
            case "cashmere" -> Combination.cashmere();
            case "castle" -> Combination.castle();
            case "cat" -> Combination.cat();
            case "catnip" -> Combination.catnip();
            case "cauldron" -> Combination.cauldron();
            case "cave" -> Combination.cave();
            case "caviar" -> Combination.caviar();
            case "centaur" -> Combination.centaur();
            case "cereal" -> Combination.cereal();
            case "chain" -> Combination.chain();
            case "chainsaw" -> Combination.chainsaw();
            case "chameleon" -> Combination.chameleon();
            case "charcoal" -> Combination.charcoal();
            case "cheese" -> Combination.cheese();
            case "cheeseburger" -> Combination.cheeseburger();
            case "chicken" -> Combination.chicken();
            case "chicken coop" -> Combination.chickencoop();
            case "chicken Soup" -> Combination.chickensoup();
            case "chicken wing" -> Combination.chickenwing();
            case "chill" -> Combination.chill();
            case "chimney" -> Combination.chimney();
            case "chocolate" -> Combination.chocolate();
            case "chocolate milk" -> Combination.chocolatemilk();
            case "christmas stocking" -> Combination.christmasstocking();
            case "christmas tree" -> Combination.christmastree();
            case "cigarette" -> Combination.cigarette();
            case "city" -> Combination.city();
            case "clay" -> Combination.clay();
            case "clock" -> Combination.clock();
            case "closet" -> Combination.closet();
            case "cloud" -> Combination.cloud();
            case "coal" -> Combination.coal();
            case "coconut" -> Combination.coconut();
            case "coconut milk" -> Combination.coconutmilk();
            case "coffin" -> Combination.coffin();
            case "cold" -> Combination.cold();
            case "combustion engine" -> Combination.combustionengine();
            case "computer" -> Combination.computer();
            case "computer mouse" -> Combination.computermouse();
            case "confetti" -> Combination.confetti();
            case "constellation" -> Combination.constellation();
            case "container" -> Combination.container();
            case "continent" -> Combination.continent();
            case "cook" -> Combination.cook();
            case "cookbook" -> Combination.cookbook();
            case "cookie" -> Combination.cookie();
            case "cookiecutter" -> Combination.cookiecutter();
            case "cookie dough" -> Combination.cookiedough();
            case "coral" -> Combination.coral();
            case "corpse" -> Combination.corpse();
            case "cotton" -> Combination.cotton();
            case "cotton candy" -> Combination.cottoncandy();
            case "cow" -> Combination.cow();
            case "crayon" -> Combination.crayon();
            case "crow" -> Combination.crow();
            case "crystal ball" -> Combination.crystalball();
            case "cuckoo" -> Combination.cuckoo();
            case "cup" -> Combination.cup();
            case "current" -> Combination.current();
            case "cutting board" -> Combination.cuttingboard();
            case "cyborg" -> Combination.cyborg();
            case "cyclist" -> Combination.cyclist();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}