package moves;

import ru.ifmo.se.pokemon.*;

public class SteelWing extends StatusMove {
    public SteelWing() {
        super(Type.STEEL, 70, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()<0.1){
            p.setMod(Stat.DEFENSE,1);
        }
    }

    @Override
    protected String describe() {
        return "использует Steel Wing";
    }
}
