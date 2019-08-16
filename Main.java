package edu.ujcv.progra2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

int Repetir = 2;
        do {


            DynArray<String> areglos = new DynArray(5);

            areglos.addIndex(0, "hola");
            areglos.add("mundo");
            areglos.add("3");
            areglos.add("jaime ");
            areglos.addIndex(1, "david");
            areglos.add("cinco");
            areglos.add("mineCraft");
            areglos.add("www.");
            areglos.addIndex(areglos.getSize(), "G");
            areglos.removeFirst();
            areglos.removeLast();
            areglos.removeLast();


            if (args.length > 0) {

                //TODO: leer los argumentos y comprimir 'o' descomprimir segun apropiado.
            }


            System.out.println("kl");
            for (int i = 0; i <= 8; i++) {
                System.out.println(areglos);
            }
            System.out.println("Desea repetir");
        }while (Repetir ==1);
    }

}
