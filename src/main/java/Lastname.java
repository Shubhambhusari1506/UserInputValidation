
import java.util.regex.Pattern;

    public class Lastname {

        private static final String PASSWORD= "(?=.*?[A-Z]).{1,}(?=.*?[a-z]).{7,}$";


        public boolean checkPassword(String password) {
            Pattern pattern = Pattern.compile(password);
            return Pattern.matches(PASSWORD,password);

        }

        }

