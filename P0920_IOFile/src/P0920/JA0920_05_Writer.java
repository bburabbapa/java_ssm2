package P0920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JA0920_05_Writer {

	public static void main(String[] args) {

		// 글을 저장하기!!!!!
		String str = "1,손승민,100,100,100,300,100.0,1\r\n";
		str += "2,손흥민,100,100,100,300,100.0,1\r\n";
		str += "3,손현민,100,100,100,300,100.0,1\r\n";

		try {
			FileWriter fw = new FileWriter("c:/aaa/22.txt", true);// false: 덮어쓰기 true: 이어쓰기
			BufferedWriter bw = new BufferedWriter(fw); // 한번에저장
			bw.write(str);
			bw.close();

		} catch (Exception e) {
 
			e.printStackTrace();
		}
		System.out.println("저장완료");

	}

}
