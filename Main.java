package LittleAlchemyCombinations;

import LittleAlchemyCombinations.collections.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the alphabet : ");
        char C = getInput.next().charAt(0);
        if(C == 'a'){
            A obj = new A();
            obj.alphabet();
        }
        else if(C == 'b'){
            B obj = new B();
            obj.alphabet();
        }
        else if(C == 'c'){
            C obj = new C();
            obj.alphabet();
        }
        else if(C == 'd'){
            D obj = new D();
            obj.alphabet();
        }
        else if(C == 'e'){
            E obj = new E();
            obj.alphabet();
        }
        else if(C == 'f'){
            F obj = new F();
            obj.alphabet();
        }
        else if(C == 'g'){
            G obj = new G();
            obj.alphabet();
        }
        else if(C == 'h'){
            H obj = new H();
            obj.alphabet();
        }
    }
}
