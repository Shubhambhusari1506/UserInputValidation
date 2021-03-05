
import java.util.regex.Pattern;

    public class Lastname {

        private static String firstName = "^[A-Z]{1}[a-z]{2,14}$";
        private static String lastName = "^[A-Z]{1}[a-z]{2,14}$";
        private static String email_ = "^[0-9a-zA-Z]+([._+-]?[0-9a-zA-Z]+)*@[0-9A-Za-z]+(.[a-z]{2,})*[,]*(.[a-z]{2,})*$";
        private static String phoneNumber = "^[0-9]{2}[ ][6-9]{1}[0-9]{9}$";
        private static String  PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";



        public boolean checkFirstName(String name){
            Pattern p = Pattern.compile(name);
            return Pattern.matches(firstName, name);
        }
        public boolean checkLastName(String name){
            Pattern p = Pattern.compile(name);
            return Pattern.matches(lastName, name);
        }
        public boolean checkEmail(String email){
            Pattern p =Pattern.compile(email);
            return Pattern.matches(email_, email);
        }
        public boolean checkPhoneNumber(String phoneNum){
            Pattern p = Pattern.compile(phoneNum);
            return Pattern.matches(phoneNumber, phoneNum);
        }
        public boolean checkPassword(String password){
            Pattern p = Pattern.compile(password);
            return Pattern.matches(PASSWORD, password);
        }
    }



