package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileReadWrite {
	public static void writeToFile(File f) throws IOException  {
		String data = "Theis is a data that is char stream";
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			//file writed allows to write 16 bits of data to be typed
			fw = new FileWriter(f);
//			if we sue direct write it allows to write only one char i.e. 16 bit data
//			fw.write('c');
			// buffer allows to write a stream of data that is array of char
			bw = new BufferedWriter(fw);
			bw.write(data);
			bw.flush();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fw.close();
			bw.close();
		}
	}
	
	public static void readFile(File f) {
		String data = null;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
			
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws IOException {
		//it uses only exsrting file, not create new file
		File f = new File("abs.txt");
		System.out.println(f.exists());
		
		//creating new file
		if (!f.exists()) {
			f.createNewFile();
		}
		
	}
}
