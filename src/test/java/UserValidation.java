import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class UserValidation {
    UserValidation operation;

    @ParameterizedTest
    @MethodSource("getEmailTests")
    public void test_email(String email, boolean expResult) throws UserValidationException {
        Assertions.assertEquals(expResult, operation.checkEmail(email));
    }

    private static Stream<Arguments> getEmailTests() {
        return Stream.of(
                Arguments.of("abc@yahoo.com", true),
                Arguments.of("abc-100@yahoo.com", true),
                Arguments.of("abc.100@yahoo.com", true),
                Arguments.of("abc111@abc.com", true),
                Arguments.of("abc@.com.my", false),
                Arguments.of("abc@gmail.com.aa.au", false),
                Arguments.of(".abc@com.com", true),
                Arguments.of("abc+100@gmail.com", true)
        );
    }

    @BeforeEach
    public void setUp() {
        operation = new UserValidation();
    }

    @Test
    public void testFirstName_true() {

        Assertions.assertDoesNotThrow(() -> {
            operation.checkFirstName("Shubham");
        });
    }

    @Test
    public void testFirstName_false() {

        Assertions.assertThrows(UserValidationException.class, () -> {
            operation.checkFirstName("shubham");
        });
    }

    @Test
    public void testLastName_true() {
        Assertions.assertDoesNotThrow(() -> {
            operation.checkLastName("Bhusari");
        });
    }

    public void testLastName_false() {
        Assertions.assertThrows(UserValidationException.class, () -> {
            operation.checkLastName("bhusari");
        });
    }

    @Test
    public void checkEmail_true() {
        Assertions.assertDoesNotThrow(() -> {
            operation.checkEmail("shubhambhusari2@gmail.com");
        });
    }

    @Test
    public void checkEmail_false() {

         Assertions.assertThrows(UserValidationException.class, () ->{
             operation.checkEmail("shubhambhusari2.asd.asd.@gmail.com");
         });
    }

    @Test
    public void checkPhoneNumber_true() {
          Assertions.assertDoesNotThrow(() -> {
              operation.checkPhoneNumber("91 8888937397");
          });
    }

    @Test
    public void checkPhoneNumber_false() {
        Assertions.assertThrows(UserValidationException.class, () -> {
            operation.checkPhoneNumber("91 8888937397");
        });
    }

    @Test
    public void checkPassword_true() {

        Assertions.assertDoesNotThrow(() -> {
            operation.checkPassword("Shubh@123");
        });
    }

    @Test
    public void checkPassword_false() {

        Assertions.assertThrows(UserValidationException.class, () ->{
            operation.checkPassword("Shubh@123");
        });
    }


}