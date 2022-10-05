package com.MavenDepend;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.Page_Obj_Manager.Pg_obj_Mgr;

public class Runner3_pgobjmgr extends Baseclass {
	
	public static Pg_obj_Mgr pom = new Pg_obj_Mgr(driver);
	
	public static void main(String[] args) throws IOException, InterruptedException {

        usrinput(pom.getWp1().getUsrname(), "venkatesh92");
        usrinput(pom.getWp1().getPwd(), "senthil");
        usrclick(pom.getWp1().getLogin());
        
        usrselect(pom.getWp2().getLocation(),3);
        usrselect(pom.getWp2().getHotels(),2);
        usrselect(pom.getWp2().getRoomtype(), 2);
        usrselect(pom.getWp2().getAdultroom(), 3);
        usrselect(pom.getWp2().getChildroom(),2);
        usrclick(pom.getWp2().getSubmit());
       
        
        usrclick(pom.getWp3().getRadiobutton());
        usrclick(pom.getWp3().getConti());
        
        usrinput(pom.getWp4().getFirstname(), "venkatesh");
        usrinput(pom.getWp4().getLastname(), "M");
        usrinput(pom.getWp4().getAddress(), "No.6 Vivekanandar Theru, Dubai");
        usrinput(pom.getWp4().getCcnum(), "1234569870147258");
        usrselect(pom.getWp4().getCctype(),3);
        usrselect(pom.getWp4().getCcexpmonth(),6);
        usrselect(pom.getWp4().getCcexpyear(), 7);
        usrinput(pom.getWp4().getCccvv(),"54761478596");
        usrclick(pom.getWp4().getBooknow());
        
        usrclick(pom.getWp5().getLogout());
        usrscreen("F:\\seleniumworkspace7am\\MavenDepend\\screen1\\adacit1.png");
	}
}
