import java.util.Scanner;

import ArrayList.Menu_Tres;
import Arrays.Menu_Uno;
import ArraysBidimensionales.Menu_Dos;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu_Uno menuUno = new Menu_Uno();
        Menu_Dos menuDos = new Menu_Dos();
        Menu_Tres menuTres = new Menu_Tres();

        int op;
        do {
            System.out.println("---------MENU---------\n" +
                    "1. Menú arrays\n" +
                    "2. Menú arrays bidimensionales\n" +
                    "3. ArrayLsist\n");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    menuUno.menu();
                    break;

                case 2:
                    menuDos.menuDos();
                    break;

                case 3:
                    menuTres.menuTres();
                    break;
            }
        } while (op != 0);


    }
}
