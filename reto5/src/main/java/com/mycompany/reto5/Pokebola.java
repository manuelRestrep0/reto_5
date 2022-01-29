package com.mycompany.reto5;

public abstract class Pokebola{
    String tamano;
    Pokemon pokemonAtrapado;

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Pokemon getPokemonAtrapado() {
        return pokemonAtrapado;
    }

    public void setPokemonAtrapado(Pokemon pokemonAtrapado) {
        this.pokemonAtrapado = pokemonAtrapado;
    }
    
}
