package com.sky.nowtvpasswordreset;

/**
 * Created by jsi14 on 15/04/16.
 */
public class PasswordComplexityValidator {
    private IPasswordReUseChecker mPasswordReUseChecker = null;
    public PasswordComplexityValidator(IPasswordReUseChecker passwordReUseChecker) {
        mPasswordReUseChecker = passwordReUseChecker;
    }

    public boolean Validate(String password1, String password2)
    {
        return true;
    }
}
