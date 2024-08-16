import java.util.Scanner;

import Arrays.Menu_Uno;
import ArraysBidimensionales.Menu_Dos;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu_Uno menuUno = new Menu_Uno();
        Menu_Dos menuDos = new Menu_Dos();

        int op;
        do {
            System.out.println("---------MENU---------\n" +
                    "1. Menú arrays\n" +
                    "2. Menú arrays bidimensionales\n");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    menuUno.menu();
                    break;

                case 2:
                    menuDos.menuDos();
                    break;
            }
        } while (op != 0);


    }
}
