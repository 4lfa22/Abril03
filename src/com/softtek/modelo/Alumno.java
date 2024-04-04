package com.softtek.modelo;

public class Alumno {
    private String nombreCompleto;
    private double[] calificacionesParciales;





    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : this.calificacionesParciales) {
            suma += calificacion;
        }
        return suma / this.calificacionesParciales.length;
    }



    public String mostrarCalificaciones() {
        String texto="Calificaciones de los parciales:\n" ;
        for (int i = 0; i < this.calificacionesParciales.length; i++) {
            texto+=("Parcial " + (i + 1) + ": " + this.calificacionesParciales[i]);
        }
        return texto;
    }
    public Alumno(String nombreCompleto, int cantidadParciales) {
        this.nombreCompleto = nombreCompleto;
        this.calificacionesParciales = new double[cantidadParciales];
    }

    public Alumno() {
    }
    public void setCalificacionesParciales(double calificacion, int posicion) {
        if (posicion<=calificacionesParciales.length) {
           calificacionesParciales[posicion]=calificacion;
        }else{
        System.out.println("La cantidad de parciales no coincide.");
        }
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double[] getCalificacionesParciales() {
        return calificacionesParciales;
    }
}

