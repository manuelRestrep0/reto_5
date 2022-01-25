package com.mycompany.reto5;

public class Raichu extends Pokemon {
    public String nombre;
    public byte nivel;
    public int salud;

    public Raichu(String nombre, byte nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
    
    

    @Override
    public String Gritar() {
        return "Raichu";
    }

    @Override
    public Pokemon Evolucionar() throws NoEvolucionaException{
        throw new NoEvolucionaException();
    }
}
