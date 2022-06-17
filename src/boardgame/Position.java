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
     * The matrix row value.
     */
    private int row;
    /**
     * The matrix column value.
     */
    private int column;
}