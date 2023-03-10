package Day13;

import java.io.FileWriter;
import java.io.IOException;

public class Ex03_FileWriter {
	
	public static void main(String[] args) {
		FileWriter fw = null;
		String str = "텍스트 파일 출력 메시지";
		
		try {
			fw = new FileWriter("test2.txt");	// 파일명 test2.txt 로 출력스트림 객체 생성
			fw.write(str, 0, str.length());	  	// 문자열 str 을 index 0~끝까지 출력
			fw.close();							// 자원 해제
		} catch (IOException e) {
			System.err.println("입출력 시, 예외가 발생하였습니다");
			e.printStackTrace();
		}
		
	}

}
