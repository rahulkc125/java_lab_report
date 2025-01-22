//package com.javatpoint;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[]args) {
        try{
            FileWriter fw = new FileWriter("D:\\testout.txt");
            fw.write("Welcome to javatpoint");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Success");
    }
}
