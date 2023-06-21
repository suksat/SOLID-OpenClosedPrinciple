package ocp;

// Concrete class representing the password validation rule
public class PasswordValidationRule extends ValidationRule {
    @Override
    public boolean validate(String input) {
        return input != null && input.length() >= 8 && !input.equals(input.toLowerCase()) && !input.equals(input.toUpperCase()) && input.matches(".*\\d.*");
    }
}
