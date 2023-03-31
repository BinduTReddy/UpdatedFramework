package Base_Programs;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ITestListenerClass extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result)
	{
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");
		String methodName = result.getName();
		if(!result.isSuccess())
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try 
			{
				String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/ScreenShots/";
				File destFile = new File((String) reportDirectory+"/failure_screenshots/"+methodName+"_"+formater.format(calendar.getTime())+".png");
				FileUtils.copyFile(scrFile, destFile);
				Reporter.log("<a href='"+ destFile.getAbsolutePath() + "'> <img src='"+ destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
			}                                                                                                                                                                              
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");
		String methodName = result.getName();
		if(result.isSuccess())
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try 
			{
				String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/ScreenShots/";
				File destFile = new File((String) reportDirectory+"/Pass_screenshots/"+methodName+"_"+formater.format(calendar.getTime())+".png");
				FileUtils.copyFile(scrFile, destFile);
				//Reporter.log("<a href='"+ destFile.getAbsolutePath() + "'> <img src='"+ destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}




