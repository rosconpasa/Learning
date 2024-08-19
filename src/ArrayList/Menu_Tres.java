package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu_Tres {
    Scanner sc = new Scanner(System.in);

    public void menuTres() {
        int op;
        int pos;
        Ejercicios3 ejercicios3 = new Ejercicios3();
        ArrayList<String> cadena = new ArrayList<>();

        do {
            System.out.println("---------MENÚ TRES---------\n" +
                    "1. Agregar\n" +
                    "2. Imprimir\n" +
                    "3. Eliminar por posición\n" +
                    "0. Volver al menú principal");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    ejercicios3.agregar(cadena);
                    break;

                case 2:
                    ejercicios3.imprimir(cadena);
                    break;

                case 3:
                    //Implementa un programa que permita al usuario agregar números a un ArrayList. Luego, pide al
                    // usuario eliminar un número ya sea por valor o por posición.
                    ejercicios3.eliminarPorPosición(cadena);

                    break;

                case 4:
                    //Crea un programa que permita agregar palabras a un ArrayList. Luego, pide al usuario ingresar una
                    // palabra y busca si existe en la lista, mostrando su posición.
                    ejercicios3.buscarPalabra(cadena);
                    break;

                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        } while (op != 0);  // El bucle se mantiene en el menú 3 hasta que se ingrese 0.
    }

}
