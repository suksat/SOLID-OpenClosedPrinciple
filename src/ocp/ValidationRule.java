package ocp;

/*
 * The following example demonstrates the Open-Closed Principle (OCP)
 * by providing an extensible and reusable validation mechanism for username and password.
 * The validation logic can be easily extended without modifying the existing code.
 */

// Base class representing the validation rule
public abstract class ValidationRule {
    public abstract boolean validate(String input);
}

