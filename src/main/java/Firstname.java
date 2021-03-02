
import java.util.regex.Pattern;

    public class Firstname {

        private static final String FIRST_NAME_PATTERN = "^[A-Z]{1,}[a-z]{2,}$";


        public boolean checkFirstName(String fname) {
            Pattern pattern = Pattern.compile(fname);
            return Pattern.matches(FIRST_NAME_PATTERN,fname);

        }

        }

