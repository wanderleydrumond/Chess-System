package boardgame;

import lombok.Getter;
import lombok.Setter;

public class Board {
    private @Getter @Setter int rows;
    private @Getter @Setter int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }
}