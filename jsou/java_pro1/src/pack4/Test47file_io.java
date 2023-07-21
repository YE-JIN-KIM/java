package pack4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;

public class Test47file_io {
	// file i/o 연습
	// 2byte 단위로 데이터 입출력 : 문자 처리에 효과적
	public void writeFile(File file, ArrayList<String> strList) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));  //FileWriter 부분만 다름
			
			for(String s:strList) {
				writer.write(s, 0, s.length());
				writer.newLine();   // line skip
				
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("writeFlie err : " + e.getMessage());
		}
	}
	
	public void readFile(File file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));  //FileReader 이것만 다름
			String oneLine;
			String ss = null;
			StringBuffer sbuffer = new StringBuffer();  //문자열 더하기를 대신 해주는 클ㄹ래스
			while((oneLine = reader.readLine()) != null) {
				//ss = ss + oneLine;   자바는 문자열 더하기를 연속적으로 하는 것을 비권장
				sbuffer.append(oneLine + "\n");
			}
			reader.close();
			
			System.err.println(sbuffer.toString());   //StringBuffer의 내용 출력
		} catch (Exception e) {
			System.out.println("readFile err : " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("자바 만세");
		list.add("nice");
		list.add("good");
		File file = new File("c:/work/iotest3.txt");
		
		Test47file_io tf = new Test47file_io();
		tf.writeFile(file, list);   // list의 기억된 데이터를 파일ㄹ로 저장하기
		tf.readFile(file);      // 보조 기억장치에 저장된 파이을 주기억장치로 읽기
	}

}
