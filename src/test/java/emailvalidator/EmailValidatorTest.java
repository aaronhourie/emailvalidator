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
  
  private final static String[] rejectedEmails = 
    {"carolemailcom",
     "johnemail.com",
     "jane@emailcom",
     "bob.smith@email@com",
     "alice@email.co.uk",
    };
  
  @Test
  public void testAcceptedEmails() {
   EmailValidator emailValidator = EmailValidator.getInstance();
   assertNotNull(emailValidator);
   
   // Check all of the known acceptable email addresses
   for (String email : acceptedEmails){
     boolean result = emailValidator.isValid(email);
     assertTrue(result);   
   }
  }
  
  @Test
  public void TestRejectedEmails() {
    EmailValidator emailValidator = EmailValidator.getInstance();
    assertNotNull(emailValidator);

    // Check all of the known unacceptable email addresses
    for (String email : rejectedEmails){
      boolean result = emailValidator.isValid(email);
      assertFalse(result);   
    } 
  }
}
