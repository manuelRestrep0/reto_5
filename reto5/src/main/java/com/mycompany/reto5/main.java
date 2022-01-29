package com.mycompany.reto5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] Args)
    {
        List<Pokemon> pokemonesDisponibles = new ArrayList();
        List<Pokebola> pokebolasInventario = new ArrayList();
        
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
                    break;
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
                    break;
                }
                case 3:
                {
                     System.out.println("1)Para ver las pokebolas.\n2)Para atrapar un pokemon.");
                     input = new Scanner(System.in);
                     switch(input.nextInt())
                     {
                         case 1:
                         {
                             for(Pokebola pokebolaActual : pokebolasInventario)
                             {
                                 System.out.println(pokebolaActual.pokemonAtrapado.Gritar());
                             } break;
                         }
                         case 2:
                         {
                             System.out.println("Eliga el pokemon que desea elegir:"
                                     + " 1)Pikachu.\n2)Charmander.\n3)Squirtle.");
                             input = new Scanner(System.in);
                             int opcion = input.nextInt();
                             System.out.println("Digite el nombre de su pokemon: ");
                             input = new Scanner(System.in);
                             switch(opcion)
                             {
                                 case 1:
                                 {
                                     pokebolasInventario.add(new Pikachu(input.toString(),(byte)1,100));
                                     break;
                                 }
                                 case 2:
                                 {
                                     pokebolasInventario.add(new Charmander(input.toString(),(byte)1,100));
                                     break;
                                 }
                                 case 3:
                                 {
                                     pokebolasInventario.add(new Squitrtle(input.toString(),(byte)1,100));
                                     break;
                                 }   
                             }
                             break;
                         }
                     }
                }
                default:
                {
                    ejecucion = false;
                }
                    
            }
        } 
        }
}

