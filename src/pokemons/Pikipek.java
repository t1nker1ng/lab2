package pokemons;

import moves.DoubleTeam;
import moves.Swagger;
import ru.ifmo.se.pokemon.*;

public class Pikipek extends Pokemon {
    public Pikipek(String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.FLYING);
        setStats(35, 75, 30, 30, 60, 65);
        setMove(new DoubleTeam(), new Swagger());
    }
}
