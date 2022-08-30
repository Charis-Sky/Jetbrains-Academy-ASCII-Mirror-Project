package Jetbrains-Academy-ASCII-Mirror-Project.Stage-4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input the file path:");
        String path = scanner.nextLine();

        try{
            File animal = new File(path);
            Scanner fileScanner = new Scanner(animal);
            ArrayList<String> Lines = new ArrayList<>();

            while (fileScanner.hasNext()) {
                Lines.add(fileScanner.nextLine());
            }

            int max = 0;

            for(String s : Lines) {
                if(s.length() > max) {
                    max = s.length();
                }
            }

            for(int i = 0; i < Lines.size(); i++) {
                if(isLess(Lines.get(i), max)) {
                    while(isLess(Lines.get(i), max)) {
                        Lines.set(i, Lines.get(i) + " ");
                    }
                }
            }

        printMirror(Lines);
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }

    private static void printMirror(ArrayList<String> a) {
        for(String s : a) {
            System.out.println(s + " | " + s);
        }
    }

    private static boolean isLess(String s, int max) {
        return s.length() < max;
    }
}