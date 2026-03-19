package stratergy;

import models.Player;

public class DefaultWinningStratergy implements IWinningStratergy{

    @Override
    public boolean hasWon(Player currentPlayer, int boardSize) {
       
        return currentPlayer.getCurrentPosition() >= boardSize;
    }
    
}
