
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class MainTest {

    @Test
    public void testHypotenuse(){
        assertEquals(5 , Main.hypotenuse(3,4));
    }
}
