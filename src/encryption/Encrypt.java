package encryption;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;

import sun.misc.*;

public class Encrypt {
    public static String encrypt(String dataToEncrypt, byte[] iv) throws Exception {
    	
        Cipher cipher = Cipher.getInstance(KeyAndAlgoValue.getAlgo());
        
        cipher.init(Cipher.ENCRYPT_MODE, KeyAndAlgoValue.getSecretKeyValue(), new IvParameterSpec(iv));
        
        byte[] encryptedByteValue = cipher.doFinal(dataToEncrypt.getBytes());
        
        String encryptedStringValue = new BASE64Encoder().encode(encryptedByteValue);
        return encryptedStringValue;
    }
}

