package createFile;

import java.io.File;

public class FIleCreate {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.name"));
		
		File dir = new File("C:/Users/jyoti-jyoti/Desktop/TestLeaf Training/Selenium_Project Backup/TestDirectory1.txt");
	    
	    // attempt to create the directory here
	    boolean successful = dir.mkdir();
	    if (successful)
	    {
	      // creating the directory succeeded
	      System.out.println("directory was created successfully");
	    }
	    else
	    {
	      // creating the directory failed
	      System.out.println("failed trying to create the directory");
	    }

	}

}
