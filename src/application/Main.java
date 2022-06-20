package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println(OutputColor.BLUE_TEXT_BRIGHT.getValue() + "¸„.-•~¹°”ˆ˜¨ [" + OutputColor.RESET.getValue()
                           + OutputColor.WHITE_TEXT_BRIGHT_BOLD.getValue() + "СӉЄՏՏ ԌѦӍЄ" + OutputColor.RESET.getValue()
                           + OutputColor.BLUE_TEXT_BRIGHT.getValue() + "] ¨˜ˆ”°¹~•-.„¸" + OutputColor.RESET.getValue());
        while (true) {
            UserInterface.printBoard(chessMatch.getPieces());

            System.out.print("\nSource: ");
            ChessPosition source = UserInterface.readChessPosition(scanner);
            System.out.print("Target: ");
            ChessPosition target = UserInterface.readChessPosition(scanner);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}