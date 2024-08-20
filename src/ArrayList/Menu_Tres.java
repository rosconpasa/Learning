package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;

public class Menu_Tres {
    Scanner sc = new Scanner(System.in);

    public void menuTres() {
        int op;
        int pos;
        int tipo;
        Ejercicios3 ejercicios3 = new Ejercicios3();
        ArrayList<String> cadena = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();


        do {
            System.out.println("---------MENÚ TRES---------\n" +
                    "1. Agregar elemento\n" +
                    "2. Imprimir\n" +
                    "3. Eliminar por posición \n" +
                    "4. Buscar elemento \n" +
                    "5. Ordenar elementos \n" +
                    "0. Volver al menú principal");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Con que tipo de arrayList desea trabajar: 1. String, 2. Integer");
                    tipo = sc.nextInt();

                    if (tipo == 1) {
                        ejercicios3.agregar(cadena);
                    } else {
                        ejercicios3.agregar(numeros);
                    }

                    break;

                case 2:

                    System.out.println("Con que tipo de arrayList desea trabajar: 1. String, 2. Integer");
                    tipo = sc.nextInt();

                    if (tipo == 1) {
                        ejercicios3.imprimir(cadena);
                    } else {
                        ejercicios3.imprimir(numeros);
                    }
                    break;

                case 3:
                    //Implementa un programa que permita al usuario agregar números a un ArrayList. Luego, pide al
                    // usuario eliminar un número ya sea por valor o por posición.
                    System.out.println("Con que tipo de arrayList desea trabajar: 1. String, 2. Integer");
                    tipo = sc.nextInt();

                    if (tipo == 1) {
                        ejercicios3.eliminarPorPosición(cadena);
                    } else {
                        ejercicios3.eliminarPorPosición(numeros);
                    }

                    break;

                case 4:
                    //Crea un programa que permita agregar palabras a un ArrayList. Luego, pide al usuario ingresar una
                    // palabra y busca si existe en la lista, mostrando su posición.

                    System.out.println("Con que tipo de arrayList desea trabajar: 1. String, 2. Integer");
                    tipo = sc.nextInt();

                    if (tipo == 1) {
                        ejercicios3.buscarElemento(cadena);
                    } else {
                        ejercicios3.buscarElemento(numeros);
                    }
                    break;

                case 5:
                    //Escribe un programa que permita al usuario agregar números a un ArrayList, luego ordena los
                    // números en orden ascendente y muestra la lista ordenada.

                    System.out.println("Con que tipo de arrayList desea trabajar: 1. String, 2. Integer");
                    tipo = sc.nextInt();

                    if (tipo == 1) {
                        Collections.sort(cadena);
                        ejercicios3.imprimir(cadena);
                    } else {
                        Collections.sort(numeros);
                        ejercicios3.imprimir(numeros);
                    }

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
