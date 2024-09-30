package com.neo.ciclos06;

public class Suma {
    public int suma = 0;

    public void agregarNumero(int num) {
        this.suma += num;
    }

    public int obtenerResultado() {
        return this.suma;
    }
}
