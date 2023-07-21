package pack4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Test48file_io {

	public static void main(String[] args) throws Exception{
		// 이진 데이터 형식을 파일 입출력
		Test48MyData data = new Test48MyData();
		
		// 이진 데이터 형식으로 파일 저장
		//File f = new File("c:/work/iotest4.dat");  // 밑에 두줄을 한번에 적는법
		File dir = new File("c:/work/");
		File f = new File(dir, "iotest4.dat");
		FileOutputStream fo = new FileOutputStream(f);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(data);
		System.out.println("저장 성공");
		oo.close(); bo.close(); fo.close();   // 생성의 역순으로 닫기를 진행
		
		System.out.println();
		// 이진 데이터 형식으로 파일 읽가
		File f1 = new File("c:/work/iotest4.dat");
		FileInputStream fis = new FileInputStream(f1);
		BufferedInputStream b1 = new BufferedInputStream(fis);
		ObjectInputStream oi = new ObjectInputStream(b1);
		Object obj = oi.readObject();
		Test48MyData myData = (Test48MyData)obj;
		System.out.println(myData.number);
		System.out.println(myData.weight);
		System.out.println(myData.irum);
		System.out.println(myData.juso);
		oi.close(); b1.close(); fis.close();
		
		
	}

}
