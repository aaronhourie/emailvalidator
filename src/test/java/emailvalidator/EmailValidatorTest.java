package emailvalidator;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailValidatorTest {


  @Test
  public void testAcceptedEmails() {
   EmailValidator emailValidator = EmailValidator.getInstance();
   assertNotNull(emailValidator);
   boolean result = emailValidator.isValid("john@email.com");
   assertTrue(result);
  }
}
