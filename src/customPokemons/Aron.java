package customPokemons;
import ru.ifmo.se.pokemon.*;
import customMoves.*;
import java.lang.Math;

public class Aron extends Pokemon
{
  public Aron(String name, int level){
    super(name, level);
    this.setMove(new DoubleTeam(), new Confide());
    this.setType(Type.STEEL, Type.ROCK);
    this.setStats(50 ,70, 100, 40, 40, 30);
  }
}
