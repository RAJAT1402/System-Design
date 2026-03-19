package stratergy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import models.Player;

public class RoundRobinTurnStratergy implements ITurnStratergy{

    private final Queue<Player> players;

    public RoundRobinTurnStratergy(List<Player> players){
        this.players = new LinkedList<>(players);
    }

    @Override
    public Player getNextPlayer() {
        
        // get next player from the queue
        Player player = this.players.poll();

        // put this player at the end of the queue
        this.players.add(player);

        // return next player
        return player;
    }
    
}
