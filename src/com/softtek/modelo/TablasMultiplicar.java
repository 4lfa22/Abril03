package com.softtek.modelo;

public class TablasMultiplicar {
    private int numero;

    public TablasMultiplicar(int numero){
        this.numero=numero;
    }

    public String crearTabla(){
        StringBuilder tabla = new StringBuilder();
        for(int i = 1; i<=10; i++){
            int resultado = this.numero * i;
            tabla.append(this.numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
        }
        return tabla.toString();
    }

    public static void main(String[] args){
        TablasMultiplicar tabla = new TablasMultiplicar(4);
        System.out.println("Tabla del 4");
        System.out.println(tabla.crearTabla());
    }
}
