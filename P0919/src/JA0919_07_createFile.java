import java.io.File;
import java.io.IOException;

public class JA0919_07_createFile {
	// 1. main 메소드
	public static void main(String[] args) {
		String aName = "";
		File f = createFile("");//createFile메소드호출

	}// main

	// 2. createFile 메소드
	static File createFile (String fileName) {
		try {
		if(fileName==null || fileName.equals(""));
		throw new Exception("파일이름이 유효하지 않습니다.");			
		} catch (Exception e) {
			fileName ="C:/aaa/제목없음.txt";
			e.getMessage();
		}finally {
			File f = new File (fileName);
			try {
				f.createNewFile();

			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(fileName+"파일이 생성되었습니다.");
			return f;
		}
			
		}// createFile

	// 3. createNewFile 메소드
//	static void createNewFile(File f) {

	}//class

