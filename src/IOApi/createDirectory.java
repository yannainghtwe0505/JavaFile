package IOApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class createDirectory {
	public static void main(String[] args) {
		try {
			Files.createDirectory(Path.of("/temp/field"));
			Files.createDirectories(Path.of("/temp/field/pasture/green"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
