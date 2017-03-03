package ku.util;

public class ByteCopyTask extends FileCopyTask {
	
	public ByteCopyTask(String infilename, String outfilename) {
		super(infilename,outfilename);
	
	}
	
	/**Perform the copy */
	public void run() {
		FileUtil.copy(in, out);
	}
	
	/**Describe the task. */
	public String toString() {
		return "Copy file one byte at a time.";
	}

}
