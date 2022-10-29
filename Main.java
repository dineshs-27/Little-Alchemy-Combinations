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
        else if(C == 'i'){
            I obj = new I();
            obj.alphabet();
        }
        else if(C == 'j'){
            J obj = new J();
            obj.alphabet();
        }
        else if(C == 'k'){
            K obj = new K();
            obj.alphabet();
        }
        else if(C == 'l'){
            L obj = new L();
            obj.alphabet();
        }
        else if(C == 'm'){
            M obj = new M();
            obj.alphabet();
        }
        else if(C == 'n'){
            N obj = new N();
            obj.alphabet();
        }
        else if(C == 'o'){
            O obj = new O();
            obj.alphabet();
        }
        else if(C == 'p'){
            P obj = new P();
            obj.alphabet();
        }
        else if(C == 'q'){
            Q obj = new Q();
            obj.alphabet();
        }
        else if(C == 'r'){
            R obj = new R();
            obj.alphabet();
        }
        else if(C == 's'){
            S obj = new S();
            obj.alphabet();
        }
        else if(C == 't'){
            T obj = new T();
            obj.alphabet();
        }
        else if(C == 'u'){
            U obj = new U();
            obj.alphabet();
        }
        else if(C == 'v'){
            V obj = new V();
            obj.alphabet();
        }
        else if(C == 'w'){
            W obj = new W();
            obj.alphabet();
        }
        else if(C == 'y'){
            Y obj = new Y();
            obj.alphabet();
        }
        else if(C == 'z'){
            Z obj = new Z();
            obj.alphabet();
        }
        else {
            System.out.println("Wrong alphabet is entered !");
            System.out.println("Please try again !");
        }
    }
}