package ku.util;

public class BufferedReaderTask extends FileCopyTask{
	
	public BufferedReaderTask(String infilename, String outfilename) {
		super(infilename, outfilename);
	
	}

	/**Perform the copy */
	public void run() {
		FileUtil.bcopy(in, out);
	}
	
	/**Describe the task. */
	public String toString() {
		return "Copy file one line at a time.";
	}


}
