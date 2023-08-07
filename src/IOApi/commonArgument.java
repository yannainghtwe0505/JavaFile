package IOApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class commonArgument {
	public static void main(String[] args) {
		Path p = Path.of("whale");
		p.resolve("krill");
		System.out.println(p); // whale
		Path path = Paths.get("/land/hippo/harry.happy");
		System.out.println("The Path Name is: " + path);
		for(int i=0; i<path.getNameCount(); i++)
		System.out.println(" Element " + i + " is: " + path.getName(i));
	}
	 void copy(Path source, Path target) throws IOException {
		Files.move(source, target,
		LinkOption.NOFOLLOW_LINKS,
		StandardCopyOption.ATOMIC_MOVE);
		
		
		}

}
