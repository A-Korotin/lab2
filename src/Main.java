import ru.ifmo.se.pokemon.*;
import customMoves.*;
import customPokemons.*;

public class Main
{
  public static void main(String[] args)
  {
    Battle battle = new Battle();
    battle.addAlly(new Genesect("Sasha", 1));
    battle.addAlly(new Eevee("Igor", 1));
    battle.addAlly(new Leafeon("Masha", 1));
    battle.addFoe(new Aron("Tanya", 1));
    battle.addFoe(new Lairon("John", 1));
    battle.addFoe(new Aggron("Andrew", 1));
    battle.go();
  }
}
