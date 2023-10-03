package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportClass {
	
	public static void generateReport(String json)
	{

		File file=new File("C:\\Users\\Dell\\eclipse-workspace\\Cucumberproject\\target");
		Configuration con=new Configuration(file,"letcode page inspect");
		con.addClassifications("user","umasit");
		con.addClassifications("Tools","Cucumber-7.11.1");
		con.addClassifications("UserStory","108956");
		
		List<String>li=new LinkedList<String>();
		li.add(json);
		
		ReportBuilder report=new ReportBuilder(li, con);
		report.generateReports();
		
			
		
	}
}
