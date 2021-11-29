package Lab_8;

import java.io.*;

public class Files {

    public static void main(String[] args) {

        try(FileReader fr = new FileReader("C:/Users/lader/Desktop/q/TestTxt.txt")) {
            int c;
            while((c = fr.read())!=-1){

                System.out.print((char)c);
            }
        }

        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
