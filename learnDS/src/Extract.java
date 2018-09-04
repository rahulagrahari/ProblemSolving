import java.io.File;

public class Extract {
	
	public void extract(String path) {
		
		File dir = new File(path);
		
		File[] file = dir.listFiles();
		for(File f : file) {
			if(f.isDirectory()) {
				extract(f.getAbsolutePath());
			}
			else
			System.out.println(f.getName()+"----is a file");
		}
		
	}

}
