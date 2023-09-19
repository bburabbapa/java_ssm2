import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JA0919_11_Input예제2 {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("c:/aaa/3.txt");
			BufferedReader br = new BufferedReader(fr);
			while (true) {

				String line = br.readLine();
				if (line == null)
					break;
				System.out.println(line);
			}
			br.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}// main

}// class
