package pokemons;
import ru.ifmo.se.pokemon.*;
import moves.*;
public class Keldeo extends Pokemon{
    public Keldeo(String name, int level){
        super(name,level);
        setType(Type.WATER,Type.FIGHTING);
        setStats(91,72,90,129,90,108);
        setMove(new Confide(), new Rest(), new Facade(), new Bite());
    }
}
