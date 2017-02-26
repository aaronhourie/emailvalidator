package emailvalidator;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailValidatorTest {

  
  private final static String[] acceptedEmails = 
    {"john@email.com",
     "jane@email.com",
     "bob.smith@email.com",
     "alice@email.co.uk",
    };

  @Test
  public void testAcceptedEmails() {
   EmailValidator emailValidator = EmailValidator.getInstance();
   assertNotNull(emailValidator);
   
   
   for (String email : acceptedEmails){
     boolean result = emailValidator.isValid(email);
     assertTrue(result);   
   }
  }
}
