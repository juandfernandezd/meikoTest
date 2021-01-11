package co.meiko.test.models;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {
	
	InputStream inputStream;
	private static Properties props;
	

	public PropertiesLoader() {
		super();
		props = new Properties();
	}

	public void getPropValues() throws IOException {
		 
		try {
			
			String propFileName = "registrador.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				props.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
 
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
	}
	
    public static String getMessageType(){
        return props.getProperty("messageType");
    }
   
	
}