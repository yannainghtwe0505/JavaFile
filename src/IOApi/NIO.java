package IOApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class NIO {
	public static void main(String[] args) {
		try {
			nio();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void nio() throws IOException {
		var path = Path.of("C:\\Users\\Admin\\Documents\\Project\\Dummy");
		if (Files.exists(path)) {
			System.out.println("Absolute Path: " + path.toAbsolutePath());
			System.out.println("Is Directory: " + Files.isDirectory(path));
			System.out.println("Parent Path: " + path.getParent());
			if (Files.isRegularFile(path)) {
				System.out.println("Size: " + Files.size(path));
				System.out.println("Last Modified: " + Files.getLastModifiedTime(path));
			} else {
				try (Stream<Path> stream = Files.list(path)) {
					stream.forEach(p -> System.out.println(" " + p.getFileName()));
				}
			}
		}
	}
}
