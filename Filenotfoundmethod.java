package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filenotfoundmethod {
	public static void main(String[] args)throws IOException {
		try {
		File g = new File("C:\\Users\\SHABIR SHA\\Desktop\\sha.txt");
		FileReader fr = new FileReader(g);
		int temp=0;
		while((temp =fr.read())!=-1) {
			System.out.println((char)(temp));
		}
	}
        catch (FileNotFoundException a) {
        	a.printStackTrace();
        }
        System.out.println("rest of code");
}
}
