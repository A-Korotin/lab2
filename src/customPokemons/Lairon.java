package customPokemons;
import ru.ifmo.se.pokemon.*;
import customMoves.*;
import java.lang.Math;

public class Lairon extends Aron
{
  public Lairon(String name, int level)
  {
    super(name, level);
    this.setMove(new DoubleTeam(), new Confide(),
                 new Tackle());
    this.setType(Type.STEEL, Type.ROCK);
    this.setStats(60, 90, 140, 50, 50, 40);
  }
}
