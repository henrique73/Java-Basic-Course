import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Exceptions {

    public static void main (String args []){
        File file = new File("text.txt");
        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("Try Block");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }

        System.out.println("After Try/Catch");

    }

}
