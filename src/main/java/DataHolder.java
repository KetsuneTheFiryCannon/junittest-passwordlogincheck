import java.util.ArrayList;
import java.util.List;

public class DataHolder {
    String login;
    String password;

    public DataHolder(String login) {
        this.login = login;
    }

    public DataHolder(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public List<String> CheckingLogin() {
        List<String> dataTransfer = new ArrayList<>();
        dataTransfer.add(login);
        System.out.println(login);
        return dataTransfer;
    }

    public int CheckingPassword() {
        System.out.println("Your Login is: " + login);
        System.out.println("Your Password is: " + password);
        boolean equal = login.equals(password);
        boolean nullCheck = login!=null && password!=null;
        int total = 0;
        if (!equal && nullCheck) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    total++;
                    break;
                }
            }
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    total++;
                    break;
                }
            }
            for (int i=0; i<password.length(); i++)
            {
                if (Character.isLowerCase(password.charAt(i))){
                    total++;
                    break;
                }
            }
            for (int i=0; i<password.length(); i++)
            {
                if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))){
                    total++;
                    break;
                }
            }
            if (password.length()> 6) total++;
        } else {
        total = 0;
        return  total;
        }
        return total;
    }
}
