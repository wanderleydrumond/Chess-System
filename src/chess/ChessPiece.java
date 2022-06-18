package chess;

import boardgame.Board;
import boardgame.Piece;
import lombok.Getter;
import lombok.NonNull;

@Getter
public class ChessPiece extends Piece {
    /**
     * Pieces available colors.
     */
    private Color color;

    public ChessPiece(@NonNull Board board, Color color) {
        super(board);
        this.color = color;
    }
}
