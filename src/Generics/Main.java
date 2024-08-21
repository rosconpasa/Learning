package Generics;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Caja<String> caja = new Caja<>("Hola");
        System.out.println(caja.getContenido());
        caja.setContenido("Adiós");
        System.out.println(caja.getContenido());

        Caja<Integer> caja2 = new Caja<>();
        caja2.setContenido(1);
        System.out.println(caja2.getContenido());

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nuevo valor");
        int val= sc.nextInt();
        caja2.setContenido(val);
        System.out.println(caja2.getContenido());
    }
}
