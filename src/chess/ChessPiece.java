package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
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

    /**
     * Determines if the given position has an opponent piece.
     *
     * @param position that will be checked
     * @return true if the given position has a piece from different color
     */
    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece chessPiece = (ChessPiece) getBoard().getPiece(position);
        System.out.println("isThereOpponentPiece: " + (chessPiece != null && chessPiece.getColor() != color));
        return chessPiece != null && chessPiece.getColor() != color;
    }
}
