package com.softtek.presentacion;

import com.softtek.modelo.Cadena;

public class PruebaCadena {

    public static void main(String[] args){
        String cad = "Nunca mates una mosca sobre la cabeza de un tigre";
        Cadena cadena = new Cadena();
        System.out.println(cadena.Mayus(cad));
        System.out.println(cadena.Minus(cad));
        System.out.println(cadena.Nunca(cad));
        System.out.println(cadena.mosca(cad));
        System.out.println(cadena.cabeza(cad));
        System.out.println(cadena.posM(cad));
        System.out.println(cadena.Longitud(cad));

    }
}
