
import java.util.regex.Pattern;

    public class Lastname {

        private static final String EMAIL= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";


        public boolean checkEmail(String email) {
            Pattern pattern = Pattern.compile(email);
            return Pattern.matches(EMAIL,email);

        }

        }

