import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class UserValidation {

    Lastname operation;

    @BeforeEach
    public void setUp(){
        operation = new Lastname();

    }

   @Test
    public void testLastName(){
    Assertions.assertTrue(operation.checkLastName("Bhu"));
    }
}