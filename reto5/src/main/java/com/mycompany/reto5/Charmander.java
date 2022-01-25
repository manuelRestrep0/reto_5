package com.mycompany.reto5;

public class Charmander extends Charmeleon {
       
    public Charmander(String nombre, byte nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    public Pokemon Evolucionar() {
        return new Charmeleon(this.nombre,this.nivel,this.salud + 100);
    }
    
    @Override
    public String Gritar() {
        return "Charmeleon";
    }
}
