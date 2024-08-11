package ArraysBidimensionales;

import java.util.Scanner;

public class Ejercicios2 {
    Scanner sc = new Scanner(System.in);

    public int[] tamanoMatriz() {
        int[] arrayTamano = new int[2];
        System.out.println("Ingrese cantidad de filas");
        arrayTamano[0] = sc.nextInt();
        System.out.println("Ingrese cantidad columnas");
        arrayTamano[1] = sc.nextInt();

        return arrayTamano;
    }

    public void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese el elemento en la posición [" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
                if (j < matriz[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println("}");
        }
    }

    public int sumaMatriz(int[][] matriz) {
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum = sum + matriz[i][j];
            }
        }
        return sum;
    }

    public void sumaFyC(int[][] matriz) {
        int sumF = 0;
        int sumC = 0;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumF = sumF + matriz[i][j];

            }
            System.out.println("Suma fila " + i + ": " + sumF);
            sumF = 0;
        }

        for (int j = 0;  j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumC += matriz[i][j];
            }
            System.out.println("Suma columna "+j+": "+sumC);
            sumC=0;
        }
    }
}
