package ku.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class FileUtil {
	
	 static void copy(InputStream in, OutputStream out) {
		 int word = 0;
		 try {
			 while((word = in.read()) != -1) {
				 out.write(word);
			 }
			 in.close();
			 out.close();
		 } catch (Exception e) {
			 throw new RuntimeException();
		}
		 
		 
		
	}
	
	 static void copy(InputStream in, OutputStream out, int blocksize)  {
	
		byte[] buffer = new byte[blocksize];
		try {
			while (in.read(buffer) > 0) {
				out.write(buffer);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException();
		
		
		}
		
		
	}
	
	static void bcopy(InputStream in, OutputStream out) {
//		ช่วยให้มันเป็นstring
		PrintWriter printWriter = new PrintWriter(out);
//		อ่านข้อมูที่มีเป็นInputStreamReader แล้วข้อมูลอยูในin
//	เปลี่ยนinputstream ให้เป็น reader

		//		
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String text ;
		try {
			while ((text = reader.readLine()) != null) {
				printWriter.write(text);
			}
			reader.close();
			printWriter.close();
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException();
		}	
	}
	

}
