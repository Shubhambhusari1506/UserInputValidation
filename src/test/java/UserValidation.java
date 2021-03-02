import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UserValidation {

    Firstname operation;

    @BeforeEach
    public void setUp(){
        operation = new Firstname();

    }

   @Test
    public void testFirstName(){
    Assertions.assertTrue(operation.checkFirstName("Shubham"));
    }
}