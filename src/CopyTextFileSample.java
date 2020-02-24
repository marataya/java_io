import java.io.*;
import java.util.*;

public class CopyTextFileSample {
	public static List<String> readFile(File source) throws IOException {
		List<String> data = new ArrayList<String>();
		try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
			String s;
			while((s = reader.readLine()) != null) data.add(s);
		}
		return data;
	}

	public static void writeFile(List<String> data, File dest) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) {
			for (String s: data) {
				writer.write(s);
//				writer.newLine
			}
		}
	}

}
