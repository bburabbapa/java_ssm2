import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JA0919_09_Input {

	public static void main(String[] args) throws IOException {

		// 1. 1바이트씩 읽어서 출력하시오
		try {
			InputStream is = new FileInputStream("c:/aaa/1.txt");
			int read = 0;
			while ((read = is.read()) != -1) {
				System.out.println((char) read);
			}

//			while(true) {
//				int read = is.read();
//				if (read<0) {
//					break;
//				}
//				System.out.println((char)read);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 2. 전체를 모두 읽어와서 출력
//		try {
//			byte[] b = new byte[1024];
//			InputStream is = new FileInputStream("c:/aaa/1.txt");
//			while (true) {
//				is.read(b);
//
//				System.out.print(new String(b));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}// main

}// class
