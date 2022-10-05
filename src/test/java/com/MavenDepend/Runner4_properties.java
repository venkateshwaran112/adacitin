package com.MavenDepend;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.Page_Obj_Manager.Pg_obj_Mgr;
import Properties.File_Reader_Manager;
public class Runner4_properties extends Baseclass {
	
	public static WebDriver driver = browserlaunch("chrome");
	public static Pg_obj_Mgr pom = new Pg_obj_Mgr(driver);
		
	public static void main(String[] args) throws IOException, InterruptedException {
        
        String u = File_Reader_Manager.getfrm().getcr().geturl();
        url(u);
		String Usrname = File_Reader_Manager.getfrm().getcr().getUsrname();
		usrinput(pom.getWp1().getUsrname(), Usrname);
		String Pwd = File_Reader_Manager.getfrm().getcr().getPwd();
        usrinput(pom.getWp1().getPwd(), Pwd);
        usrclick(pom.getWp1().getLogin());
        
        
        usrselect(pom.getWp2().getLocation(),3);
        usrselect(pom.getWp2().getHotels(),2);
        usrselect(pom.getWp2().getRoomtype(), 2);
        usrselect(pom.getWp2().getAdultroom(), 3);
        usrselect(pom.getWp2().getChildroom(),2);
        usrscreen(File_Reader_Manager.getfrm().getcr().getScrpath());
//        usrclick(pom.getWp2().getSubmit());
//        
//        usrclick(pom.getWp3().getRadiobutton());
//        usrclick(pom.getWp3().getConti());
////        
//        String Firstname = File_Reader_Manager.getfrm().getcr().getFirstname();
//        usrinput(pom.getWp4().getFirstname(), Firstname);
//        String Lastname = File_Reader_Manager.getfrm().getcr().getLastname();
//        usrinput(pom.getWp4().getLastname(), Lastname);
//        String Address = File_Reader_Manager.getfrm().getcr().getAddress();
//        usrinput(pom.getWp4().getAddress(), Address);
//        String Ccnum = File_Reader_Manager.getfrm().getcr().getCcnum();
//        usrinput(pom.getWp4().getCcnum(), Ccnum);
//        usrselect(pom.getWp4().getCctype(),3);
//        usrselect(pom.getWp4().getCcexpmonth(),6);
//        usrselect(pom.getWp4().getCcexpyear(), 7);
//        String Cccvv = File_Reader_Manager.getfrm().getcr().getCccvv();
//        usrinput(pom.getWp4().getCccvv(), Cccvv);
//        usrclick(pom.getWp4().getBooknow());
////        
//        usrclick(pom.getWp5().getLogout());
	}
}

