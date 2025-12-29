
    
    package listeners;

    import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
    import org.testng.ITestResult;
    
    import org.ictkerala.base.TestBase;
import utility.ScreenshotUtil;

    public class Listener extends TestBase implements ITestListener {

        @Override
        public void onTestFailure(ITestResult result) {
            WebDriver driver=getDriver();
            ScreenshotUtil.takeScreenshot(driver,result.getName());
        }
    }