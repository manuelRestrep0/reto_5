package com.mycompany.reto5;

public class Blastoise extends Pokemon {
    public String nombre;
    public byte nivel;
    public int salud;

    public Blastoise(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    @Override
    public String Gritar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pokemon Evolucionar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
