package org.example;

public class WrongFixedPasswordGenerator implements PasswordGenerator {
    public String generatePassword() {
        return "ab"; //8글자
    }
}
