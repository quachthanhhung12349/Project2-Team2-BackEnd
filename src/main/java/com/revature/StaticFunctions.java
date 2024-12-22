package com.revature;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StaticFunctions {
    // Regular expression for validating an email address
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    // Function to check if the email is valid
    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false; // Email should not be null or empty
        }

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        // Match the input email with the regex pattern
        Matcher matcher = pattern.matcher(email);

        // Return true if the email matches the pattern, false otherwise
        return matcher.matches();
    }
}
