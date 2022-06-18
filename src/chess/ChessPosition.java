package chess;

import boardgame.Position;
import lombok.Getter;

/**
 * <p>Contains the rules positioning the pieces.</p>
 * <ul>
 *     <li><span style="color: #FFB765;">matrix row</span> = 8 &minus; <span style="color: #FFB765;">chess row</span></li>
 *     <li><span style="color: #FFB765;">matrix column</span> = <span style="color: #FFB765;">chess column</span> &minus; 'a'</li>
 * </ul>
 */
@Getter
public class ChessPosition {
    /**
     * The game piece column coordinate.
     */
    private char column;
    /**
     * The game piece row coordinate.
     */
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating chess position. Valid values are from a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }

    /**
     * Transforms the coordinates into game position.
     *
     * @return a piece new position
     */
    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    /**
     * Gives a piece to board the old position.
     *
     * @param position the old piece position
     * @return the piece old position
     */
    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
