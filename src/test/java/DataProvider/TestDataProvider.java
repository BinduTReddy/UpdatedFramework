package DataProvider;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	public Map<String,String> testData = new HashMap<String,String>();

	@DataProvider(name="TestData")
	public static Object[][] TestData() {
		return new Object[][]
				{
			{"Test1"}
				};
	}
}
