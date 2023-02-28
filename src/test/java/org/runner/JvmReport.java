package org.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
public class JvmReport {
	public static void generateJvmreport(String jsonpath) {
		File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\Jvmreport");
			Configuration config = new Configuration(f,"IndianBank");
			List<String>lis=new ArrayList<String>();
			lis.add(jsonpath);
			ReportBuilder r = new ReportBuilder(lis, config);
			r.generateReports();
			
		}

}
