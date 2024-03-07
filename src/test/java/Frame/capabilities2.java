package Frame;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class capabilities2 extends capabilities1{
	AndroidDriver<AndroidElement>driver;
	
	@BeforeTest
	public void bt() throws IOException, InterruptedException {
		
		service = startServer();
		
		driver = capabilities(deviceName, plateformName, AppPackage, AppActivity);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
@Test

public void tst() {
	System.out.println("hello");
	
	}
@AfterTest
public void st() {
	service.stop();
}

}
