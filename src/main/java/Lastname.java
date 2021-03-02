
import java.util.regex.Pattern;

    public class Lastname {

        private static final String PASSWORD= "^[A-Za-z]{8}$";


        public boolean checkPassword(String password) {
            Pattern pattern = Pattern.compile(password);
            return Pattern.matches(PASSWORD,password);

        }

        }

