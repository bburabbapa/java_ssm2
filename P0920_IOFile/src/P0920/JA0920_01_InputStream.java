package P0920;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class JA0920_01_InputStream {

	public static void main(String[] args) { //파일을 읽어올 때 사용

		//1. 1바이트를 가져옴
//		File f = new File("c:/aaa/11.txt");// f라는 참조변수에 객체로 넣음
//		try {
//			FileInputStream fis = new FileInputStream(f);
//			int read = 0;
//			while ((read = fis.read()) != -1) {// 더이상 읽은 파일이 없음
//			System.out.println((char)read); //char는 2바이트를 가져옴(한글지원이안됨)
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		
		//2. 바이트 배열단위로 가져옴
		byte[] b = new byte[1024];
		try {
			FileInputStream fis = new FileInputStream("c:/aaa/11.txt");
			int read = 0;
			while ((read = fis.read(b)) != -1) {
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일을 읽어오기");
		
	}// main

}// class
