package pokemons;
import ru.ifmo.se.pokemon.*;
import moves.*;
public class Trumbeak extends Pokemon{
    public Trumbeak(String name, int level){
        super(name,level);
        setType(Type.NORMAL,Type.FLYING);
        setStats(55,85,50,40,50,75);
        setMove(new DoubleTeam(),new Swagger(),new Astonish());
    }
}
