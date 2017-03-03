package ku.util;

public class BlockCopyTask extends FileCopyTask {
	
	private int blocksize;
	
	public BlockCopyTask(String infilename, String outfilename,int blocksize) {
		super(infilename, outfilename);
		this.blocksize = blocksize;
	
	}
	
	public void setBlocksize(int blocksize) {
		this.blocksize = blocksize;
	}

	/**Perform the copy */
	public void run() {
		FileUtil.copy(in, out, blocksize);
	}
	
	/**Describe the task. */
	public String toString() {
		return "Copy file one block at a time.";
	}

}
