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

    //Método para especificar el tamaño de un array por medio de consola
    public int tamanoArray(){
        System.out.println("Ingrese el tamaño del arreglo");
        num1=sc.nextInt();
        return num1;
    }

    //Método para ingresar datos a un array
    public void rellenarArray(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el elemento en la posición " + i);
            array[i] = sc.nextInt();
        }

    }

    //Método para imprimir los elementos de un array
    public void imprimirArray(int[] array) {
        System.out.println(Arrays.toString(array)); //toString es un método que sirve para imprimir un array de forma
        //sencilla
    }

    //Método para sumar elementos pares e impares de un array
    public String sumaParEImpar(int[] array) { //Recibe un array de enteros
        for (int i = 0; i < array.length; i++) { //Recorre el array
            if (array[i] % 2 == 0) { //Si el residuo del array en la posición i es cero, sigifica que es par
                sum1 = sum1 + array[i]; // se suma el elemento par a la variable suma
            } else {
                sum2 = sum2 + array[i]; // si es impara se suma a la variable suma de impares
            }
        }
        return "La suma de pares: " + sum1 + ". La suma de impares: " + sum2; // devuelve un String con las dos sumas
    }

    //Método para contar cuantas veces se repite un número pedido por consola
    public int contadorOcurrencias(int [] array) {
        System.out.println("Ingrese el número que quiere contar");
        num1 = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) { //Si el elemento en posición i es igual a el número a contar
                cont++; // se aumenta el contador
            }
        }
        return cont; //retorna el contador
    }

    //Método para invertir las posiciones de un array [1,2,3] a [3,2,1]
    public int[] invertirArray(int array[]) {
        int j = array.length - 1; //j será igual al tamaño del array -1
        for (int i = 0; i < array.length / 2; i++) { //Solo se recorre hasta la mitad del array
            int temp = array[i]; // elemento en posición i se guarda en una variable temporal
            array[i] = array[j]; // elemento en posición i será igual al elemento en posición j, es decir, al último elemento en este instante
            array[j] = temp; // elemento en posición j será igual al elemento en la variable temporal
            j--; // se decrementa j
        }
        return array; // retorna el array
    }

    // Método para multiplicar lo elementos de un array
    public int productoArray(int [] array) {
        int mul = 1; // el producto será igual a 1 ya que si es 0 nunca cambiará

        for (int i = 0; i < array.length; i++) {
            mul = mul * array[i]; // se multiplica cada elemento del array por lo que esté almacenado en mul
        }
        return mul; // retorna mul
    }

    // Método para ordenar de forma ascendente un array
    public boolean ordenadoAscendente(int [] array) {
        int i = 0;
        boolean asc = true; //de forma predeterminada decimos que están odenados con true
        while (i < array.length - 1 && asc) { // Mientras i sea menor que el tamaño del arreglo Y asc sea true
            if (array[i] < array[i + 1]) { // si elemento en la posición i es menor que el inmediatamente siguiente
                asc = true; // sigue siendo true
            } else {
                asc = false; // si no se cumple, será false
            }
            i++; // aumenta i
        }
        return asc; // retorna true o false
    }

    // Método para determianr el valor mínimo y máximo de un array
    public void minymax(int[] array) {
        int max = Integer.MIN_VALUE; // max será igual al entero más pequeño posible
        int min = Integer.MAX_VALUE; // min será igual al entero más grande posible

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) { // si elemento actual es mayor que max
                max = array[i]; // max será igual a ese elemento
            }
            if (array[i] < min) { // si elemento actual es menor que min
                min = array[i]; // min será igual a ese elemento
            }
        }

        System.out.println("Mayor: " + max + ". Menor: " + min); // imprime max y min
    }

    // Método para mover elementos de un array una posición a la derecha
    public void moverPosicion(int[] array) {
        int last = array[array.length - 1]; // se guarda el último elemento
        for (int i = array.length - 1; i >= 0; i--) { // i empieza en la última posición hasta que llegue a 0
            if (i == 0) { // si elemento actual es igual a 0, siginifa que es el primer elemento, y se asigna el último elemento que habíamos guardado
                array[i] = last; // se asigna a la primera posición el último elemento
            } else {
                array[i] = array[i - 1]; //si no, elemeto actual será igual a elemento que está antes de él

            }

        }
    }

    //Método para crear un tercer array con los elementos de otros dos, de manera intercalada
    public int[] intercalarArrays(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length]; // Se crea un array con el tamaño de la suma de otros dos

        for (int i = 0; i < array1.length; i++) { // mientras que i sea menor que el tamaño de los arreglos originales
            array3[2 * i] = array1[i];     // Elemento del primer array (2*i sirve para ir de 2 en 2 en el array)
            array3[2 * i + 1] = array2[i]; // Elemento del segundo array (+1 sirve para acceder al siguiente elemento del arreglo)
        }
        return array3; // retorna el arreglo 3
    }
}
