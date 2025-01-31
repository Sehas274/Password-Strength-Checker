package password.strength.checker;

import com.formdev.flatlaf.FlatDarkLaf;
import password.strength.checker.GUI.CheckePassword;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        
        FlatDarkLaf.setup();
        CheckePassword Checker = new CheckePassword();
        Checker.setVisible(true);
    }
}
