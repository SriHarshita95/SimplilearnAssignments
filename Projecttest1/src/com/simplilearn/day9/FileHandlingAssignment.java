package com.simplilearn.day9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileHandlingAssignment {

	public static void main(String[] args) throws IOException {
		// write a Java code to read, write, and append to a file.

		/* Change the path for the file before executing in local */

		System.out.println("Enter the option:\n1.Create a new file \n" + "2.Write a file \n" + "3.Read a  file \n"
				+ "4.Modify a file \n" + "5.Delete a file \n");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1:
			createNewFile();
			break;
		case 2:
			writeFile();
			break;
		case 3:
			readFile();
			break;
		case 4:
			modifyFile();
			break;
		case 5:
			deleteFile();
			break;

		}
	}
	public static void createNewFile() throws IOException {
		File file = new File("C://Files//test1.txt");

		// Create the file
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}

	}
	public static void writeFile() throws IOException {
		FileWriter writer = new FileWriter(
				"C://Files//test1.txt");
		writer.write("File Handling Assignment");
		writer.close();
		System.out.println("File has been written");
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void readFile() throws IOException {
		List l = Files.readAllLines(Paths.get("C://Files//test1.txt"), StandardCharsets.UTF_8);

		Iterator<String> itr = l.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
	@SuppressWarnings("static-access")
	public static void modifyFile() throws IOException {
		FileHandling3 f3=new FileHandling3();
		f3.modifyFile("C://Files//test1.txt", "2", "modified");
		System.out.println("File Modified");
	}
	public static void deleteFile() throws IOException {
		Files.deleteIfExists(Paths.get("C://Files//test1.txt"));
		System.out.println("File deleted");
	}
}
