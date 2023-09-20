package P0920;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JA0920_02__OutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:/aaa/22.txt");
			String str = "1,손승민,100,100,100,300,100.0,1\r\n";
			String str2 = "2,손흥민,100,100,100,300,100.0,1\r\n";
			byte[] bytes = str.getBytes();// 바이트단위로 분리해야 글이 저장됨
			for (byte b : bytes) {		// getBytes();  	
				fos.write(b);
			}
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("파일저장완료");
	}

}
