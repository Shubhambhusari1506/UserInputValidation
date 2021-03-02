
import java.util.regex.Pattern;

    public class Lastname {

        private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2}$";


        public boolean checkLastName(String name) {
            Pattern pattern = Pattern.compile(name);
            return Pattern.matches(LAST_NAME_PATTERN,name);

        }

        }

