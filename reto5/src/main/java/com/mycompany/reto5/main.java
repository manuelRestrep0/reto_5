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
        pokemonesDisponibles.add(auxiliarCreacion.Evolucionar());
        pokemonesDisponibles.add(auxiliarCreacion.Evolucionar().Evolucionar());
        
        auxiliarCreacion = new Pikachu("jesus",(byte)10,100);
        pokemonesDisponibles.add(auxiliarCreacion);
        pokemonesDisponibles.add(auxiliarCreacion.Evolucionar());
        
        auxiliarCreacion = new Squitrtle("mateo",(byte)10,100);
        pokemonesDisponibles.add(auxiliarCreacion);
        pokemonesDisponibles.add(auxiliarCreacion.Evolucionar());
        pokemonesDisponibles.add(auxiliarCreacion.Evolucionar().Evolucionar());
        
        System.out.println("1)Mostrar pokemones disponibles.\n2)Mostrar los gritos de los diferentes pokemones.\n3)Evolucionar los pokemones,\n4)Crear pokebolas y capturar pokemones.");
        Scanner input = new Scanner(System.in);
        switch(input.nextInt())
        {
            case 1:
            {
                Iterator<Pokemon> iterador = pokemonesDisponibles.iterator();
                while(iterador.hasNext())
                {
                    Pokemon elemento = iterador.next();
                    System.out.println(elemento.Gritar());
                }
            }
            case 2:
            {
                
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
