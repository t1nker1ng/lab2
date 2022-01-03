import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class lab1 {
    public static void main(String[] args){
        Battle b = new Battle();
        Cacturne p1 = new Cacturne("Андрюха", 3);
        Cacnea p2 = new Cacnea("Димасс Дробыш", 1);
        Pikipek p3 = new Pikipek("Хэллоу", 2);
        Toucannon p4 = new Toucannon("Воссап", 1);
        Trumbeak p5 = new Trumbeak("Ром4ик", 2);
        Keldeo p6 = new Keldeo("Ген4ик", 3);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}