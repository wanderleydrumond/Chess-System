package chess;

import boardgame.Board;

/**
 * Holds the game rules.
 */
public class ChessMatch {
    private Board board;

    /**
     * Instantiates the ChessMatch class with a new instance of board with its dimensions already set.
     */
    public ChessMatch() {
        board = new Board(8, 8);
    }

    /**
     * @return an array of chess pieces corresponding to this match
     */
    public ChessPiece[][] getPieces() {
        ChessPiece[][] array = new ChessPiece[board.getRows()][board.getColumns()];
        for (int index = 0; index < board.getRows(); index++) {
            for (int indicator = 0; indicator < board.getColumns(); indicator++) {
                array[index][indicator] = (ChessPiece) board.getPiece(index, indicator);
            }
        }
        return array;
    }
}