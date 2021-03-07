
import java.util.regex.Pattern;

    public class Lastname {

            private static String firstName = "^[A-Z]{1}[a-z]{2,14}$";
            private static String lastName = "^[A-Z]{1}[a-z]{2,14}$";
            private static String email_ = "^[A-Za-z0-9+-]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]{2,}){1,2}$";
            private static String phoneNumber = "^[0-9]{2}[ ][6-9]{1}[0-9]{9}$";
            private static String  passwordPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}";

            public boolean checkFirstName(String name) throws UserValidationException {
                Pattern p = Pattern.compile(name);
                if(!Pattern.matches(firstName, name)){
                    throw new UserValidationException("Invalid First Name..!!");
                }
                return true;
            }
            public boolean checkLastName(String name) throws UserValidationException {
                Pattern p = Pattern.compile(name);
                if(!Pattern.matches(lastName, name)){
                    throw new UserValidationException("Invalid Last Name..!!");
                }
                return true;
            }
            public boolean checkEmail(String email) throws UserValidationException {
                Pattern p =Pattern.compile(email);
                if(!Pattern.matches(email_, email)){
                    throw new UserValidationException("Invalid Email..!!");
                }
                return true;
            }
            public boolean checkPhoneNumber(String phoneNum) throws UserValidationException {
                Pattern p = Pattern.compile(phoneNum);
                if(!Pattern.matches(phoneNumber, phoneNum)) {
                    throw new UserValidationException("Invalid Phone Number..!!");
                }
                return true;
            }
            public boolean checkPassword(String password) throws Exception {
                Pattern p = Pattern.compile(password);
                if(!Pattern.matches(passwordPattern, password)){
                    throw new UserValidationException("Invalid Password..!!");
                }
                return true;
            }
        }


