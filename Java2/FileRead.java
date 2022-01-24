import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class FileRead {
    public static void main(String[] args) // throws FileNotFoundException //(alternative for try catch)
    {
        // for (int i = 0; i <= 3; i++) {
        // System.out.println("Enter text : ");
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(str);
        // }
        // try {
        // File file = new File("NoteFile.txt");
        // Scanner sc = new Scanner(file);
        // while (sc.hasNextLine()) {
        // String Line = sc.nextLine();
        // System.out.println(Line);
        // }
        // sc.close();
        // } catch (FileNotFoundException e) {
        // System.out.println("Error ! Your file is missing");
        // }
        try {
            Class2 obj1 = new Class2();
            obj1.add2int(10, 9);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}