package excelr_assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

//3)Design a Java program to cover all File related topics, demonstrating various File operations in Java. The program should allow users to perform the following tasks:
//
//Create a new directory.
//Create a new text file and write content to it.
//Read the content from an existing text file.
//Append new content to an existing text file.
//Copy the content from one text file to another.
//Delete a text file.
//List all files and directories in a given directory.
//Search for a specific file in a directory and its subdirectories.
//Rename a file.
//Get information about a file (e.g., file size, last modified time).
//Requirements:
//Use File Input and Output streams for reading and writing text files.
//Implement exception handling to handle possible errors during file operations.
//Provide a user-friendly console interface for the user to interact with the program.



public class Java_Assg3 {
	
public static void main(String[] args) {
    	
    	System.out.println("Java A3 \n");
    	
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nFile Operations Menu:");
            System.out.println("1. Create a new directory");
            System.out.println("2. Create a new text file and write content to it");
            System.out.println("3. Read the content from an existing text file");
            System.out.println("4. Append new content to an existing text file");
            System.out.println("5. Copy the content from one text file to another");
            System.out.println("6. Delete a text file");
            System.out.println("7. List all files and directories in a given directory");
            System.out.println("8. Search for a specific file in a directory and its subdirectories");
            System.out.println("9. Rename a file");
            System.out.println("10. Get information about a file");
            System.out.println("0. Exit\n");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1 -> createDirectory(scanner);
                case 2 -> createAndWriteToFile(scanner);
                case 3 -> readFromFile(scanner);
                case 4 -> appendToFile(scanner);
                case 5 -> copyFile(scanner);
                case 6 -> deleteFile(scanner);
                case 7 -> listFilesAndDirectories(scanner);
                case 8 -> searchFile(scanner);
                case 9 -> renameFile(scanner);
                case 10 -> getFileInfo(scanner);
                case 0 -> System.out.println("Exiting program. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }

    private static void createDirectory(Scanner scanner) {
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);
        if (directory.exists()) {
            System.out.println("Directory already exists.");
        } else {
            boolean created = directory.mkdir();
            if (created) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Failed to create directory.");
            }
        }
    }

    private static void createAndWriteToFile(Scanner scanner) {
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        System.out.print("Enter the content to write: ");
        String content = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }
    }

    private static void readFromFile(Scanner scanner) {
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from file: " + e.getMessage());
        }
    }

    private static void appendToFile(Scanner scanner) {
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        System.out.print("Enter the content to append: ");
        String content = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(content);
            System.out.println("Content appended to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to file: " + e.getMessage());
        }
    }

    private static void copyFile(Scanner scanner) {
        System.out.print("Enter the source file path: ");
        String sourceFilePath = scanner.nextLine();

        System.out.print("Enter the destination file path: ");
        String destinationFilePath = scanner.nextLine();

        try {
            Path sourcePath = Paths.get(sourceFilePath);
            Path destinationPath = Paths.get(destinationFilePath);
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }

    private static void deleteFile(Scanner scanner) {
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);
        if (file.exists()) {
            boolean deleted = file.delete();
            if (deleted) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }

    private static void listFilesAndDirectories(Scanner scanner) {
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }

    private static void searchFile(Scanner scanner) {
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            searchFileRecursive(directory, fileName);
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }

    private static void searchFileRecursive(File directory, String fileName) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    searchFileRecursive(file, fileName);
                } else if (file.getName().equals(fileName)) {
                    System.out.println("File found: " + file.getAbsolutePath());
                }
            }
        }
    }

    private static void renameFile(Scanner scanner) {
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        System.out.print("Enter the new file name: ");
        String newFileName = scanner.nextLine();

        File file = new File(filePath);
        if (file.exists()) {
            String parentPath = file.getParent();
            File newFile = new File(parentPath + File.separator + newFileName);
            boolean renamed = file.renameTo(newFile);
            if (renamed) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Failed to rename file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }

    private static void getFileInfo(Scanner scanner) {
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("Last modified time: " + file.lastModified());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
