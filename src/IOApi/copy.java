package IOApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class copy {
	public static void main(String[] args) {
		try {
			Files.copy(Paths.get("/temp/old/file.txt"), Paths.get("/temp/new/text.txt"),StandardCopyOption.REPLACE_EXISTING);
			var file = Paths.get("/temp/old/file.txt");
			var directory = Paths.get("/temp/old/dd/g");
			Files.copy(file, directory);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
