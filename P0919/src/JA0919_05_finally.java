import java.io.File;
import java.io.IOException;

public class JA0919_05_finally {

	public static void main(String[] args) {
		File f = new File("c:/aaa/a.txt");

		if (!f.exists()) {
			try {
				f.createNewFile();		
			} catch (IOException e) {
				e.printStackTrace(); // 메소드의 정보와 예외메시지를 화면에 출력한다
				System.out.println("입출력에러입니다. 아마 파일저장에서 에러가 난 듯합니다.");
			} // trycatch문
			catch (ArithmeticException e2) {
				e2.printStackTrace();
				System.out.println("숫자부분에 에러가 난 듯합니다.");
			} catch (ArrayIndexOutOfBoundsException e3) {
				e3.printStackTrace();
			} // try-Catch문
			catch(Exception e4) {
				System.out.println("");
			}
			
			
			System.out.println(1);
			System.out.println(2);
			try {
				System.out.println(0/0);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("예외가 발생해도, 발생 안해도 무조건 실행된다."); //try-catch-finally
			}
			
			
			
			
		} // if

	}// main

}// class
