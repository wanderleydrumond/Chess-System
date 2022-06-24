package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;
import org.jetbrains.annotations.NotNull;

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
     * The complete process to make a Move on the board.
     *
     * @param sourcePosition the game coordinates where the piece come from
     * @param targetPosition the game coordinates where the is going to
     * @return The piece that was captured
     */
    public ChessPiece performChessMove(@NotNull ChessPosition sourcePosition, @NotNull ChessPosition targetPosition) {
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        validateSourcePosition(source);
        validateTargetPosition(source, target);
        Piece capturedPiece = makeMove(source, target);
        return (ChessPiece) capturedPiece;
    }

    /**
     * <p><code style="color: #50FA7B;">performChessMove</code> auxiliary method.</p>
     * <p>Validates if target position has possible moves</p>
     *
     * @param source source coordinate
     * @param target target coordinate
     */
    private void validateTargetPosition(Position source, Position target) {
        System.out.println("validateTargetPosition()");
        if (!board.getPiece(source).possibleMove(target)) {
            throw new ChessException("The chosen piece can't move to target position");
        }
    }

    /**
     * <p><code style="color: #50FA7B;">performChessMove</code> auxiliary method.</p>
     * <p>Perform the moving step.</p>
     *
     * @param source the game coordinates where the piece come from
     * @param target the game coordinates where the is going to
     * @return The piece that was captured
     */
    private Piece makeMove(Position source, Position target) {
        Piece piece = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(piece, target);
        return capturedPiece;
    }

    /**
     * <p><code style="color: #50FA7B;">performChessMove</code> auxiliary method.</p>
     * <p>Validates if source position
     *     <ul>
     *     <li>has a piece</li>
     *     <li>is a valid move</li>
     * </ul></p>
     *
     * @param position that will be validated
     */
    private void validateSourcePosition(Position position) {
        if (!board.thereIsAPiece(position)) {
            throw new ChessException("There is no piece on source position");
        }
        if (!board.getPiece(position).isTherePossibleMoves()){
            throw new ChessException("There are no possible moves for the chosen piece");
        }
    }

    /**
     * <ul>
     *     <li>Receive the game coordinates</li>
     *     <li>Updates the piece position</li>
     * </ul>
     *
     * @param column the game vertical coordinate
     * @param row    the game horizontal coordinate
     * @param piece  the piece that wil be placed
     */
    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    /**
     * Places the pieces on the board when the game starts.
     */
    private void initialSetup() {
        placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
    }
}