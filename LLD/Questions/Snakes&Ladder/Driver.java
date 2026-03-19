import java.util.ArrayList;
import java.util.List;

import models.Board;
import models.Dice;
import models.Game;
import models.Ladder;
import models.Player;
import models.Snake;
import stratergy.DefaultWinningStratergy;
import stratergy.HighestDiceRollStratergy;
import stratergy.RoundRobinTurnStratergy;

public class Driver {
    public static void main(String[] args) {
        
        Board board = new Board(100);

        // add snakes
        board.getBoardCells().get(36).setBoardItem(new Snake(36, 2));
        board.getBoardCells().get(36).setBoardItem(new Snake(54, 15));

        // add ladders
        board.getBoardCells().get(36).setBoardItem(new Ladder(3, 27));
        board.getBoardCells().get(36).setBoardItem(new Ladder(25, 63));

        List<Player> players = new ArrayList<>();

        for(int i = 0 ; i < 3 ; ++i){
            players.add(new Player(i, "player " + i));
        }

        Dice dice = new Dice(6);

        Game game = new Game(board, dice, new DefaultWinningStratergy(), new HighestDiceRollStratergy(players));
        game.init();
    }
}
