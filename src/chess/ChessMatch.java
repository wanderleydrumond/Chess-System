package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

/**
 * Holds the game rules.
 */
public class ChessMatch {
    private Board board;

    /**
     * Instantiates the ChessMatch class with a new instance of board with its dimensions already set. Means that it starts the match.
     */
    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
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

    /**
     * Places the pieces on the board.
     */
    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
    }
}