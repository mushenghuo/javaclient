package jHelp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public static void main(String[] args) {
	String path = System.getProperty("user.dir");
	File file = new File( path+"//img");
	
	File[] files = file.listFiles();
	System.out.println(file);
	system.out.println("this is git gui test");
}
