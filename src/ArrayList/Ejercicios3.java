package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios3 {

    int pos;
    String cad;
    Scanner sc = new Scanner(System.in);

    public <T> void agregar(ArrayList<T> elementos) {
        System.out.println("Ingrese un elemento");
        T elem = (T) sc.nextLine();
        elementos.add(elem);
    }

    public <T> void imprimir(ArrayList<T> elementos) {
        for (int i = 0; i < elementos.size(); i++) {
            System.out.print(elementos.get(i) + ", ");
        }
        System.out.println("");
    }


    public <T> void eliminarPorPosición(ArrayList<T> elementos) {
        System.out.println("Ingrese la posicion a eliminar");
        pos = sc.nextInt();
        System.out.println("Elemento " + elementos.get(pos) + " eliminado");
        elementos.remove(pos);
    }

    public <T> void buscarElemento(ArrayList<T> elementos) {
        System.out.println("Ingrese el elemento a buscar");
        cad = sc.nextLine();
        boolean found = false;
        int i = 0;
        do {
            if (elementos.get(i).equals(cad)) { // Si son iguales
                found = true;
                System.out.println("Elemento encontrada en la posición " + i + " del arrayList");
                break;
            }
            i++;
        } while (i < elementos.size()); //mientras que i sea menor que el tamaño del arrayList
        if (!found) { // si es falso
            System.out.println("Elemento no encontrado");
        }
    }
}
