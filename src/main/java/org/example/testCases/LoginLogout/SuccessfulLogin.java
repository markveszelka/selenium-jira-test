package org.example.testCases.LoginLogout;

import org.example.LogIn;
import org.example.testCases.Runnable;

public class SuccessfulLogin implements Runnable {
    private final LogIn logIn;

    public SuccessfulLogin(LogIn logIn) {
        this.logIn = logIn;
    }

    @Override
    public void run() {
        logIn.logIn();
    }
}
