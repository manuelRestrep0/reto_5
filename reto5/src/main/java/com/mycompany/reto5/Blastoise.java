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
        return "Blastoise";
    }

    @Override
    public Pokemon Evolucionar() throws NoEvolucionaException {
    throw new NoEvolucionaException();
    }
}
