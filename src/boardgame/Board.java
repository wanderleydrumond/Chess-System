package boardgame;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

/**
 * Represents the game board.
 */
public class Board {
    /**
     * Amount of rows available in the board.
     */
    private @Getter @Setter int rows;
    /**
     * Amount of columns available in the board.
     */
    private @Getter @Setter int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    /**
     * Gets the piece position accessing the class atributes <code><i style="color: #C1C3D1";>row</i></code> and <code><i style="color: #C1C3D1";>column</i></code> directly.
     *
     * @param row horizontal coordinate
     * @param column vertical coordinate
     * @return the array which contains the piece coordinates
     */
    public Piece getPiece(int row, int column) {
        return pieces[row][column];
    }

    /**
     * Gets the piece position accessing the class atributes <code><i style="color: #C1C3D1";>row</i></code> and <code><i style="color: #C1C3D1";>column</i></code> through get methods.
     *
     * @param position object that contains <code><i style="color: #C1C3D1";>row</i></code> and <code><i style="color: #C1C3D1";>column</i></code> coordinates
     * @return the array which contains the piece coordinates
     */
    public Piece getPiece(@NotNull Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }
}