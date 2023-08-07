package IOApi;

import java.nio.file.Path;
import java.nio.file.Paths;

public class relativizingPath {
	public static void main(String[] args) {
		var path1 = Path.of("dd/fish.txt");
		var path2 = Path.of("rel/friendly/birds.txt");
		System.out.println(path1.relativize(path2));
		System.out.println(path2.relativize(path1));
		
		Path path3 = Paths.get("E:\\habitat\\ddd");
		Path path4 = Paths.get("E:\\sanctuary\\raven\\poe.txt");
		
		System.out.println(path3.relativize(path4));
		System.out.println(path4.relativize(path3));
		
	}

}
