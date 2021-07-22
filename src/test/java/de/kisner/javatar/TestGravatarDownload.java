package de.kisner.javatar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestGravatarDownload extends AbstractJavatarTest
{
	final static Logger logger = LoggerFactory.getLogger(TestGravatarDownload.class);   
  
	private String email,expected;
	
	@BeforeEach
	public void init()
	{
		email = "test@email";
		expected = "d8f5709bb9d94422db6e8d300f4a3a7a";
	}
	
    @Test
    public void hashMd5()
    {
    	String actual = GravatarHash.md5Hex(email);
    	Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void hashDirect()
    {
    	String actual = GravatarHash.hex(email);
    	Assertions.assertEquals(expected, actual);
    }
    
    public static void main(String args[]) throws MalformedURLException, IOException
    {
    	GravatarDownloader dl = new GravatarDownloader();
    	
    	byte[] bytes = dl.download("");
    	
    	FileOutputStream output = new FileOutputStream(new File("target/file.png"));
    	IOUtils.write(bytes, output);
    }
}