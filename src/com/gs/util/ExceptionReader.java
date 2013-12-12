package com.gs.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Date;

import org.apache.log4j.Logger;

public class ExceptionReader {
	public String s;
	private Logger logger = Logger.getLogger(this.getClass());
	private String temp;
	private File file;

	public ExceptionReader() {
		try {
			file = new File("D://Elec//Elec.log");
			s = s + "File Name : " + file.getName() + "<br>";
		} catch (Exception e1) {
			logger.error(e1.getMessage());
			e1.printStackTrace();
		}
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while ((temp = br.readLine()) != null) {
				s = s + temp + "\n";
			}

		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public String read(){
		String re = new String();
		try {
			file = new File("D://Elec//Elec.log");
			re = re + "File Name : " + file.getName() + "<br>";
		} catch (Exception e1) {
			logger.error(e1.getMessage());
			e1.printStackTrace();
		}
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while ((temp = br.readLine()) != null) {
				re = re + temp + "<br>";
			}

		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
		return re;
	}

}
