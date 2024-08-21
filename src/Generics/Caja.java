package Generics;

import java.util.Scanner;

public class Caja<T> {

    Scanner sc = new Scanner(System.in);

    private T contenido;

    public Caja(T contenido){
        this.contenido = contenido;
    }

    public Caja(){
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }
}
