package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {
    int sum1 = 0;
    int sum2 = 0;
    int num1;
    int cont = 0;

    Scanner sc = new Scanner(System.in);

    public int tamanoArray(){
        System.out.println("Ingrese el tamaño del arreglo");
        num1=sc.nextInt();
        return num1;
    }

    public void rellenarArray(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el elemento en la posición " + i);
            array[i] = sc.nextInt();
        }

    }

    public void imprimirArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public String sumaParEImpar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum1 = sum1 + array[i];
            } else {
                sum2 = sum2 + array[i];
            }
        }
        return "La suma de pares: " + sum1 + ". La suma de impares: " + sum2;
    }

    public int contadorOcurrencias(int array[]) {
        System.out.println("Ingrese el número que quiere contar");
        num1 = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) {
                cont++;
            }
        }
        return cont;
    }

    public int[] invertirArray(int array[]) {
        int j = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[j];

            array[j] = temp;
            j--;
        }
        return array;
    }

    public int productoArray(int array[]) {
        int mul = 1;

        for (int i = 0; i < array.length; i++) {
            mul = mul * array[i];
        }
        return mul;
    }

    public boolean ordenadoAscendente(int array[]) {
        int i = 0;
        boolean asc = true;
        while (i < array.length - 1) {
            if (array[i] < array[i + 1]) {
                asc = true;
            } else {
                asc = false;
            }
            i++;
        }
        return asc;
    }

    public void minymax(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Mayor: " + max + ". Menor: " + min);
    }

    public int[] moverPosicion(int[] array) {
        int last = array[array.length - 1];
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                array[i] = last;
            } else {
                array[i] = array[i - 1];

            }

        }

        return array;
    }

    public int[] intercalarArrays(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[2 * i] = array1[i];     // Elemento del primer array
            array3[2 * i + 1] = array2[i]; // Elemento del segundo array
        }
        return array3;
    }
}
