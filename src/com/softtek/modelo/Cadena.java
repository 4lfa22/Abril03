package com.softtek.modelo;

import java.util.Locale;

public class Cadena {
    private String cadena;

    public String Mayus(String cadena){
        String cad=cadena.toUpperCase();
        return cad;
    }

    public String Minus(String cadena){
        String cad=cadena.toLowerCase();
        return cad;
    }

    public String Nunca(String cadena){
        String cad="";
        String[] palabras = cadena.split(" ");
        for(String palabra: palabras){
            if(palabra.equals("Nunca")){
                cad=palabra;
            }
        }
        return cad;
    }

    public String mosca(String cadena){
        String cad="";
        String[] palabras = cadena.split(" ");
        for(String palabra: palabras){
            if(palabra.equals("mosca")){
                cad=palabra;
            }
        }
        return cad;
    }

    public String cabeza(String cadena){
        String cad="";
        String[] palabras = cadena.split(" ");
        for(String palabra: palabras){
            if(palabra.equals("cabeza")){
                cad=palabra;
            }
        }
        return cad;
    }

    public int posM(String cadena){
        int posicion= cadena.indexOf("m");
        return posicion;
    }

    public int Longitud(String cadena){
        int lon=cadena.length();
        return lon;
    }

    public Cadena(){
        this.cadena=cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
}
