package com.zoho.fetchlogs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnalyseFirewallLogs {

	public static void analyseLogs() {
		try {
			  File logFile = new File("C:\\Windows\\System32\\LogFiles\\Firewall\\pfirewall.log");
			  Scanner logFileReader = new Scanner(logFile);
			  //ignoring first 5 lines of description
			  for(int i=0;i<5;i++)
				  logFileReader.nextLine();  
			  while (logFileReader.hasNextLine()) {
				 String data = logFileReader.nextLine();
				 String[] parts = data.split(" ");
				 //ip address which it access
				 System.out.println(parts[5]);
			  }
			  logFileReader.close();
		   } 
		   catch (FileNotFoundException e) {
			   System.out.println("An error occurred.");
			   e.printStackTrace();
		   }
	}

}
