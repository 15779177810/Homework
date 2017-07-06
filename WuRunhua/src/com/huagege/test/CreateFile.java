package com.huagege.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time = sdf.format(new Date(System.currentTimeMillis()));
		File file = new File(time+".txt");
		if(!file.exists())
			file.createNewFile();
	}
	
}
