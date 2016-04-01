package day02;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Test2 {
	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("e:\\aa.txt");
			out.write(10000000);
			
			DataOutputStream dout = new DataOutputStream(out);
			dout.writeInt(10000000);
			new BufferedOutputStream(dout);
			
			//InputStream   Reader
			InputStreamReader in = new InputStreamReader(new FileInputStream(""));
		
		    new BufferedReader(new InputStreamReader(new FileInputStream("")));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
