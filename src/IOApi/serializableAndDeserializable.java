package IOApi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class serializableAndDeserializable {
	static List<Chimpanzee> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
		var gorillas = new ArrayList<Chimpanzee>();
		try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
			while (true) {
				var object = in.readObject();
				if (object instanceof Chimpanzee g)
					gorillas.add(g);
			}
		} catch (EOFException e) {
			// File end reached
		}
		return gorillas;
	}

	static void saveToFile(List<Chimpanzee> Chimpanzee, File dataFile) throws IOException {

		try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
			for (Chimpanzee gorilla : Chimpanzee)
				out.writeObject(gorilla);
		}
	}
	public static void main(String[] args) {
		var chimpanzees = new ArrayList<Chimpanzee>();
		chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
		chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));
		File dataFile = new File("C:\\Users\\Admin\\Desktop\\temp\\file.txt");
		try {
			saveToFile(chimpanzees, dataFile);
			var chimpanzeesFromDisk = readFromFile(dataFile);
			System.out.println(chimpanzeesFromDisk);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
