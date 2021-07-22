package de.kisner.javatar;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestGravatarHash extends AbstractJavatarTest
{
	final static Logger logger = LoggerFactory.getLogger(TestGravatarHash.class);   
  
	private String email,expected;
	
	@BeforeEach
	public void init()
	{
		email = "test@email";
		expected = "d8f5709bad94422db6e8d300f4a3a7a";
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
}