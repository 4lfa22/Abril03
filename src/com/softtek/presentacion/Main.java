package com.softtek.presentacion;

public class Main {

    public static void main(String[] args){
        //Calcular el area de un cuadrado cuyo lado mide 6
        int lCuadrado = 4;
        int aCuadrado = lCuadrado*lCuadrado;
        System.out.println("El area del cuadrado es "+aCuadrado);
        //Calcular el area de un circulo cuyo radio es 3
        int r = 3;
        double area = Math.PI * r * r;
        System.out.println("EL area del circulo es "+area);
        //Calcular el perimetro de un rectangulo cuya base es 4 y altura 3
        int base = 4;
        int altura = 3;
        int perimetro = 2 * (base + altura);
        System.out.println("El perimetro del rectangulo es "+perimetro);
    }
}
