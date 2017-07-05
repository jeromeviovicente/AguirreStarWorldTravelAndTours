package encryption;

import java.security.SecureRandom;

public class GenerateIV {
	public static byte[] getIV(){
		/**
		 * 		a. Use SecureRandom to generate random bits
		 * 		   The size of the IV matches the blocksize of the cipher (128 bits for AES)
		 * 		b. Construct the appropriate IvParameterSpec object for the data to pass to Cipher's init() method
		 */
		
		// change this as desired for the security level you want
		final int AES_KEYLENGTH = 128;
		
		// Save the IV bytes or send it in plaintext with the encrypted data so you can decrypt the data later
		byte[] iv = new byte[AES_KEYLENGTH / 8];
		SecureRandom prng = new SecureRandom();
		prng.nextBytes(iv);
		
		return iv;
	}
}
