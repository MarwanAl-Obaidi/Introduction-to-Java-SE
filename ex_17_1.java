import java.io.*;
public class StudentsInfile {
	public static void main(String[] args) throws IOException {
		String fileName = "students.txt";
		String readRow = null;
		boolean rowsLeft = true;
		BufferedReader reader = null;
		FileReader file = null;
		file = new FileReader(fileName);
		reader = new BufferedReader(file);
		System.out.println("Course students: ");
		while (rowsLeft) {
			readRow = reader.readLine();
			if (readRow == null) {
				rowsLeft = false;
			} else {
				System.out.println(readRow);
			}
		}
		reader.close();
	}
}