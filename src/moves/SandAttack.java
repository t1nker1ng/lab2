package moves;
import ru.ifmo.se.pokemon.*;
public class SandAttack extends PhysicalMove{
    public SandAttack(){
        super(Type.GROUND, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
    }
    @Override
    protected String describe(){
        return "использует Sand Attack";
    }
}
