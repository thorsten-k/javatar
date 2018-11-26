package de.kisner.javatar;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GravatarDownloader
{
	private final static Logger logger = LoggerFactory.getLogger(GravatarDownloader.class);
	
	public GravatarDownloader()
	{
		logger.trace("Initiated");
	}
	
	public byte[] download(String email) throws MalformedURLException, IOException
	{
		StringBuilder sb = new StringBuilder();
		sb.append("https://www.gravatar.com/avatar/");
		sb.append(GravatarHash.md5Hex(email));
		sb.append("?");
		sb.append("d=mp");

		URL url = new URL(sb.toString());
		BufferedInputStream in = new BufferedInputStream(url.openStream());
		
		return IOUtils.toByteArray(in);
	}
}