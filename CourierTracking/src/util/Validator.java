package util;

public class Validator {

    public static boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static boolean isAlpha(String input) {
        return input.matches("[a-zA-Z ]+");
    }

    public static boolean isValidStatus(String status) {
        return status.equalsIgnoreCase("Accepted") || status.equalsIgnoreCase("Rejected");
    }

    public static boolean isNumeric(String input) {
        return input.matches("\\d+");
    }
}
