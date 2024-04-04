package com.softtek.presentacion;

import com.softtek.modelo.Alumno;

public class PruebaAlumno {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan Pérez", 3);

        alumno1.setCalificacionesParciales(8,0);

        System.out.println("Nombre del alumno: " + alumno1.getNombreCompleto());
        System.out.println("Nota final: " + alumno1.calcularPromedio());

        alumno1.mostrarCalificaciones();
    }

}
