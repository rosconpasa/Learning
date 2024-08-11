
import java.util.Arrays;
import java.util.Scanner;

import Arrays.Ejercicios;
import ArraysBidimensionales.Ejercicios2;

public class Main {
    public static void main(String[] args) {

        Ejercicios ejercicios = new Ejercicios();
        Ejercicios2 ejercicios2 = new Ejercicios2();

        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("Ingrese una opción");
        op = sc.nextInt();

        int tam = ejercicios.tamanoArray();
        int[] array = new int[tam];
        int[] array2 = new int[tam];

        int[] arrayTamano = ejercicios2.tamanoMatriz();
        int[][] matriz = new int[arrayTamano[0]][arrayTamano[1]];


        switch (op) {
            case 1:
                //Escribe un programa que recorra un array de enteros y calcule la suma de los elementos pares y la
                // suma de los elementos impares, y luego imprima ambos resultados.
                ejercicios.rellenarArray(array);
                ejercicios.imprimirArray(array);
                System.out.println(ejercicios.sumaParEImpar(array));
                break;

            case 2:
                //Dado un array de enteros, escribe un programa que cuente cuántas veces aparece un número específico
                // en el array.

                ejercicios.rellenarArray(array);
                int con = ejercicios.contadorOcurrencias(array);
                System.out.println("El nùmero se repitiò: " + con + "veces");
                ejercicios.imprimirArray(array);
                break;

            case 3:
                //Escribe un programa que invierta el orden de los elementos en un array de enteros sin utilizar arrays auxiliares.

                ejercicios.rellenarArray(array);

                System.out.println(Arrays.toString(ejercicios.invertirArray(array)));
                break;

            case 4:
                //Escribe un programa que calcule el producto de todos los elementos de un array de enteros.

                ejercicios.rellenarArray(array);
                ejercicios.imprimirArray(array);
                System.out.println("El producto de los elementos es: " + ejercicios.productoArray(array));
                break;


            case 5:
                //Escribe un programa que verifique si los elementos de un array de enteros están ordenados de forma
                // ascendente.
                ejercicios.rellenarArray(array);
                if (ejercicios.ordenadoAscendente(array)) {
                    System.out.println("ORDENADO");
                } else {
                    System.out.println("DESORDENADO");
                }
                break;

            case 6:
                //Dado un array de enteros, escribe un programa que encuentre y muestre el valor mínimo y el valor máximo.

                ejercicios.rellenarArray(array);
                ejercicios.minymax(array);

                break;

            case 7:
                //Escribe un programa que rote los elementos de un array hacia la derecha una posición. Por ejemplo,
                // el array {1, 2, 3, 4} debería convertirse en {4, 1, 2, 3}.

                ejercicios.rellenarArray(array);
                ejercicios.moverPosicion(array);
                ejercicios.imprimirArray(array);

                break;

            case 8:
                //Dado dos arrays de igual tamaño, escribe un programa que cree un tercer array intercalando
                // los elementos de los dos arrays originales.
                ejercicios.rellenarArray(array);
                ejercicios.rellenarArray(array2);
                int[] array3 = ejercicios.intercalarArrays(array, array2);
                ejercicios.imprimirArray(array3);
                break;

            case 9:
                //Escribe un programa que recorra una matriz bidimensional de enteros y calcule la suma de todos sus
                // elementos.

                ejercicios2.rellenarMatriz(matriz);
                ejercicios2.imprimirMatriz(matriz);
                System.out.println("La suma de los elementos es: " + ejercicios2.sumaMatriz(matriz));

                break;

            case 10:
                //Dado un array bidimensional de enteros, escribe un programa que calcule la suma de los elementos en
                // cada fila y cada columna, y luego imprima los resultados.
                ejercicios2.rellenarMatriz(matriz);
                ejercicios2.imprimirMatriz(matriz);
                ejercicios2.sumaFyC(matriz);


                break;
        }

    }
}
