package properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import crud.CRUD;
import tables.DomesticAirLineOrigin;

public class PropertyFiles {
	
	public boolean isPropertyFileExist(){
		
		
		
		return true;
	}
	
	
/*	public boolean DeletePropertyFile(String propertName) throws Exception{
		
		
		
	}*/
	
	
	
	public static boolean AppendPropertyFile() throws Exception{
		try {
			Properties prop = new Properties();
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			OutputStream output = new FileOutputStream("daorigin.properties");
			
			for(DomesticAirLineOrigin data : CRUD.getDomesticAirLineOrigin()){
				// set the properties value
				prop.setProperty(data.getOriginName(), data.getOriginName());
			}
			
			// save properties to project root folder
			prop.store(output, null);

			output.close();
			return true;
			
		} catch (IOException io) {
			io.printStackTrace();
			return false;
		}
	}
	
}
