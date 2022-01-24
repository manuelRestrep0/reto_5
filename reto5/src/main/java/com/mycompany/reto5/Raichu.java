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
    public void Evolucionar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Gritar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
