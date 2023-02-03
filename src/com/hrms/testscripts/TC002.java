package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {

@Test
public void Tc002() {
	
	General m=new General();
	m.openApplication();
	m.login();
	
	m.enterFrame();
	m.addNewEmp();
	m.exitFrame();
	m.logout();
	
	m.closeApplication();
	}
}
