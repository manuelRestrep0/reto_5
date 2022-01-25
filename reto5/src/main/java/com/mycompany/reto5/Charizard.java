package com.mycompany.reto5;

public class Charizard extends Pokemon {
    public String nombre;
    public byte nivel;
    public int salud;

    public Charizard(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public int getSalud() {
        return salud;
    }

   
    @Override
    public String Gritar() {
        return "Charizard";
    }

    @Override
    public Pokemon Evolucionar() throws NoEvolucionaException {
    throw new NoEvolucionaException();    
    }
    
}
