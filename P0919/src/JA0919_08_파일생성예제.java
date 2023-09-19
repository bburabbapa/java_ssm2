import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class JA0919_08_파일생성예제 {

	public static void main(String[] args) {
		// 파일을 1개 생성해서 file객체는 폴더와 파일을 생성할 수가 있음
		// 폴더 생성

		File f = new File("c:/abc");
		f.mkdir();
		System.out.println("폴더가생성되었습니다.");

		File fFile = new File("c:/abc/1.txt");
		try { // 예외처리
			fFile.createNewFile();// throws Exception 을 사용하면 이렇게 적으면됨
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}

	}// main
}// class

//	static File createFile(String filename) {
//		if(fileName==null || fileName=="") {
//		fileName = "c:/aaa/제목없음.txt"
//	}
//	
//	File f = new File(fileName);
//	
//	try {
//		f.createNewFile();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	System.out.println(filename+"파일생성되었습니다.");
//	return f;
//	}
