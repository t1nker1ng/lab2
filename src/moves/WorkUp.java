package moves;
import ru.ifmo.se.pokemon.*;
public class WorkUp extends PhysicalMove{
    public WorkUp(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK,1);
        p.setMod(Stat.ATTACK,1);
    }
    @Override
    protected String describe(){
        return "использует Work Up";
    }
}
