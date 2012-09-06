package net.sf.gravatarjsf.jsf;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

import net.sf.gravatarjsf.util.GravatarHash;

@FacesComponent(value="net.sf.gravatarjsf.jsf.Gravatar")
public class Gravatar extends UINamingContainer 
{
	public String size(String input)
	{
		return ""+input.length();
	}
	
	public String url(String email)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("https").append("://");
		sb.append("secure.gravatar.com");
		sb.append("/avatar/");
		sb.append(GravatarHash.md5Hex(email));
		sb.append("?s=").append(12);
		sb.append("&d=identicon");
		
		return sb.toString();

	}
}
