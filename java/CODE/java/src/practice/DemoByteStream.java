package practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class DemoByteStream {
	public static void writeBytes(File f) {
		String s = "This is a  byte Stream";
		
		try( BufferedOutputStream out = new BufferedOutStream(new FileOutputStream(f))) {
			byte[] data = s.getByte();
			out.write(data);
			out.flush();
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static readBytes(File f) {
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(f))){
			byte[] data - new byte[1024]; //byte[in.available()] --> make size of thearray according to the size of input
			while(in.read(data) != -1) {
				String s = new String(data);
				System.out.println(s);
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}                                                                    
		
	}
	
	main
}
