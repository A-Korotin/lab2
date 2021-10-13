package customPokemons;
import ru.ifmo.se.pokemon.*;
import customMoves.*;
import java.lang.Math;

public class Aggron extends Pokemon
{
  public Aggron(String name, int level)
  {
    super(name, level);
    this.setMove(new DoubleTeam(), new Confide(),
                 new Tackle(), new HornAttack());
    this.setType(Type.ROCK, Type.STEEL);
    this.setStats(70, 110, 180, 60, 60, 50);
  }
}
