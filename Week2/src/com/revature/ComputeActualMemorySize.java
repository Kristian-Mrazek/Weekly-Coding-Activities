package com.revature;

public class ComputeActualMemorySize {
	
	public static String actualMemorySize(String ms) {
		
		double msNumber = 0;
		if (ms.contains("G")) {
			msNumber = Double.parseDouble(ms.split("G")[0]) * 1000.0;
		} else if (ms.contains("M")) {
			msNumber = Double.parseDouble(ms.split("M")[0]);
		} else {
			return "Please enter memory size in MB or GB.";
		}
		
		msNumber = msNumber * 0.93;
		
		String actualMs = "";
		if (msNumber > 1000) {
			msNumber = (Math.round(msNumber * 100) / 100.0) / 1000.0;
			actualMs = String.valueOf(msNumber) + "GB";
		} else {
			msNumber = Math.round(msNumber);
			actualMs = String.format("%.0f", msNumber) + "MB";
		}
		
		return actualMs;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(actualMemorySize("32GB"));
		System.out.println(actualMemorySize("2GB"));
		System.out.println(actualMemorySize("512MB"));
		
	}

}
