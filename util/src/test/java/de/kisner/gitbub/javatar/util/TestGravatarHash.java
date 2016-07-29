package de.kisner.gitbub.javatar.util;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.kisner.gitbub.javatar.AbstractGravatarUtilTest;
import de.kisner.github.javatar.util.GravatarHash;

public class TestGravatarHash extends AbstractGravatarUtilTest
{
	final static Logger logger = LoggerFactory.getLogger(TestGravatarHash.class);   
  
	private String email,expected;
	
	@Before
	public void init()
	{
		email = "someone@somewhere.com";
		expected = "923d10bc97028030e8e67e7db62658d1";
	}
	
    @Test
    public void hash()
    {
    	String actual = GravatarHash.md5Hex(email);
    	Assert.assertEquals(expected, actual);
    }
}