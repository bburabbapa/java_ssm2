import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JA0919_14_InputOutput {

	public static void main(String[] args) throws Exception {
		File f = new File("c:/ccc");// 만약에 bbb 파일이 없다면 아래 파일로 저장
		if (!f.exists()) {//폴더가 있는지 확인해서 없으면 폴더를 생성하라
			f.mkdir();
		}
		FileInputStream fis = new FileInputStream("c:/aaa/lee.jpg"); // 파일읽기
		FileOutputStream fos = new FileOutputStream("c:/ccc/lee.jpg");// 파일저장

		while (true) {
			int read = fis.read();//파일을 바이트 단위로 읽어오기
			if (read == -1)//파일을 더이상 읽을 것이 없으면 멈춤
				break;//파일을 바이트 단위로 저장
			fos.write(read);

		} // while
		fis.close();//끝
		fos.close();//끝
		System.out.println("파일이 복사되었습니다.");

	}// main

}// class
