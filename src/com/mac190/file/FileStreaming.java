package com.mac190.file;

import java.io.*;
import java.util.Scanner;

/*
Focus on text files.
In java there is a class File, it does not allow you to read and write to a file like in C++
 This class allows you to manipulate, or work with files, for instance, see if a file exists
 */
public class FileStreaming {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("/Users/sutommy/Documents/JAVA_project/classMar11/src");

        System.out.println("Is this a file: " + myFile.isFile());
        System.out.println("Is this a directory: " + myFile.isDirectory());
        System.out.println("Absolute path: " + myFile.getAbsolutePath());
        System.out.println("Executable: " + myFile.canExecute());
        System.out.println("Readable: " + myFile.canRead());
        System.out.println("Usable space: " + myFile.getUsableSpace());

        myFile = new File("/Users/sutommy/Documents/JAVA_project/classMar11/src/test");
        System.out.println("Directory exists: " + myFile.exists());

        myFile.mkdir();
        System.out.println("Directory is created: " + myFile.isDirectory());
        String fileName = "/Users/sutommy/Documents/JAVA_project/classMar11/src/test/test.txt";
        try (
                FileWriter fw = new FileWriter(fileName);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            bw.write("This is the first line.\n");
            bw.write("This is the second line.\n");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }

        // To use input files, we need to use either a Scanner or a BufferedReader
        // You can use scanner

        try (
                FileReader fr = new FileReader(fileName);
                Scanner sc = new Scanner(fr);
        ) {
            System.out.println("----- direct print " + sc.nextLine());

//            for (String line : sc.nextLine().split("\n")) {
//                System.out.println(line);
//            }

//            System.out.println("End of the for loop.");

            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            System.out.println("End of the file");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}


