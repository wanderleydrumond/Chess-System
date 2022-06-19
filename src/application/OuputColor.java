package application;

import lombok.Getter;

@Getter
public enum OuputColor {
    ANSI_RESET("\u001B[0m"),

    ANSI_BLACK_TEXT("\u001B[30m"),
    ANSI_RED_TEXT("\u001B[31m"),
    ANSI_GREEN_TEXT("\u001B[32m"),
    ANSI_YELLOW_TEXT("\u001B[33m"),
    ANSI_BLUE_TEXT("\u001B[34m"),
    ANSI_PURPLE_TEXT("\u001B[35m"),
    ANSI_CYAN_TEXT("\u001B[36m"),
    ANSI_WHITE_TEXT("\u001B[37m"),

    ANSI_BLACK_BACKGROUND("\u001B[40m"),
    ANSI_RED_BACKGROUND("\u001B[41m"),
    ANSI_GREEN_BACKGROUND("\u001B[42m"),
    ANSI_YELLOW_BACKGROUND("\u001B[43m"),
    ANSI_BLUE_BACKGROUND("\u001B[44m"),
    ANSI_PURPLE_BACKGROUND("\u001B[45m"),
    ANSI_CYAN_BACKGROUND("\u001B[46m"),
    ANSI_WHITE_BACKGROUND("\u001B[47m");

    private String color;
    OuputColor(String color) {
        this.color = color;
    }
}