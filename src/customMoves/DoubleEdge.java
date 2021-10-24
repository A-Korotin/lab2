package customMoves;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class DoubleEdge extends PhysicalMove
{
  public DoubleEdge(){
    super(Type.NORMAL, 120, 100);
  }

  @Override
  protected void applySelfDamage(Pokemon p , double damage){
    p.setMod(Stat.HP, (int) (damage / 3.0));
  }

  @Override
  protected String describe(){
    return "Uses DoubleEdge";
  }
}
