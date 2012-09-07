package net.sf.gravatarjsf.jsf;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

import net.sf.gravatarjsf.util.GravatarHash;

@FacesComponent(value="net.sf.gravatarjsf.jsf.Gravatar")
public class Gravatar extends UINamingContainer 
{
	private static final String gHostSecure = "https://secure.gravatar.com";
	
	public String urlForMail(String email)
	{
		System.out.println("urlForMail "+email);
		StringBuffer sb = new StringBuffer();
		sb.append(gHostSecure);
		sb.append("/avatar/");
		sb.append(GravatarHash.md5Hex(email));
		sb.append("?s=").append(12);
		sb.append("&d=identicon");
		
		return sb.toString();

	}
	
	public String urlForHash(String hash)
	{
		StringBuffer sb = new StringBuffer();
		sb.append(gHostSecure);
		sb.append("/avatar/");
		sb.append(hash);
		sb.append("?s=").append(12);
		sb.append("&d=identicon");
		
		return sb.toString();

	}
}
