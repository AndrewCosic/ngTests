import org.testng.annotations.Test;

public class ngTest {

    @Test(priority = 0)
    void setup() {
        System.out.println("unutra");
    }

    @Test (priority = 1)
    void testSteps() {
        System.out.println("unutra steps");
    }

    @Test (priority = 2)
    void tearDown() {
        System.out.println("unutra Down");
    }

}
