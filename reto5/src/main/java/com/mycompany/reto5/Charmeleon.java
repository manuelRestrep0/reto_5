package com.mycompany.reto5;

public class Charmeleon extends Charizard {
   
    public Charmeleon(String nombre, byte nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    public Pokemon Evolucionar() {
        return new Charizard(this.nombre,this.nivel,this.salud + 200); 
    }
    
    
    @Override
    public String Gritar() {
        return "Charizard";
    }
}
