
package autonoma.pokemonapp.models;

import tragamonedas.PokemonRayo;
import tragamonedas.PokemonRayo;

public class Pikachu extends Pokemon implements PokemonRayo {
    public Pikachu() {
        super(25, "Pikachu", 6.0f, 1);
    }
    
    public void atacarImpactrueno() {
        System.out.println("Soy " + nombre + " y estoy atacando con Impactrueno");
    }
    public void atacarPunioTrueno() {
        System.out.println("Soy " + nombre + " y estoy atacando con Punio Trueno");
    }
    public void atacarRayo() {
        System.out.println("Soy " + nombre + " y estoy atacando con Rayo");
    }
    public void atacarRayoCarga() {
        System.out.println("Soy " + nombre + " y estoy atacando con Rayo Carga");
    }
}