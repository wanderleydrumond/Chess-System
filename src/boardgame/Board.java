package boardgame;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

/**
 * Represents the game board.
 */
public class Board {
    /**
     * Amount of rows available in the board.
     */
    private @Getter int rows;
    /**
     * Amount of columns available in the board.
     */
    private @Getter int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error creating board: There must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    /**
     * Gets the piece position accessing the class atributes <code><i style="color: #C1C3D1";>row</i></code> and <code><i style="color: #C1C3D1";>column</i></code> directly.
     *
     * @param row    horizontal coordinate
     * @param column vertical coordinate
     * @return the array which contains the piece coordinates
     */
    public Piece getPiece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Position not exis tent on the board");
        }
        return pieces[row][column];
    }

    /**
     * Gets the piece position accessing the class atributes <code><i style="color: #C1C3D1";>row</i></code> and <code><i style="color: #C1C3D1";>column</i></code> through get methods.
     *
     * @param position object that contains <code><i style="color: #C1C3D1";>row</i></code> and <code><i style="color: #C1C3D1";>column</i></code> coordinates
     * @return the array which contains the piece coordinates
     */
    public Piece getPiece(@NotNull Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not exis tent on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    /**
     * Place a given piece on a given position.
     *
     * @param piece    that will be placed on a position
     * @param position that will place by a piece
     */
    public void placePiece(@NotNull Piece piece, @NotNull Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is already a piece on position: " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    /**
     * Checks if coordinates are empty or not.
     *
     * @param row    horizontal coordinate
     * @param column vertical coordinate
     * @return if the coordinates have a piece placed or not
     */
    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    /**
     * <p>Method that catch the <code style="color: #50FA7B">positionExists</code> result and reroute it.</p>
     * <p>Works like a DTO.</p>
     *
     * @param position object that contains the piece coordinates
     * @return true if the position have a piece placed, false otherwise
     */
    public boolean positionExists(@NotNull Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    /**
     * Checks if a given position is empty or not.
     *
     * @param position object that contains the piece coordinates
     * @return true is not empty, false otherwise
     */
    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not existent on the board");
        }
        return getPiece(position) != null;
    }
}