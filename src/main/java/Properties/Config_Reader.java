package Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {
	public static Properties p;
		
  public Config_Reader() throws IOException
  {
	  File f = new File ("F:\\seleniumworkspace7am\\MavenDepend\\src\\main\\java\\Properties\\hotelapp.properties");
	  FileInputStream inp = new FileInputStream(f);
	  p = new Properties();
	  p.load(inp);
}
  
  public String getbrowser() {
	  String browser = p.getProperty("browser");
	  return browser;
	   }
  public String geturl() {
	  String url = p.getProperty("url");
	  return url;
	    }
  public String getUsrname() {
	  String Usrname = p.getProperty("Usrname");
	  return Usrname;
  }
  public String getPwd() {
	  String Pwd = p.getProperty("Pwd");
	  return Pwd;
  }
  public String getFirstname() {
	  String Firstname = p.getProperty("Firstname");
	  return Firstname;
  }
  public String getLastname() {
	  String Lastname = p.getProperty("Lastname");
	  return Lastname;
  }
  public String getAddress() {
	  String Address = p.getProperty("Address");
	  return Address;  
  }
  public String getCcnum() {
	  String Ccnum = p.getProperty("Ccnum");
	  return Ccnum;
  }
  public String getCccvv() {
	  String Cccvv = p.getProperty("Cccvv");
	  return Cccvv;
  }
  public String getScrpath() {
	  String Scrpath = p.getProperty("Scrpath");
	  return Scrpath;
  }
}
