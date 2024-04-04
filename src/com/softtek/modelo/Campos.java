package com.softtek.modelo;

public class Campos {
    private double x;
    public Campos(double x){
        this.x=x;
    }
    public double Muestra (){
        return this.x;
    }

    public void Incrementa(){
        this.x++;
    }

    public static void main(String[] args){
        Campos instancia = new Campos(3);
        instancia.Incrementa();
        System.out.println("El nuevo valor de x es: "+ instancia.Muestra());
    }
}
