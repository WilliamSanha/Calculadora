package api;

import java.util.Scanner;
public class Tabuada {

    public static void main(String[] arg) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("tabula: ");
            int tabuada = scan.nextInt();

            System.out.println("tabuada de " + tabuada);

            for (int i = 1; i <= 10; i++) {
                System.out.println(tabuada + "x" + i + "=" + (tabuada * i));

            }
        }

    }


}

