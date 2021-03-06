package com.bridgelabz.userregistration;
import org.junit.Assert;
import org.junit.Test;

public class InvalidUserInputException extends Exception
{

    @Test
     public void givenFirstName_whenProper_ShouldReturnTrue() {
    try {
        UserRegistration userRegistrationRegEx = new UserRegistration();
        boolean result = userRegistrationRegEx.firstNameValidate("Krunali");
        Assert.assertTrue(result);
    } catch (Exception e) {
    }
}

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.firstNameValidate("krunali");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.lastNameValidate("Lole");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.lastNameValidate("lol");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.phoneNumberValidate("91 9561272972");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.phoneNumberValidate("9561272972");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistration userRegistrationRegEx = new UserRegistration();
            boolean result = userRegistrationRegEx.passwordValidate("Kruna23#%");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

}
