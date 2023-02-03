package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
@Test
public void tc001(){
	
		General m=new General();
		m.openApplication();
		m.login();
		m.logout();
		m.closeApplication();
	}

}


