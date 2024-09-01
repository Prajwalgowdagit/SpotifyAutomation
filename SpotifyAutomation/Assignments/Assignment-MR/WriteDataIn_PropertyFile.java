package assignments;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataIn_PropertyFile {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text");
		String txt=sc.nextLine();
		FileOutputStream fos=new FileOutputStream("D:\\Doc\\SDET\\JAVA\\CD.txt");
		byte[] strToBytes = txt.getBytes();
		fos.write(strToBytes);
		fos.close();
	}

}
