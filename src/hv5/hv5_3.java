package hv5;

import java.security.SecureRandom;

public class hv5_3 {
	 String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 String lowercase = "abcdefghijklmnopqrstuvwxyz";
	 String number = "0123456789";
	 String chars = uppercase + lowercase + number;
	
	public static void main(String[] args) {
		hv5_3 hv = new hv5_3();
		System.out.println(hv.genAuthCode(8));
	}

	private String genAuthCode(int i) {
		SecureRandom sr = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        
        sb.append(uppercase.charAt(sr.nextInt(uppercase.length())));
        sb.append(lowercase.charAt(sr.nextInt(lowercase.length())));
        sb.append(number.charAt(sr.nextInt(number.length())));
        
        
        for(int z = 3 ; z < i; z++) {
        	sb.append(chars.charAt(sr.nextInt(chars.length())));
        }
		return sb.toString();
	}
	
}
