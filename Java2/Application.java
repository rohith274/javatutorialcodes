import java.io.*;
import java.nio.Buffer;

public class Application {
    public static void main(String[] args) {
        File myFile = new File("NoteFile.txt");
        BufferedReader bufferRead = null;
        try {
            FileReader myfilereader = new FileReader("NoteFile.txt"); // read in charecters
            bufferRead = new BufferedReader(myfilereader); // it buffers charecters into lines. Reds line
                                                           // by line instead reading whole file at the
                                                           // same time

            String Line = bufferRead.readLine();
            while (Line != null) {

                System.out.println(Line);
                Line = bufferRead.readLine();
            }
        }

        catch (

        FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("IO Exception" + myFile.getName());
        } finally {
            try {
                bufferRead.close();
            } catch (IOException e) {
                System.out.println("unable to close file" + myFile.getName());
            } catch (NullPointerException ex) {
                System.out.println("File was probably never opened " + ex); // catch for null pointer exception
            }
        }

    }
}
// null pointer exception. If the program crashed. If the file reader tries to
// read not existed file then bufferreader cannot run on null variables or non
// existed file.
// So throws null pointer excpetion
