
package tragamonedas;

import tragamonedas.PokemonFuego;

public class Charmander extends Pokemon implements PokemonFuego {
    public Charmander() {
        super(4, "Charmander", 8.5f, 1);
    }
    
    public void atacarPunioFuego() {
        System.out.println("Soy " + nombre + " y estoy atacando con Punio Fuego");
    }
    public void atacarAscuas() {
        System.out.println("Soy " + nombre + " y estoy atacando con Ascuas");
    }
    public void atacarLanzallamas() {
        System.out.println("Soy " + nombre + " y estoy atacando con Lanzallamas");
    }
}