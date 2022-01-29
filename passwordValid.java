import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Write ur password: ");
        String password = sc.nextLine();

        // Creating array of string length
        char[] ch = new char[password.length()];

        // Copy character by character into array
        for (int i = 0; i < password.length(); i++) {
            ch[i] = password.charAt(i);
        }

        sizeCheck(ch);

        rule1Check(ch);

        String chacked1Pass = String.valueOf(ch);
        System.out.println(chacked1Pass);
        System.out.println(isValid(password));




    }
//check password size
    static void sizeCheck(char ch[]){
        if (ch.length<8){
            System.out.printf("Password too short");
            System.exit(0);
        }
    }

//check for downappercase
    static void rule1Check(char ch[]){
        for (int i = 0; i< ch.length; i++){
            if (ch[i] == '_' ){
                ch[i] = 1;
                break;
            }
        }
    }
    // digit + lowercase char + uppercase char + punctuation
    private static final String check = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
    private static final Pattern pattern = Pattern.compile(check);

    public static boolean isValid(final String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }



}
