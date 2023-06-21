package ocp;

// Concrete class representing the username validation rule
public class UsernameValidationRule extends ValidationRule {
    @Override
    public boolean validate(String input) {
        return input != null && input.length() >= 5 && input.matches("[a-zA-Z0-9]+");
    }
}
