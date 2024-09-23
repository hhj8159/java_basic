package lesson18_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		// EOD : End of File
		
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop\\복사.txt"); // 읽어온거 복사
//		System.out.println(fis.available());
		int i = 0;
		int cnt = 0;
		while((i = fis.read()) != -1) {
			cnt++;
			System.out.println((char)i + ":" + i);
			fos.write(i); // 읽어온거 복사
		}
		System.out.println(cnt + "bytes");
		fis.close();
	}
}
