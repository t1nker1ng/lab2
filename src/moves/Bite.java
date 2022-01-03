package moves;
import ru.ifmo.se.pokemon.*;
public class Bite extends PhysicalMove{
    public Bite(){
        super(Type.GHOST, 30, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<0.3){
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Bite";
    }
}
