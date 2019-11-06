
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class TestLog4j {
	
	private static final Logger _logger = Logger.getLogger(TestLog4j.class);
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream log4jRead = new FileInputStream("log4j.properties");
		
		Properties log4jProptery = new Properties();
		log4jProptery.load(log4jRead);
		
		BasicConfigurator.configure();
		_logger.info("--");
		_logger.info("BasicConfigurator로 로그설정");
	}

}
