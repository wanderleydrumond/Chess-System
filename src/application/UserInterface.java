package application;

import chess.ChessPiece;
import org.jetbrains.annotations.NotNull;

/**
 * The game user interface
 */
public class UserInterface {
    /**
     * Prints the whole board.
     *
     * @param pieces the array of pieces containing its coordinates (row, column)
     */
    public static void printBoard(ChessPiece[] @NotNull [] pieces) {
        for (int index = 0; index < pieces.length; index++) {
            System.out.print((8 - index) + " ");
            for (int indicator = 0; indicator < pieces.length; indicator++) {
                printPiece(pieces[index][indicator]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    /**
     * Prints a single board piece.
     *
     * @param piece the <code>ChessPiece</code> object to be printed
     */
    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}