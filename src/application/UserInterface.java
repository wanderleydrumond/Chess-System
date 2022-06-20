package application;

import chess.ChessPiece;
import chess.ChessPosition;
import chess.Color;
import org.jetbrains.annotations.NotNull;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The game user interface
 */
public class UserInterface {
    /**
     * Clears the console screen.
     *
     * @see <a href="https://stackoverflow.com/questions/2979383/java-clear-the-console">How to clear the console?</a>
     */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Read a new move from a player.
     *
     * @param scanner contains a coordinate
     * @return the new move
     */
    public static ChessPosition readChessPosition(Scanner scanner) {
        try {
            String coordinate = scanner.nextLine();
            char column = coordinate.toLowerCase().charAt(0);
            int row = Integer.parseInt(coordinate.substring(1));
            return new ChessPosition(column, row);
        } catch (RuntimeException runtimeException) {
            throw new InputMismatchException("Error reading ChessPosition. Valid values are from a1 to h8.");
        }
    }

    /**
     * Prints the whole board.
     *
     * @param pieces the array of pieces containing its coordinates (row, column)
     */
    public static void printBoard(ChessPiece @NotNull [] @NotNull [] pieces) {
        System.out.println();
        for (int index = 0; index < pieces.length; index++) {
            System.out.print("           " + OutputColor.YELLOW_TEXT_BOLD.getValue() + (8 - index) + OutputColor.RESET.getValue() + " ");
            for (int indicator = 0; indicator < pieces.length; indicator++) {
                printPiece(pieces[index][indicator]);
            }
            System.out.println();
        }
        System.out.println("             " + OutputColor.BLUE_TEXT_BOLD.getValue() + "a b c d e f g h" + OutputColor.RESET.getValue());
    }

    /**
     * Prints a single board piece.
     *
     * @param piece the <code>ChessPiece</code> object to be printed
     */
    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        } else if (piece.getColor() == Color.WHITE) {
            System.out.print(OutputColor.CYAN_TEXT_NORMAL.getValue() + piece + OutputColor.RESET.getValue());
        } else {
            System.out.print(OutputColor.PURPLE_TEXT_NORMAL.getValue() + piece + OutputColor.RESET.getValue());
        }
        System.out.print(" ");
    }
}