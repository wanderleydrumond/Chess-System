package application;

import lombok.Getter;

/**
 * Codes to print coloured font and background on the console
 *
 * @see <a href="https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println">How to print color in console using System.out.println?</a>
 */
@Getter
public enum OutputColor {
    /**
     * Reset all configurations
     */
    RESET("\u001B[0m"),
    
    /**
     * Black regular text
     */
    BLACK_TEXT_NORMAL("\u001B[30m"),
    /**
     * Red regular text
     */
    RED_TEXT_NORMAL("\u001B[31m"),
    /**
     * Green regular text
     */
    GREEN_TEXT_NORMAL("\u001B[32m"),
    /**
     * Yellow regular text
     */
    YELLOW_TEXT_NORMAL("\u001B[33m"),
    /**
     * Blue regular text
     */
    BLUE_TEXT_NORMAL("\u001B[34m"),
    /**
     * Purple regular text
     */
    PURPLE_TEXT_NORMAL("\u001B[35m"),
    /**
     * Cyan regular text
     */
    CYAN_TEXT_NORMAL("\u001B[36m"),
    /**
     * White regular text
     */
    WHITE_TEXT_NORMAL("\u001B[37m"),
    
    /**
     * Black bold text
     */
    BLACK_TEXT_BOLD("\033[1;30m"),
    /**
     * Red bold text
     */
    RED_TEXT_BOLD("\033[1;31m"),
    /**
     * Green bold text
     */
    GREEN_TEXT_BOLD("\033[1;32m"),
    /**
     * Yellow bold text
     */
    YELLOW_TEXT_BOLD("\033[1;33m"),
    /**
     * Blue bold text
     */
    BLUE_TEXT_BOLD("\033[1;34m"),
    /**
     * Purple bold text
     */
    PURPLE_TEXT_BOLD("\033[1;35m"),
    /**
     * Cyan bold text
     */
    CYAN_TEXT_BOLD("\033[1;36m"),
    /**
     * White bold text
     */
    WHITE_TEXT_BOLD("\033[1;37m"),

    /**
     * Black underlined text
     */
    BLACK_TEXT_UNDERLINE("\033[4;30m"),
    /**
     * Red underlined text
     */
    RED_TEXT_UNDERLINE("\033[4;31m"),
    /**
     * Green underlined text
     */
    GREEN_TEXT_UNDERLINE("\033[4;32m"),
    /**
     * Yellow underlined text
     */
    YELLOW_TEXT_UNDERLINE("\033[4;33m"),
    /**
     * Blue underlined text
     */
    BLUE_TEXT_UNDERLINE("\033[4;34m"),
    /**
     * Purple underlined text
     */
    PURPLE_TEXT_UNDERLINE("\033[4;35m"),
    /**
     * Cyan underlined text
     */
    CYAN_TEXT_UNDERLINE("\033[4;36m"),
    /**
     * White underlined text
     */
    WHITE_TEXT_UNDERLINE("\033[4;37m"),

    /**
     * Black text in high contrast
     */
    BLACK_TEXT_BRIGHT("\033[0;90m"),
    /**
     * Red text in high contrast
     */
    RED_TEXT_BRIGHT("\033[0;91m"),
    /**
     * Green text in high contrast
     */
    GREEN_TEXT_BRIGHT("\033[0;92m"),
    /**
     * Yellow text in high contrast
     */
    YELLOW_TEXT_BRIGHT("\033[0;93m"),
    /**
     * Blue text in high contrast
     */
    BLUE_TEXT_BRIGHT("\033[0;94m"),
    /**
     * Purple text in high contrast
     */
    PURPLE_TEXT_BRIGHT("\033[0;95m"),
    /**
     * Cyan text in high contrast
     */
    CYAN_TEXT_BRIGHT("\033[0;96m"),
    /**
     * White text in high contrast
     */
    WHITE_TEXT_BRIGHT("\033[0;97m"),

    /**
     * Black bold text in high contrast
     */
    BLACK_TEXT_BRIGHT_BOLD("\033[1;90m"),
    /**
     * Red bold text in high contrast
     */
    RED_TEXT_BRIGHT_BOLD("\033[1;91m"),
    /**
     * Green bold text in high contrast
     */
    GREEN_TEXT_BRIGHT_BOLD("\033[1;92m"),
    /**
     * Yellow bold text in high contrast
     */
    YELLOW_TEXT_BRIGHT_BOLD("\033[1;93m"),
    /**
     * Blue bold text in high contrast
     */
    BLUE_TEXT_BRIGHT_BOLD("\033[1;94m"),
    /**
     * Purple bold text in high contrast
     */
    PURPLE_TEXT_BRIGHT_BOLD("\033[1;95m"),
    /**
     * Cyan bold text in high contrast
     */
    CYAN_TEXT_BRIGHT_BOLD("\033[1;96m"),
    /**
     * White bold text in high contrast
     */
    WHITE_TEXT_BRIGHT_BOLD("\033[1;97m"),

    /**
     * Black background
     */
    BLACK_BACKGROUND("\u001B[40m"),
    /**
     * Red background
     */
    RED_BACKGROUND("\u001B[41m"),
    /**
     * Green background
     */
    GREEN_BACKGROUND("\u001B[42m"),
    /**
     * Yellow background
     */
    YELLOW_BACKGROUND("\u001B[43m"),
    /**
     * Blue background
     */
    BLUE_BACKGROUND("\u001B[44m"),
    /**
     * Purple background
     */
    PURPLE_BACKGROUND("\u001B[45m"),
    /**
     * Cyan background
     */
    CYAN_BACKGROUND("\u001B[46m"),
    /**
     * White background
     */
    WHITE_BACKGROUND("\u001B[47m"),

    /**
     * Black background in high contrast
     */
    BLACK_BACKGROUND_BRIGHT("\033[0;100m"),
    /**
     * Red background in high contrast
     */
    RED_BACKGROUND_BRIGHT("\033[0;101m"),
    /**
     * Green background in high contrast
     */
    GREEN_BACKGROUND_BRIGHT("\033[0;102m"),
    /**
     * Yellow background in high contrast
     */
    YELLOW_BACKGROUND_BRIGHT("\033[0;103m"),
    /**
     * Blue background in high contrast
     */
    BLUE_BACKGROUND_BRIGHT("\033[0;104m"),
    /**
     * Purple background in high contrast
     */
    PURPLE_BACKGROUND_BRIGHT("\033[0;105m"),
    /**
     * Cyan background in high contrast
     */
    CYAN_BACKGROUND_BRIGHT("\033[0;106m"),
    /**
     * White background in high contrast
     */
    WHITE_BACKGROUND_BRIGHT("\033[0;107m");

    /**
     * Enumeration content value.
     */
    private final String value;
    OutputColor(String value) {
        this.value = value;
    }
}