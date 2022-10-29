package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class K extends Abstract{
    @Override
    public void alphabet() {
        System.out.println("kaiju\nkatana\nkite\nknife\nknight");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String k = input.nextLine();
        switch (k) {
            case "kaiju" -> Combination.kaiju();
            case "katana" -> Combination.katana();
            case "kite" -> Combination.kite();
            case "knife" -> Combination.knife();
            case "knight" -> Combination.knight();
        }
    }
}
