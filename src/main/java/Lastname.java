
import java.util.regex.Pattern;

    public class Lastname {

        private static final String EMAIL_PATTERN= "\"^[_A-Za-z0-9-\\\\+]+(\\\\.[A-Za-z0-9-]+)*@\" + \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$\"";


        public boolean checkEmail(String mail) {
            Pattern pattern = Pattern.compile(mail);
            return Pattern.matches(EMAIL_PATTERN,mail);

        }

        }

