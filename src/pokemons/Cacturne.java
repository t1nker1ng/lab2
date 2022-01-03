package pokemons;
import ru.ifmo.se.pokemon.*;
import moves.*;
public class Cacturne extends Pokemon{
    public Cacturne(String name, int level){
        super(name,level);
        setStats(50,85,40,85,40,35);
        setType(Type.GRASS,Type.DARK);
        setMove(new Confide(), new Rest(), new Facade(), new Bite());
    }
}
