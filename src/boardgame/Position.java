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
}