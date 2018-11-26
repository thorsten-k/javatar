package de.kisner.javatar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestGravatarHash extends AbstractJavatarTest
{
	final static Logger logger = LoggerFactory.getLogger(TestGravatarHash.class);   
  
	private String email,expected;
	
	@Before
	public void init()
	{
		email = "t.kisner@aht-group.com";
		expected = "d8f5709bb9d94422db6e8d300f4a3a7a";
	}
	
    @Test
    public void hashMd5()
    {
    	String actual = GravatarHash.md5Hex(email);
    	Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void hashDirect()
    {
    	String actual = GravatarHash.hex(email);
    	Assert.assertEquals(expected, actual);
    }
}