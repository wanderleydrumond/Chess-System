package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;


/**
 * The tower piece.
 */
public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    /**
     * Dictates the possible moves for each Rook piece type.
     *
     * @return the array containing all possible moves
     */
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position positionRook = new Position(0, 0);

        // Verifying above
        positionRook.setValues(position.getRow() - 1, position.getColumn());
        while (getBoard().positionExists(positionRook) && !getBoard().thereIsAPiece(positionRook)) {
            System.out.println("\\\\Verifying above: " + getColor());
            possibleMoves[positionRook.getRow()][positionRook.getColumn()] = true;
            positionRook.setRow(positionRook.getRow() - 1);
        }
        isValidPosition(possibleMoves, positionRook);

        // Verifying below
        positionRook.setValues(position.getRow() + 1, position.getColumn());
        while (getBoard().positionExists(positionRook) && !getBoard().thereIsAPiece(positionRook)) {
            System.out.println("\\\\Verifying below: " + getColor());
            possibleMoves[positionRook.getRow()][positionRook.getColumn()] = true;
            positionRook.setRow(positionRook.getRow() + 1);
        }
        isValidPosition(possibleMoves, positionRook);

        // Verifying left
        positionRook.setValues(position.getRow(), position.getColumn() - 1);
        while (getBoard().positionExists(positionRook) && !getBoard().thereIsAPiece(positionRook)) {
            System.out.println("\\\\Verifying left: " + getColor());
            possibleMoves[positionRook.getRow()][positionRook.getColumn()] = true;
            positionRook.setColumn(positionRook.getColumn() - 1);
        }
        isValidPosition(possibleMoves, positionRook);

        // Verifying right
        positionRook.setValues(position.getRow(), position.getColumn() + 1);
        while (getBoard().positionExists(positionRook) && !getBoard().thereIsAPiece(positionRook)) {
            System.out.println("\\\\Verifying right: " + getColor());
            possibleMoves[positionRook.getRow()][positionRook.getColumn()] = true;
            positionRook.setColumn(positionRook.getColumn() + 1);
        }
        isValidPosition(possibleMoves, positionRook);
        return possibleMoves;
    }

    /**
     * <p><code style="color: #50FA7B;">possibleMoves</code> auxiliary method.</p>
     * <p>Validates if:</p>
     * <ol>
     *     <li>The position is inside the board</li>
     *     <li>There is an opponent piece on that position</li>
     * </ol>
     *
     * @param possibleMoves the possible moves array
     * @param positionRook  the current piece position reference
     */
    private void isValidPosition(boolean[][] possibleMoves, Position positionRook) {
        if (getBoard().positionExists(positionRook) && isThereOpponentPiece(positionRook)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
    }
}