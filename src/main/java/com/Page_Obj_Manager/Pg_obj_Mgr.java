package com.Page_Obj_Manager;

import org.openqa.selenium.WebDriver;

import com.pom.POM1;
import com.pom.POM2;
import com.pom.POM3;
import com.pom.POM4;
import com.pom.POM5;

public class Pg_obj_Mgr {
	public WebDriver driver;
	private POM1 wp1;
	private POM2 wp2;
	private POM3 wp3;
	private POM4 wp4;
	private POM5 wp5;
	
	public POM5 getWp5() {
		if(wp5==null) {
			wp5=new POM5(driver);
		}
		return wp5;
	}

	public POM4 getWp4() {
		if(wp4==null) {
			wp4=new POM4(driver);
		}
		return wp4;
	}

	public POM3 getWp3() {
		if(wp3==null) {
			wp3=new POM3(driver);
		}
		return wp3;
	}

	public Pg_obj_Mgr(WebDriver driver2) {
		this.driver = driver2;
	}

	public POM2 getWp2() {
		if(wp2==null) {
			wp2=new POM2(driver);
		}
		return wp2;
	}

	public POM1 getWp1() {
		if (wp1==null) {
			wp1=new POM1(driver);
		}
		return wp1;
	}
	
	
	
	

}
