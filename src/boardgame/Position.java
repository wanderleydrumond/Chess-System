package boardgame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The piece position inside the board.
 */
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames = false)
public class Position {
    /**
     * The array row value.
     */
    private int row;
    /**
     * The array column value.
     */
    private int column;

    /**
     * Updates the values from a given position.
     *
     * @param row    array horizontal coordinate
     * @param column array vertical coordinate
     */
    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }
}