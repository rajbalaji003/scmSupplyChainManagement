package scmSMC.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getDataFromPropertiesFile(String Key) throws IOException {
		
		FileInputStream fis = new 	FileInputStream("./Data/scm.properties");
		Properties pobj =new Properties();
		pobj.load(fis);
		String data =pobj.getProperty(Key);
		
		
		return data;
	}

}
