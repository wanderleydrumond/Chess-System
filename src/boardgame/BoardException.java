package boardgame;

/**
 * Treats exceptions in the board game layer.
 */
public class BoardException extends RuntimeException{
    public BoardException(String message) {
        super(message);
    }
}