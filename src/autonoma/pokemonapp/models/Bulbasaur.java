
package autonoma.pokemonapp.models;

import autonoma.pokemonapp.view.PokemonPlanta;

public class Bulbasaur extends Pokemon implements PokemonPlanta {
    public Bulbasaur() {
        super(1, "Bulbasaur", 6.9f, 1);
    }
    
    public void atacarParalizar() {
        System.out.println("Soy " + nombre + " y estoy atacando con Paralizar");
    }
    public void atacarDrenaje() {
        System.out.println("Soy " + nombre + " y estoy atacando con Drenaje");
    }
    public void atacarHojaAfilada() {
        System.out.println("Soy " + nombre + " y estoy atacando con Hoja Afilada");
    }
    public void atacarLatigoCepa() {
        System.out.println("Soy " + nombre + " y estoy atacando con Latigo Cepa");
    }
}