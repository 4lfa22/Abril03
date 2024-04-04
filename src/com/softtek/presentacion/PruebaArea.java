package com.softtek.presentacion;

import com.softtek.modelo.Areas;

import java.util.Scanner;

import static com.softtek.modelo.Areas.areaCirculo;
import static com.softtek.modelo.Areas.areaRectangulo;

public class PruebaArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radioCirculo = scanner.nextDouble();

        System.out.print("Ingrese la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();

        double areaCirculo = Areas.areaCirculo(radioCirculo);
        double areaRectangulo = Areas.areaRectangulo(baseRectangulo, alturaRectangulo);

        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Área del rectángulo: " + areaRectangulo);

        scanner.close();
    }

}
