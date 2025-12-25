import java.util.regex.*;
public class Missingelement {
    public static void main(String[] args) {
        String password ="Omnarayan1234#";
       String regex= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
        if(password.matches(regex)){
            System.out.println("Password is valid");
        }
        else{
            System.out.println("Password is not valid");
        }

    }
}
