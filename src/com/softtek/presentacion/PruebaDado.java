package com.softtek.presentacion;

import com.softtek.modelo.Dado;

import java.util.Scanner;

public class PruebaDado {
    public static void main(String[] args) {
        Dado dado = new Dado();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Presiona Enter para lanzar el dado...");
        scanner.nextLine();

        int resultado = dado.lanzar();
        mostrarResultado(resultado);

        scanner.close();
    }

    public static void mostrarResultado(int numero) {
        switch (numero) {
            case 1:
                System.out.println("+-----+");
                System.out.println("|     |");
                System.out.println("|  *  |");
                System.out.println("|     |");
                System.out.println("+-----+");
                break;
            case 2:
                System.out.println("+-----+");
                System.out.println("| *   |");
                System.out.println("|     |");
                System.out.println("|   * |");
                System.out.println("+-----+");
                break;
            case 3:
                System.out.println("+-----+");
                System.out.println("| *   |");
                System.out.println("|  *  |");
                System.out.println("|   * |");
                System.out.println("+-----+");
                break;
            case 4:
                System.out.println("+-----+");
                System.out.println("| * * |");
                System.out.println("|     |");
                System.out.println("| * * |");
                System.out.println("+-----+");
                break;
            case 5:
                System.out.println("+-----+");
                System.out.println("| * * |");
                System.out.println("|  *  |");
                System.out.println("| * * |");
                System.out.println("+-----+");
                break;
            case 6:
                System.out.println("+-----+");
                System.out.println("| * * |");
                System.out.println("| * * |");
                System.out.println("| * * |");
                System.out.println("+-----+");
                break;
            default:
                System.out.println("Número no válido.");
        }
    }
}

