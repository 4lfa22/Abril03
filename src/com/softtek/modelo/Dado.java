package com.softtek.modelo;

public class Dado {
    public int lanzar() {
        return (int) (Math.random() * 6) + 1;
    }
}

