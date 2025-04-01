
package autonoma.pokemonapp.models;

public abstract class Pokemon {  
    protected int numPokedex;
    protected String nombre;
    protected float peso;
    protected int temporada;

    public Pokemon(int numPokedex, String nombre, float peso, int temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }

    public void atacarPlacaje() {  
        System.out.println("Soy " + nombre + " y estoy atacando con Placaje");  
    }

    public void atacarArañazo() {  
        System.out.println("Soy " + nombre + " y estoy atacando con Araniazo");  
    }

    public void atacarMordisco() {  
        System.out.println("Soy " + nombre + " y estoy atacando con Mordisco");  
    }
}
