package boardgame;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Piece entity.
 */
@RequiredArgsConstructor

public class Piece {
    /**
     * <p>Array position.</p>
     * <p>Knows the board where it is.</p>
     */
    protected Position position;
    /**
     * Where the pieces are.
     */
    private @NonNull @Getter(AccessLevel.PROTECTED) Board board;
}