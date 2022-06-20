package chess;

import boardgame.BoardException;

/**
 * Treats every exception related to the game itself.
 */
public class ChessException extends BoardException {
    public ChessException(String message) {
        super(message);
    }
}