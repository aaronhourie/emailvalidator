package emailvalidator;

/**
 * Singleton class to hold the Email Validator. 
 * @author aaron
 * 
 */
public class EmailValidator {
 
  private static EmailValidator instance;
  
  private EmailValidator() {
    
  }
  /**
   * Returns an instance of the singleton EmailValidator
   * If there isn't one instantiated, it creates one.
   * @return
   */
  public static EmailValidator getInstance(){
    if (instance == null) {
      instance = new EmailValidator();
    }
    return instance;
  }
  
  /**
   * Checks to see if an Email is valid.
   * For an email to be valid, it must meet these criteria:
   *  - Has at least one '.' character.
   *  - Has only one '@' character.
   *  
   * @param email - The email to check.
   * @return - Whether the string was a valid email.
   */
  public boolean isValid(String email) {
    
    int numDots = 0;
    int numAts = 0;
    // Loop through all of the characters in the string.
    for (char ch : email.toCharArray()) {
      // Count the number of '@' and '.'
      switch (ch) {
        case '.' :
          numDots++;
          break;
        case '@' :
          numAts++;
          break;
      }
    }
    // There can only be 1 '@' for the email to be valid. 
    // There must be one or  more '.' for the email to be valid.
    if (numAts == 1 && numDots >= 1) {
      return true;
    }
    else {
      return false;
    }
  }
}
