package customPokemons;
import ru.ifmo.se.pokemon.*;
import customMoves.*;
import java.lang.Math;

public class Eevee extends Pokemon
{
  public Eevee(String name, int level)
  {
    super(name, level);
    this.setMove(new Facade(), new DoubleTeam(),
                 new Swagger());
    this.setType(Type.NORMAL);
    this.setStats(55, 55, 50, 45, 65, 55);
  }
}
