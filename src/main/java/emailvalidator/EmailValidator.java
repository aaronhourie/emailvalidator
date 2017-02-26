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
  
  public static EmailValidator getInstance(){
    if (instance == null) {
      instance = new EmailValidator();
    }
    return instance;
  }
  
  public boolean isValid(String email) {
    return false;
  }
}
