package stratergy;

import models.Player;

public interface IWinningStratergy {
    
    boolean hasWon(Player currentPlayer, int boardSize);
}
