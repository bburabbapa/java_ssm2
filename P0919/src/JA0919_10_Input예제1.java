import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JA0919_10_Input예제1 {

	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("c:/aaa/2.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if (line==null) break;
				System.out.println(line);

			}
			br.close();			
		} catch (Exception e) {
			e.printStackTrace();

		}
		
	}//main

}//class
