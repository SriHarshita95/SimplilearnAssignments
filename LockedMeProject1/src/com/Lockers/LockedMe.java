package com.Lockers;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
* Company Lockers
* MS FSD APR 2022 Cohort 1
* LockedMe.com / Project 1
*/

public class LockedMe {
	static File folder = new File("C://LockedMeProject1");
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("****************************************************");
		System.out.println("        Lockers Company Project        ");
		System.out.println("----------------------------------------------------");
		System.out.println("This Project is developed by 'Sri Harshita Tata'");
		System.out.println("****************************************************\n");
		boolean bool = folder.mkdir();
		if (bool) {
			System.out.println("Folder is created successfully");
		} else {
			System.out.println("Folder Already Created!");
		}
		boolean bExit = false;
		while (!bExit) {
			try {
				System.out.println("\nSelect one option: ");
				System.out.println("1.Get all the current files present in the folder");
				System.out.println("2.Details of user interface");
				System.out.println("3.Close the Application\n");
				int option = scanner.nextInt();
				switch (option) {
				case 1:
					getAllFiles();
					break;

				case 2: {
					boolean cExit = false;
					while (!cExit) {
						System.out.println("\nPlease select the option to perform: ");
						System.out.println("1.Create/Add new file");
						System.out.println("2.Delete a file");
						System.out.println("3.Search a file");
						System.out.println("4.Exit");
						int option2 = scanner.nextInt();
						switch (option2) {
						case 1:
							createFile();
							break;
						case 2:
							deleteFile();
							break;
						case 3:
							searchFile();
							break;
						case 4:
							cExit = true;
							break;
						default:
							cExit = true;
							break;
						}
					}
				}
					break;
				case 3:
					bExit = true;
					break;
				default:
					bExit = true;
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Enter only numbers");
			}
		}
	}

	private static void searchFile() {
		try {
			System.out.println("\nEnter the file you want to search: ");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			String path = folder + "//" + input + ".txt";
			File newFile = new File(path);
			if (newFile.exists()) {
				System.out.println("File Exists");
			} else {
				System.out.println("File doesn't exist!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteFile() {
		try {
			System.out.println("\nEnter the file name you want to delete:");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			String path = folder + "//" + input + ".txt";
			File newFile = new File(path);
			if (newFile.delete()) {
				System.out.println("File deleted successfully");
			} else {
				System.out.println("There was an error deleting the file\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createFile() {
		// FileWriter writer = null;
		try {
			System.out.println("\nEnter the file name you want to create:");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			String path = folder + "//" + input + ".txt";
			File newFile = new File(path);
			if (newFile.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
			FileWriter writer = new FileWriter(newFile);
			System.out.println("Enter the data you want to write in file");
			String data = sc.nextLine();
			writer.write(data);
			writer.close();
			System.out.println("File has been written");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void getAllFiles() {
		File[] listOfFiles = folder.listFiles();
		try {
			if (listOfFiles.length == 0) {
				System.out.println("Folder is empty\n");
			} else {
				for (int i = 0; i < listOfFiles.length; i++) {
					System.out.println(listOfFiles[i].getName());
				}
			}
		} catch (Exception e) {
			System.out.println("Error: file not found");
		}
	}

}
