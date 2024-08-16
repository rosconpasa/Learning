package ArraysBidimensionales;

import java.util.Scanner;

public class Menu_Dos {
    Ejercicios2 ejercicios2 = new Ejercicios2();
    Scanner sc = new Scanner(System.in);


    public void menuDos() {
        int[] arrayTamano = ejercicios2.tamanoMatriz();
        int[][] matriz = new int[arrayTamano[0]][arrayTamano[1]];
        int op;
        System.out.println("Ingrese una opción");
        op = sc.nextInt();
        switch (op) {
            case 1:
                //Escribe un programa que recorra una matriz bidimensional de enteros y calcule la suma de todos sus
                // elementos.

                ejercicios2.rellenarMatriz(matriz);
                ejercicios2.imprimirMatriz(matriz);
                System.out.println("La suma de los elementos es: " + ejercicios2.sumaMatriz(matriz));

                break;

            case 2:
                //Dado un array bidimensional de enteros, escribe un programa que calcule la suma de los elementos en
                // cada fila y cada columna, y luego imprima los resultados.
                ejercicios2.rellenarMatriz(matriz);
                ejercicios2.imprimirMatriz(matriz);
                ejercicios2.sumaFyC(matriz);


                break;
        }
    }
}
