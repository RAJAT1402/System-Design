package stratergy;

import java.util.List;

import models.Player;

public class HighestDiceRollStratergy implements ITurnStratergy{

    private final List<Player> players;

    public HighestDiceRollStratergy(List<Player> players) {
        this.players = players;
    }

    @Override
    public Player getNextPlayer() {
        
        // P1, P2, P3 are the players
        // P1 played 2 turns, P2 played 2 turns , P3 played 1 turn -> Next player is P3

        // all has taken same turns
        // P1 rolled 3, P2 rolled 5, P3 rolled 2 -> P2 should take the turn

        this.players.sort((p1, p2) -> {
            int cmp = p1.getTurns() - p2.getTurns();

            if(cmp == 0){
                return p1.getLastDiceRoll() - p2.getLastDiceRoll();
            }

            return cmp;
        });

        return players.get(0);
    }
    
}
