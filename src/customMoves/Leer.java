package customMoves;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Leer extends StatusMove
{
  public Leer(){
    super(Type.NORMAL, 0, 100);
  }

  @Override
  protected void applyOppEffects(Pokemon p){
    p.setMod(Stat.DEFENSE, -1);
  }

  @Override
  protected String describe(){
    return "Uses Leer";
  }

}
