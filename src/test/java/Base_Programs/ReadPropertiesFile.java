package Base_Programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadPropertiesFile {
	private Properties  props;

	public ReadPropertiesFile() throws IOException {
		props = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\java\\DataProvider\\Config.properties");
		props.load(fis);
		fis.close();
	}
	
	public Properties getproperties() {
		return props;
	}
}


