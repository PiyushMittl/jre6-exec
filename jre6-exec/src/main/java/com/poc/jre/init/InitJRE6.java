package com.poc.jre.init;

public class InitJRE6 {
	public static void main(String[] args) throws Throwable {
		String[] commands = new String[] { "C:\\Program Files\\java\\jre6\\bin\\java", "-cp", "C:\\Piyush", "Test6" };
		ProcessBuilder processBuilder = new ProcessBuilder(commands);
		Process process = processBuilder.start();
		int errCode = process.waitFor();
		System.out.println(errCode);
		System.out.println("Echo command executed, any errors? " + (errCode == 0 ? "No" : "Yes"));
	}
}
