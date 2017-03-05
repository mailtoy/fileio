package ku.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * This class is use to read a file and copy by InputSteam, OutputSteam,
 * BufferedReader, and PrintWriter.
 * 
 * @author Kanchanok Kannee
 *
 */
public class FileUtil {

	/**
	 * Copy a file of InputStream to OutputStream byte-by-byte.
	 * 
	 * @param in is the Object of InputSteam to be read
	 * @param out is the Object of OutputSteam to be write.
	 */
	static void copy(InputStream in, OutputStream out) {
		int word = 0;
		try {
			while ((word = in.read()) != -1) {
				out.write(word);
				}
			} catch (Exception e) {
				throw new RuntimeException();
				} finally {
					try {
						in.close();
						out.close();
						} catch (IOException e) {
							
						}
					}
		}

	/**
	 * Copy a file of InputSteam to the OutputSteam using byte array of size
	 * blocksize.
	 * 
	 * @param in is the Object of InputStream to be read.
	 * @param out is the Object of OutputSteam to be write.
	 * @param blocksize is amount of byte to copy at a time.
	 */
	static void copy(InputStream in, OutputStream out, int blocksize) {

		byte[] buffer = new byte[blocksize];
		try {
			while (in.read(buffer) > 0) {
				out.write(buffer);
				}
			} catch (IOException e) {
				throw new RuntimeException();
				} finally {
					try {
						in.close();
						out.close();
						} catch (IOException e) {
							
						}
					}
		}

	/**
	 * Copy a file of InputSteam to the OutputSteam using BufferedReader to read the
	 * InputSteam and PrintWriter to write the OutputSteam and read line by line at
	 * a time.
	 * 
	 * @param in is the Object of InputStream.
	 * @param out is the Object of OutputSteam to be write.
	 */
	static void bcopy(InputStream in, OutputStream out) {

		PrintWriter printWriter = new PrintWriter(out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String text;
		try {
			while ((text = reader.readLine()) != null) {
				printWriter.write(text);
				}
			} catch (IOException e) {
				throw new RuntimeException();
				} finally {
					try {
						in.close();
						out.close();
						} catch (IOException e) {

						}
					}
		}
}
