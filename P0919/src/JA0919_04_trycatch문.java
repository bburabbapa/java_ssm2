import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JA0919_04_trycatch문 {

	public static void main(String[] args) {
		File f = new File("C:/download/aaa.txt");// 외부 하드디스크에 저장토록함(파일을 생성함)
		if (!f.exists()) { // !는 not (존재하지않는다)
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} // if
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter writer = new BufferedWriter(fw);
			writer.write("안녕하세요. 반갑습니다. 다음에 뵐께요. \r\n 두번째 줄입니다. \r\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일이 생성되었습니다.");

	}// main

}// class
