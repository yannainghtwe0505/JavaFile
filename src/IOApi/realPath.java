package IOApi;

import java.io.IOException;
import java.nio.file.Paths;

public class realPath {
	public static void main(String[] args) {
		try {
			System.out.println(Paths.get(".").toRealPath());
			System.out.println(Paths.get("C:\\Users\\Admin\\Desktop\\IT\\Solution\\new\\text.txt").toRealPath());
			System.out.println(Paths.get(".././food.txt").toRealPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
