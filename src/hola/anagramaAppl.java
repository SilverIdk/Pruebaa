package hola;

import java.util.Scanner;

public class anagramaAppl {
    
    public static void main(String[] args){

        Scanner Leer = new Scanner (System.in);

       anagrama uno = new anagrama ();

       System.out.println("Dame una frase");
       String palabra = Leer.nextLine();

       System.out.println("Dame otra frase");
       String frace = Leer.nextLine();

       if (uno.longitud(palabra, frace)){
        System.out.println("Misma longitud");
       }

    }

}
