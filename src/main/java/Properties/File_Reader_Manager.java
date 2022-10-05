package Properties;

import java.io.IOException;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		
	}
		
	public static File_Reader_Manager getfrm() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	
	public Config_Reader getcr() throws IOException  {
		Config_Reader Cr = new Config_Reader();
		return Cr;
	}

}
