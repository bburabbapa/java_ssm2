package P0920;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JA0920_04_reader {

	public static void main(String[] args) {
		
		
		//문서를 읽어오기!!!!
		try {
			FileReader fr = new FileReader("C:/aaa/22.txt");
			BufferedReader br = new BufferedReader(fr);// 1줄씩 가져오기!!!!

			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				System.out.println(line);

			}
			fr.close();
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
