package ArraysBidimensionales;

import java.util.Scanner;

public class Ejercicios2 {
    Scanner sc = new Scanner(System.in); // Objeto Scanner para capturar entradas del usuario

    // Método para obtener el tamaño de una matriz (filas y columnas)
    public int[] tamanoMatriz() {
        int[] arrayTamano = new int[2]; // Array de tamaño 2 para almacenar filas y columnas
        System.out.println("Ingrese cantidad de filas");
        arrayTamano[0] = sc.nextInt(); // Almacena el número de filas en la primera posición
        System.out.println("Ingrese cantidad columnas");
        arrayTamano[1] = sc.nextInt(); // Almacena el número de columnas en la segunda posición

        return arrayTamano; // Devuelve el array con el tamaño de la matriz
    }

    // Método para rellenar una matriz con datos ingresados por el usuario
    public void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas de la matriz
            for (int j = 0; j < matriz[i].length; j++) { // Recorre las columnas de la matriz
                System.out.println("Ingrese el elemento en la posición [" + i + "][" + j + "]"); // Pide el valor para la posición [i][j]
                matriz[i][j] = sc.nextInt(); // Almacena el valor ingresado en la matriz
            }
        }
    }

    // Método para imprimir la matriz en formato legible
    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas de la matriz
            System.out.print("{"); // Imprime la apertura de una fila
            for (int j = 0; j < matriz[i].length; j++) { // Recorre las columnas de la fila actual
                System.out.print(" " + matriz[i][j] + " "); // Imprime el valor en la posición [i][j]
                if (j < matriz[i].length - 1) { // Si no es el último elemento de la fila
                    System.out.print(","); // Añade una coma entre elementos
                }
            }
            System.out.println("}"); // Cierra la fila y pasa a la siguiente
        }
    }

    // Método para sumar todos los elementos de una matriz
    public int sumaMatriz(int[][] matriz) {
        int sum = 0; // Inicializa la suma en 0
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas de la matriz
            for (int j = 0; j < matriz[i].length; j++) { // Recorre las columnas de cada fila
                sum = sum + matriz[i][j]; // Suma el valor en la posición [i][j] a la variable sum
            }
        }
        return sum; // Retorna la suma total de los elementos de la matriz
    }

    // Método para sumar por separado las filas y las columnas de la matriz
    public void sumaFyC(int[][] matriz) {
        int sumF = 0; // Inicializa la suma de las filas en 0
        int sumC = 0; // Inicializa la suma de las columnas en 0

        // Sumar cada fila por separado
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas de la matriz
            for (int j = 0; j < matriz[i].length; j++) { // Recorre las columnas de cada fila
                sumF = sumF + matriz[i][j]; // Suma el valor de la fila actual
            }
            System.out.println("Suma fila " + i + ": " + sumF); // Imprime la suma de la fila i
            sumF = 0; // Reinicia la suma de las filas para la siguiente fila
        }

        // Sumar cada columna por separado
        for (int j = 0; j < matriz[0].length; j++) { // Recorre las columnas de la matriz
            for (int i = 0; i < matriz.length; i++) { // Recorre las filas para cada columna
                sumC += matriz[i][j]; // Suma el valor de la columna actual
            }
            System.out.println("Suma columna " + j + ": " + sumC); // Imprime la suma de la columna j
            sumC = 0; // Reinicia la suma de las columnas para la siguiente columna
        }
    }
}
