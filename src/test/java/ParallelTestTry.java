import core.BrowserFactory;
import org.testng.annotations.Test;


public class ParallelTestTry extends BrowserFactory {

    @Test
    void tryIt() throws InterruptedException {
        driver.get("https://kismia.com/");
        Thread.sleep(5000);
    }



}
