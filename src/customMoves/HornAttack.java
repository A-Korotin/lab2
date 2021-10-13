package customMoves;
import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class HornAttack extends PhysicalMove
{
  public HornAttack()
    { super(Type.NORMAL, 65, 100); }

  @Override
  protected String describe()
  {
    return "Uses HornAttack";
  }
}
