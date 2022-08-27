package sk.extremesystems.smartgwt13withjetty.client.blockchain;

import java.security.MessageDigest;

public class SHA256Helper {
	public static String generateHash(String data) {
		try
		{
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hash = md.digest(data.getBytes("UTF-8"));
			StringBuffer hexStr = new StringBuffer();
			for (int i=0; i< hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1) hexStr.append('0');
				hexStr.append(hex);
			}
			return hexStr.toString();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
}
