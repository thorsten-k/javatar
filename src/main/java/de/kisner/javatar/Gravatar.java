package de.kisner.javatar;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent(value="de.kisner.javatar.Gravatar")
public class Gravatar extends UINamingContainer 
{
	private static final String gHostSecure = "https://secure.gravatar.com";
	
	public String urlForMail(String email)
	{
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
