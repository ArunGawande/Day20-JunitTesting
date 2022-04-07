package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.firstNameValidate("Krunali");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.firstNameValidate("krunali");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.lastNameValidate("Lole");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.lastNameValidate("lol");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.phoneNumberValidate("91 9561272972");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.phoneNumberValidate("9561272972");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.passwordValidate("Kruna23#%");
        Assert.assertFalse(result);
    }
}