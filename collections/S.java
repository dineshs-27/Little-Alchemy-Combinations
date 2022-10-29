package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class S extends Abstract {
    @Override
    public void alphabet() {
        System.out.println("sack\nsaddle\nsafe\nsafety glasses\nsailboat\nsailor\nsalt\nsand\nsandcastle\nsandpaper\nsandstone\nsandstorm\nsandwich\nsanta\nsap\nsaturn\nscalpel\nscarecrow\nscience\nscissors\nscorpion\nscubatank\nscythe\nsea\nseagull\nseahorse\nseal\nseaplane\nseasickness\nseaweed\nseed\nsewing machine\nshark\nsheep\nsheet music\nshovel\nshuriken\nsickness\nsilo\nskateboard\nskeleton\nskigoggles\nskier\nsky\nskyscraper\nsleigh\nsloth\nsmall\nsmog\nsmoke\nsmoke signal\nsmoothie\nsnake\nsnow\nsnow globe\nsnowball\nsnowboard\nsnowboarder\nsnowman\nsnowmobile\nsoap\nsoda\nsoil\nsolar cell\nsolarsystem\nsolid\nsound\nspace\nspace station\nspaceship\nspaghetti\nsphinx\nspider\nspotlight\nsprinkles\nsquirrel\nstar\nstarfish\nstatue\nsteak\nsteam\nsteam engine\nsteamboat\nsteel\nsteel wool\nstethoscope\nstone\nstorm\nstory\nstream\nstring phone\nstun gun\nsugar\nsun\nsundial\nsunflower\nsunglasses\nsupernova\nsurfer\nsushi\nswamp\nsweater\nswim goggles\nswimmer\nswimming pool\nsword\nswordfish\nsyringe");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String s = input.nextLine();
        switch(s) {
            case "sack" -> Combination.sack();
            case "saddle" -> Combination.saddle();
            case "safe" -> Combination.safe();
            case "safety glasses" -> Combination.safteyglasses();
            case "sailboat" -> Combination.sailboat();
            case "sailor" -> Combination.sailor();
            case "salt" -> Combination.salt();
            case "sand" -> Combination.sand();
            case "sandcastle" -> Combination.sandcastle();
            case "sandpaper" -> Combination.sandpaper();
            case "sandstone" -> Combination.sandstone();
            case "sandstorm" -> Combination.sandstorm();
            case "sandwich" -> Combination.sandwich();
            case "santa" -> Combination.santa();
            case "sap" -> Combination.sap();
            case "saturn" -> Combination.saturn();
            case "scalpel" -> Combination.scalpel();
            case "scarecrow" -> Combination.scarecrow();
            case "science" -> Combination.science();
            case "scorpion" -> Combination.scorpion();
            case "scuba tank" -> Combination.scubatank();
            case "scissors" -> Combination.scissors();
            case "scythe" -> Combination.scythe();
            case "sea" -> Combination.sea();
            case "seagull" -> Combination.seagull();
            case "seahorse" -> Combination.seahorse();
            case "seal" -> Combination.seal();
            case "seaplane" -> Combination.seaplane();
            case "seasickness" -> Combination.seasickness();
            case "seaweed" -> Combination.seaweed();
            case "seed" -> Combination.seed();
            case "sewing machine" -> Combination.sewingmachine();
            case "shark" -> Combination.shark();
            case "sheep" -> Combination.sheep();
            case "sheet music" -> Combination.sheetmusic();
            case "shovel" -> Combination.shovel();
            case "shuriken" -> Combination.shuriken();
            case "sickness" -> Combination.sickness();
            case "silo" -> Combination.silo();
            case "skateboard" -> Combination.skateboard();
            case "skeleton" -> Combination.skeleton();
            case "skier" -> Combination.skier();
            case "ski goggles" -> Combination.skigoggles();
            case "sky" -> Combination.sky();
            case "sky scraper" -> Combination.skyscraper();
            case "sleigh" -> Combination.sleigh();
            case "sloth" -> Combination.sloth();
            case "small" -> Combination.small();
            case "smog" -> Combination.smog();
            case "smoke" -> Combination.smoke();
            case "smoke signal" -> Combination.smokesignal();
            case "smoothie" -> Combination.smoothie();
            case "snake" -> Combination.snake();
            case "snow" -> Combination.snow();
            case "snowball" -> Combination.snowball();
            case "snowboard" -> Combination.snowboard();
            case "snowboarder" -> Combination.snowboarder();
            case "snow globe" -> Combination.snowglobe();
            case "snowman" -> Combination.snowman();
            case "snowmobile" -> Combination.snowmobile();
            case "solar cell" -> Combination.solarcell();
            case "soap" -> Combination.soap();
            case "soda" -> Combination.soda();
            case "soil" -> Combination.soil();
            case "solid" -> Combination.solid();
            case "solar system" -> Combination.solarsystem();
            case "sound" -> Combination.sound();
            case "space" -> Combination.space();
            case "spaceship" -> Combination.spaceship();
            case "space station" -> Combination.spacestation();
            case "spaghetti" -> Combination.spaghetti();
            case "sphinx" -> Combination.sphinx();
            case "spider" -> Combination.spider();
            case "spotlight" -> Combination.spotlight();
            case "sprinkles" -> Combination.sprinkles();
            case "squirrel" -> Combination.squirrel();
            case "star" -> Combination.star();
            case "starfish" -> Combination.starfish();
            case "statue" -> Combination.statue();
            case "steak" -> Combination.steak();
            case "steam" -> Combination.steam();
            case "steamboat" -> Combination.steamboat();
            case "steam engine" -> Combination.steamengine();
            case "steel" -> Combination.steel();
            case "steel wool" -> Combination.steelwool();
            case "stetho scope" -> Combination.stethoscope();
            case "stone" -> Combination.stone();
            case "storm" -> Combination.storm();
            case "story" -> Combination.story();
            case "stream" -> Combination.stream();
            case "string phone" -> Combination.stringphone();
            case "stun gun" -> Combination.stungun();
            case "sugar" -> Combination.sugar();
            case "sun" -> Combination.sun();
            case "sundial" -> Combination.sundial();
            case "sunflower" -> Combination.sunflower();
            case "sunglasses" -> Combination.sunglasses();
            case "supernova" -> Combination.supernova();
            case "surfer" -> Combination.surfer();
            case "sushi" -> Combination.sushi();
            case "swap" -> Combination.swamp();
            case "sweater" -> Combination.sweater();
            case "swim goggles" -> Combination.swimgoggles();
            case "swimmer" -> Combination.swimmer();
            case "swimming pool" -> Combination.swimmingpool();
            case "sword" -> Combination.sword();
            case "swordfish" -> Combination.swordfish();
            case "syringe" -> Combination.syringe();
            default -> {
                System.out.println("Wrong word is entered !");
                System.out.println("Please try again !");
            }
        }
    }
}