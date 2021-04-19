package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A13TryWithResources {
	public static void main(String[] args) {
		String path = "src/p10/lecture/A13TryWithResources.java";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
			//..
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
