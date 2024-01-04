package practicepro2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) { 
        String email = "mounika@gmail.com";
        if (isValidEmail(email)) {
            System.out.println("The email address is valid.");
        } else {
            System.out.println("Invalid email address format.");
        }
    }
    public static boolean isValidEmail(String email) {      
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
