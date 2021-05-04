package p18.lecture;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A27HandleException {
	public static void main(String[] args) {
		String path = "src/p18/lecture/A26HandleException.java";
		
		try (FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(path);
			BufferedInputStream bis = new BufferedInputStream(fis)
			){
			
			fis.read();
			bis.read();
			fos.write('a');
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

