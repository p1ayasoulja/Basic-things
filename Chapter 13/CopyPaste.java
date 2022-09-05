import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPaste {
    public static void main(String[] args) {
        int i;
        FileInputStream text1 = null;
        FileOutputStream text2 = null;
        if (args.length != 2) {
            System.out.println("Working with 2 files,Lets copypaste");
            return;
        }

        try {
            text1 = new FileInputStream(args[0]);
            text2 = new FileOutputStream(args[1]);
            do {
                i = text1.read();
                if (i != -1) text2.write(i);
            }
            while (i != -1);


        } catch (IOException e) {
            System.out.println("Some troubles!" + e);
        } finally {
            try {
                if (text1 != null) text1.close();
            } catch (IOException e1) {
                System.out.println("Cant close text1!" + e1);
            }
            try {
                if (text2 != null) text2.close();
            } catch (IOException e2) {
                System.out.println("Cant close text2!" + e2);
            }
        }


    }
}
