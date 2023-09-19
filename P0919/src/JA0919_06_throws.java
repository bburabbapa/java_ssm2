import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JA0919_06_throws {

	public static void main(String[] args) throws Exception { // throws: 예외문을 다른 메소드에 위임하여 넘긴다
		File f = new File("C:/download/aaa.txt");// 외부 하드디스크에 저장토록함
		if (!f.exists()) { // !는 not (존재하지않는다)

			f.createNewFile();

		} // if

		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.write("안녕하세요. 반갑습니다. 다음에 뵐께요. \r\n 두번째 줄입니다. \r\n");

	}// main

}// class
