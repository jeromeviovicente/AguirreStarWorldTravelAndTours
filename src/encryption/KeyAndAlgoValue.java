package encryption;

import java.io.InputStream;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Properties;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class KeyAndAlgoValue {
	private static final String ALGO = "AES/CBC/PKCS5PADDING";

	public static SecretKey getSecretKeyValue() throws Exception {
		SecretKey secretKey = new SecretKeySpec(getKeyStringValue().getBytes("UTF-8"), "AES");
		return secretKey;
	}

	//Reading property file
	public static String getKeyStringValue() throws Exception {

		Properties prop = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();    

		
		InputStream inputStream = loader.getResourceAsStream("config.properties");
		prop.load(inputStream);

		String secretKeyValue = prop.getProperty("secretKey");

		return secretKeyValue;
	}


	public static String getAlgo(){
		return ALGO;
	}


}
