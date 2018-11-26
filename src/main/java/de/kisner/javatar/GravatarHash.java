package de.kisner.javatar;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GravatarHash
{
	private final static Logger logger = LoggerFactory.getLogger(GravatarHash.class);
	
	public static String hex(String message) {return hex(message.getBytes());}
	public static String hex(byte[] array)
	 {
		StringBuffer sb = new StringBuffer();
	      for (int i = 0; i < array.length; ++i) {
	      sb.append(Integer.toHexString((array[i]
	          & 0xFF) | 0x100).substring(1,3));        
	      }
	      return sb.toString();
	  }
	 
	  public static String md5Hex(String message)
	  {
	      try
	      {
	    	  MessageDigest md = MessageDigest.getInstance("MD5");
	    	  return hex (md.digest(message.trim().toLowerCase().getBytes("UTF-8")));
	      }
	      catch (NoSuchAlgorithmException e) {logger.warn(e.getMessage());}
	      catch (UnsupportedEncodingException e) {logger.warn(e.getMessage());}
	      return null;
	  }
}