package P0920;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JA0920_03_IOFile {

	public static void main(String[] args) {

		//우선 파일생성하기!!!
		File f = new File("c:/ccc");
		if (!f.exists())
			f.mkdir();// 폴더생성

		try {
			FileInputStream fis = new FileInputStream("c:/aaa/lee.jpg");
			FileOutputStream fos = new FileOutputStream("c:/ccc/lee.jpg");

			while (true) {
				int read = fis.read();// 바이트단위로 파일을 읽어오기
				if (read == -1)
					break;
				fos.write(read);

			}
			fis.close();//끝
			fos.close();//끝
			System.out.println("파일저장완료");

		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("폴더생성완료");

	}

}
