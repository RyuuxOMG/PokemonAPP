package autonoma.pokemonapp.models;

import autonoma.pokemonapp.models.Pokemon;
import tragamonedas.PokemonAgua;
import tragamonedas.PokemonAgua;

public class Squirtle extends Pokemon implements PokemonAgua {
    public Squirtle() {
        super(7, "Squirtle", 9.0f, 1);
    }

    public void atacarHidrobomba() {
        System.out.println("Soy " + nombre + " y estoy atacando con Hidrobomba");
    }

    public void atacarPistolaAgua() {
        System.out.println("Soy " + nombre + " y estoy atacando con Pistola de Agua");
    }

    public void atacarBurbuja() {
        System.out.println("Soy " + nombre + " y estoy atacando con Burbuja");
    }

    public void atacarHidropulso() {
        System.out.println("Soy " + nombre + " y estoy atacando con Hidropulso");
    }
}