package Jetbrains-Academy-ASCII-Mirror-Project.Stage-3;
import java.io.*;
import java.util.*;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the file path:");
        String path = scanner.nextLine();

        try{
            File animal = new File(path);
            Scanner fileScanner = new Scanner(animal);
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found!");
        }

    }
}