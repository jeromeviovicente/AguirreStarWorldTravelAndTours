package encryption;

import java.security.Key;
import java.security.*;
import javax.crypto.*;

import sun.misc.*;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

public class Decrypt {
	
	public static String decrypt(String encryptedData, byte[] iv) throws Exception {
	
		Cipher cipher = Cipher.getInstance(KeyAndAlgoValue.getAlgo());
		cipher.init(Cipher.DECRYPT_MODE, KeyAndAlgoValue.getSecretKeyValue(), new IvParameterSpec(iv));
		
		byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
		byte[] decryptedByteValue = cipher.doFinal(decordedValue);
		String decryptedStringValue = new String(decryptedByteValue);
		return decryptedStringValue;
	}
}
