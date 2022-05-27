package com.simplilearn.day9day10;

import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;

public class FileHandling2 {
	public static List<String> readFileInList(String fileName) {

		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

	public static void main(String[] args) {
		List l = readFileInList("C://Files//testFile2.txt");

		Iterator<String> itr = l.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
