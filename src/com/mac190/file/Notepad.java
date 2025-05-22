package com.mac190.file;

import java.io.*;
import java.util.Scanner;

/*
write a program that accepts a file name in the form
"C:\\ProfOmarMAC190\\Spring2025\\src\\inpoutData.txt"
Check if the file exists, if not display error message and quit.
If the file exist it will be in the form
David 	hoe	23	14.5
Jason 	Mumba 	46 	10.56
Moe 	Abada	35	12.6
There could be many more lines.
Create an output file where the data is reorganized in the following form

F: David 	L: hoe	M: 23	T: 14.5
F: Jason 	L: Mumba 	M: 46 	T: 10.56
F: Moe 	L: Abada	M: 35	T: 12.6
the output file name should be the same as input file name added "_out" at the end of the file.
for instance if the input file name is inputData.txt, the output file name will be
inputData_out.txt

//cut your string at "." using split, take the first part add to it "_out.txt" to create
the output file name.
 */

public class Notepad {
    public static void main(String[] args) throws IOException {

//        try (
//                FileWriter fw = new FileWriter(fl);
//                BufferedWriter bw = new BufferedWriter(fw);
//        ) {
//            bw.write("""
//                    David 	hoe	23	14.5
//                    Jason 	Mumba 	46 	10.56
//                    Moe 	Abada	35	12.6
//                    """);
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input the file name:");
        String fileName = userInput.nextLine();
        String path = "\"/Users/sutommy/Documents/JAVA_project/classMar11/src/test/\"";
        File fl = new File("/Users/sutommy/Documents/JAVA_project/classMar11/src/test/" + fileName);
        String inputData = "/Users/sutommy/Documents/JAVA_project/classMar11/src/test/" + fileName;
        String outPutName = fileName.substring(0, fileName.lastIndexOf('.')) + "_out.txt";
        File outPutFile = new File("/Users/sutommy/Documents/JAVA_project/classMar11/src/test/" + outPutName);
//
//        String preFixFirst = "F: ";
//        String preFixSecond = "S :";
//        String preFixThird = "M :";
//        String preFixFourth = "T: ";

//        String[] preFixes = {preFixFirst, preFixSecond, preFixThird, preFixFourth};

        try (
                FileReader fr = new FileReader(fl);
                Scanner sc = new Scanner(fr);
                FileWriter fw = new FileWriter(outPutFile);
                BufferedWriter bw = new BufferedWriter(fw);

        ) {
            while (sc.hasNext()) {
                String line = sc.nextLine().trim();
                String[] parts = line.split("\\s+");

                if (parts.length != 4) {
                    continue;
                }

                StringBuilder newLine = new StringBuilder();
                String[] prefixes = {"F: ", "L: ", "M: ", "T: "};

                for (int i = 0; i < parts.length; i++) {
                    newLine.append(prefixes[i]).append(parts[i]).append("\t");
                }

                bw.write(newLine.toString().trim());
                bw.newLine();
            }
        }
    }


}
