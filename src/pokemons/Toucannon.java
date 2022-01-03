package pokemons;
import ru.ifmo.se.pokemon.*;
import moves.*;
public class Toucannon extends Pokemon{
    public Toucannon(String name, int level){
        super(name,level);
        setType(Type.NORMAL,Type.FLYING);
        setStats(80,120,75,75,75,60);
        setMove(new DoubleTeam(),new Swagger(), new Astonish(), new SteelWing());
    }
}
