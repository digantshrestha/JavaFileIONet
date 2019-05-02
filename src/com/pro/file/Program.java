package com.pro.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;

public class Program{
    public static void main(String[] args)throws IOException {
        File file =new File("e:/MyFiles/JavaFileHandeling.txt");
        /*
        Writer writer=new FileWriter(file);
        for(int i=1;i<=10;i++){
            writer.write("hello world message\r\n");
        }
        writer.close();*/
        
        BufferedReader reader=new BufferedReader(new FileReader(file));
        String line="";
        Writer writer=new FileWriter("e:/MyFiles/Copied.txt");
        while((line=reader.readLine())!=null){
            writer.write(line);
            writer.write("\r\n");
        }
        reader.close();
        writer.close();
        file.delete();
        System.out.println("File Moved");
        
    }
}