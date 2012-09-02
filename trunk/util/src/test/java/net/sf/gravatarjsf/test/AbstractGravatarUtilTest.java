package net.sf.gravatarjsf.test;

import java.util.Random;

import net.sf.exlp.util.io.LoggerInit;

import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractGravatarUtilTest
{
	final static Logger logger = LoggerFactory.getLogger(AbstractGravatarUtilTest.class);
	
	@BeforeClass
    public static void initLogger()
	{
		LoggerInit loggerInit = new LoggerInit("log4junit.xml");	
		loggerInit.addAltPath("config.gravatarjsf-util");
		loggerInit.init();
    }
	
	protected int rndI()
	{
		Random rnd = new Random();
		return rnd.nextInt();
	}
	
	protected int rndIp()
	{
		Random rnd = new Random();
		int i = rnd.nextInt();
		if(i==0){i=1;}
		if(i<0){i=i*-1;}
		return i;
	}
	
	protected int rndI(int max)
	{
		Random rnd = new Random();
		return rnd.nextInt(max);
	}
	
	protected double rndD()
	{
		Random rnd = new Random();
		return rnd.nextDouble();
	}
}