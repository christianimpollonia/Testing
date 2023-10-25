import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void fizz_test() {
        String result = FizzBuzz.fizzBuzz(10);
        Assert.assertEquals("", result, "1 2 Fizz 4 Buzz Fizz 7 8 Fizz ");
    }
}
