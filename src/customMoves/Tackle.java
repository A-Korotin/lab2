package customMoves;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Tackle extends PhysicalMove
{
  public Tackle(){
    super(Type.NORMAL, 40, 100);
  }

  @Override
  protected String describe(){
    return "Uses Tackle";
  }
}
