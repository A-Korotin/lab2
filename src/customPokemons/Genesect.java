package customPokemons;
import ru.ifmo.se.pokemon.*;
import customMoves.*;
import java.lang.Math;

public class Genesect extends Pokemon
{
  public Genesect(String name, int level)
  {
    super(name, level);
    this.setMove(new ShadowBall(), new Blizzard(),
                 new DoubleTeam(), new Leer());
    this.setType(Type.BUG, Type.STEEL);
    this.setStats(71, 120, 95, 120, 95, 99);
  }
}
