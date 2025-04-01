package autonoma.pokemonapp.main;

import tragamonedas.Charmander;
import tragamonedas.Squirtle;
import autonoma.pokemonapp.models.*;
import autonoma.pokemonapp.view.*;

public class PokemonAPP {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();

        System.out.println("\n Ataques de Squirtle:");
        squirtle.atacarPlacaje();
        squirtle.atacarArañazo();
        squirtle.atacarMordisco();
        squirtle.atacarHidrobomba();
        squirtle.atacarPistolaAgua();
        squirtle.atacarBurbuja();
        squirtle.atacarHidropulso();

        System.out.println("\nAtaques de Pikachu:");
        pikachu.atacarPlacaje();
        pikachu.atacarArañazo();
        pikachu.atacarMordisco();
        pikachu.atacarImpactrueno();
        pikachu.atacarPunioTrueno();
        pikachu.atacarRayo();
        pikachu.atacarRayoCarga();

        System.out.println("\nAtaques de Bulbasaur:");
        bulbasaur.atacarPlacaje();
        bulbasaur.atacarArañazo();
        bulbasaur.atacarMordisco();
        bulbasaur.atacarParalizar();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarHojaAfilada();
        bulbasaur.atacarLatigoCepa();

        System.out.println("\nAtaques de Charmander:");
        charmander.atacarPlacaje();
        charmander.atacarArañazo();
        charmander.atacarMordisco();
        charmander.atacarPunioFuego();
        charmander.atacarAscuas();
        charmander.atacarLanzallamas();
    }
}
