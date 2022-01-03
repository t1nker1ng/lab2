package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;
public class Cacnea extends Pokemon{
    public Cacnea(String name, int level){
        super(name,level);
        setType(Type.GRASS);
        setStats(91,72,90,129,90,108);
        setMove(new WorkUp(),new SandAttack(), new Rest());
    }
}