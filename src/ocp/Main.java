package ocp;

/*
in the Open-Closed Principle,
the code allows for easy extension of validation rules without modifying the existing code.
If a new validation rule needs to be added or an existing rule needs to be modified,
then, new concrete classes can be created without changing
(1) the code in the Main class or
(2) the existing validation rules.
This promotes code reuse, flexibility, and maintainability.
*/

public class Main {
    public static void main(String[] args) {
        // Validation rules for username and password
        ValidationRule usernameRule = new UsernameValidationRule();
        ValidationRule passwordRule = new PasswordValidationRule();

        // User input for username and password
        String username = "sukumarsatyen";
        String password = "password123";
        // here if you change value to Password123 then output will be Password is valid: true

        // Perform validation
        boolean isUsernameValid = usernameRule.validate(username);
        boolean isPasswordValid = passwordRule.validate(password);

        // Output validation results
        System.out.println("Username is valid: " + isUsernameValid);
        System.out.println("Password is valid: " + isPasswordValid);
    }
}
