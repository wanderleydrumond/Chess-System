package boardgame;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

/**
 * Piece entity.
 */
@RequiredArgsConstructor

public abstract class Piece {
    /**
     * <p>Array position.</p>
     * <p>Knows the board where it is.</p>
     */
    protected Position position;
    /**
     * Where the pieces are.
     */
    private @NonNull @Getter(AccessLevel.PROTECTED) Board board;

    /**
     * Method used as template for further implementations.
     *
     * @return a boolean array
     */
    public abstract boolean[][] possibleMoves();

    /**
     * Determines if the given position has possible moves. <i>Hook method</i>
     *
     * @param position that will be questioned about
     * @return the method which contains the call for the position boolean array
     * @see <a href="https://pt.wikipedia.org/wiki/Template_Method">Template Method</a>
     */
    public boolean possibleMove(@NotNull Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    /**
     * Checks if there's possible moves. <i>To be used along with a piece</i>
     *
     * @return true if yes, false otherwise
     */
    public boolean isTherePossibleMoves() {
        boolean[][] auxiliary = possibleMoves();
        for (int index = 0; index < auxiliary.length; index++) {
            for (int indicator = 0; indicator < auxiliary.length; indicator++) {
                if (auxiliary[index][indicator]) {
                    return true;
                }
            }
        }
        return false;
    }
}