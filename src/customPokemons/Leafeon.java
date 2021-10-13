package customPokemons;
import ru.ifmo.se.pokemon.*;
import customMoves.*;
import java.lang.Math;

public class Leafeon extends Pokemon
{
  public Leafeon(String name, int level)
  {
    super(name, level);
    this.setMove(new Facade(), new DoubleTeam(),
                 new Swagger(), new DoubleEdge());
    this.setType(Type.GRASS);
    this.setStats(65, 110, 130, 60, 65, 95);
  }
}
