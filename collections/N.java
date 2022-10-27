package LittleAlchemyCombinations.collections;

import LittleAlchemyCombinations.Abstract;

import LittleAlchemyCombinations.Combination;

import java.util.Scanner;

public class N extends Abstract{
    @Override
    public void alphabet() {
        System.out.println("Narwhal\nNeedle\nNessie\nNest\nNet\nNewspaper\nNight\nNinja\nNinja Turtle\nNuts");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String n = input.nextLine();
        switch (n) {
            case "narwhal" -> Combination.narwhal();
            case "needle" -> Combination.needle();
            case "nessie" -> Combination.nessie();
            case "nest" -> Combination.nest();
            case "net" -> Combination.net();
            case "newspaper" -> Combination.newspaper();
            case "night" -> Combination.night();
            case "ninja" -> Combination.ninja();
            case "ninja turtle" -> Combination.ninjaturtle();
            case "nuts" -> Combination.nuts();
        }
    }
}