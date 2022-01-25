package com.mycompany.reto5;

public class Pikachu extends Raichu{

    public Pikachu(String nombre, byte nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    public Pokemon Evolucionar() {
        return new Raichu(this.nombre,this.nivel,this.salud + 200);
    }

    
    @Override
    public String Gritar() {
        return "Raichu";
    }
}
