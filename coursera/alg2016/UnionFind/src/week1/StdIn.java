package week1;

import java.io.IOException;

public class StdIn {
	public static int readInt(){
		try {
			return System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	}

	public static boolean isEmpty() {
		return readInt() == -1;
	}
	

}
