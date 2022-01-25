package com.mycompany.reto5;

public class Squitrtle extends Wartortle {

    public Squitrtle(String nombre, byte nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    public Pokemon Evolucionar() {
        return new Wartortle(this.nombre,this.nivel,this.salud + 100);
    }

 
    @Override
    public String Gritar() {
        return "Squirtle";
    }
}
