package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios3 {

    int pos;
    String cad;
    Scanner sc = new Scanner(System.in);


    public void agregar(ArrayList<String> cadena) {
        System.out.println("Ingresa un elemento");
        cadena.add(sc.nextLine());
    }

    public void imprimir(ArrayList<String> cadena) {
        for (int i = 0; i < cadena.size(); i++) {
            System.out.print(cadena.get(i) + ", ");
        }
        System.out.println("");
    }

    public void eliminarPorPosición(ArrayList<String> cadena) {
        System.out.println("Ingrese la posicion a eliminar");
        pos = sc.nextInt();
        cadena.remove(pos);
        System.out.println("Elemento " + cadena.get(pos) + " eliminado");
    }

    public void buscarPalabra(ArrayList<String> cadena) {
        System.out.println("Ingrese la palabra a buscar");
        cad = sc.nextLine();
        boolean found = false;
        int i = 0;
        do {
            if (cadena.get(i).equals(cad)) { // Si son iguales
                found = true;
                System.out.println("Palabra encontrada en la posición " + i + " del arrayList");
                break;
            }
            i++;
        } while (i<cadena.size()); //mientras que i sea menor que el tamaño del arrayList
        if (!found){ // si es falso
            System.out.println("Palabra no encontrada");
        }
    }
}
