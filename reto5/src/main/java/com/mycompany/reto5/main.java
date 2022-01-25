package com.mycompany.reto5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] Args)
    {
        List<Pokemon> pokemonesDisponibles = new ArrayList();
        Pokemon auxiliarCreacion = new Charmander("juan",(byte)10,100);
        pokemonesDisponibles.add(auxiliarCreacion);
        try{
        pokemonesDisponibles.add(auxiliarCreacion.Evolucionar());
        pokemonesDisponibles.add(auxiliarCreacion.Evolucionar().Evolucionar());
        } catch (NoEvolucionaException e){
            System.out.println(e.getMessage());
        }
        auxiliarCreacion = new Pikachu("jesus",(byte)10,100);
        pokemonesDisponibles.add(auxiliarCreacion);
        try{
        pokemonesDisponibles.add(auxiliarCreacion.Evolucionar());
        } catch(NoEvolucionaException e) {
            System.out.println(e.getMessage());
        }
        
        auxiliarCreacion = new Squitrtle("mateo",(byte)10,100);
        pokemonesDisponibles.add(auxiliarCreacion);
        try{
            pokemonesDisponibles.add(auxiliarCreacion.Evolucionar());
            pokemonesDisponibles.add(auxiliarCreacion.Evolucionar().Evolucionar());
        } catch (NoEvolucionaException e){
            System.out.println(e.getMessage());
        }
        boolean ejecucion = true;
        while(ejecucion)
        {
           System.out.println("1)Mostrar pokemones disponibles.\n2)Evolucionar los pokemones.\n3)Crear pokebolas y capturar pokemones.");
            Scanner input = new Scanner(System.in);
            switch(input.nextInt())
            {
                case 1:
                {
                    for(Pokemon pokemonActual : pokemonesDisponibles)
                    {
                        System.out.println(pokemonActual.Gritar());
                    }
                }
                case 2:
                {
                    for(Pokemon pokemonActual : pokemonesDisponibles)
                    {
                        try{
                        pokemonActual = pokemonActual.Evolucionar();
                        } catch (NoEvolucionaException e){
                            System.out.println(e.getMessage());
                        }
                    }
                }
                case 3:
                {

                }
                case 4:
                {

                }
            }
        } 
        }
        
    
}
