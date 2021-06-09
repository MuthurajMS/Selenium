package org.Base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Base02 {
public static void jvmreport(String jsonpath) {
	File f=new File("C:\\Users\\Asus\\eclipse-workspace\\Cucumber\\target\\jvmreport");
	Configuration con=new Configuration(f, jsonpath);
	con.addClassifications("Name","Muthuraj");
	con.addClassifications("browser","Chrome");
	con.addClassifications("os","windows 10");
	con.addClassifications("Automation tool","Eclipse Photon");
	
	List<String> l=new ArrayList<String>();
	l.add(jsonpath);
	
	ReportBuilder r=new ReportBuilder(l, con);
	r.generateReports();
}
}
