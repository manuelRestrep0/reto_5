package com.mycompany.reto5;

public class Wartortle extends Blastoise {

    public Wartortle(String nombre, byte nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    public Pokemon Evolucionar() {
        return new Blastoise(this.nombre,this.nivel,this.salud + 200);
    }

    @Override
    public String Gritar() {
        return "Blastoise";
    }
}
