package chess;

import boardgame.Board;
import boardgame.Piece;
import lombok.Getter;

@Getter
public abstract class ChessPiece extends Piece {
    /**
     * Pieces available colors.
     */
    private Color color;

    /**
     * ChessPiece constructor method with arguments.
     *
     * @param board where the object ChessPiece will be placed
     * @param color enumeration relative to the ChessPiece
     */
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
}
