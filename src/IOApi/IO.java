package IOApi;

import java.io.File;

public class IO {
	public static void main(String[] args) {
		io();
	}

	public static void io() {
		var file = new File("C:\\Users\\Admin\\Documents\\Project\\Dummy\\zoo.txt");
		System.out.println(file.exists());
		if (file.exists()) {
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Is Directory: " + file.isDirectory());
			System.out.println("Parent Path: " + file.getParent());
			if (file.isFile()) {
				System.out.println("Size: " + file.length());
				System.out.println("Last Modified: " + file.lastModified());
			} else {
				for (File subfile : file.listFiles()) {
					System.out.println(" " + subfile.getName());
				}
			}
		}
	}

}
