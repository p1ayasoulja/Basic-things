import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFilez {
    public static void main(String[] args) {
        int i;
        FileInputStream text = null;
        if (args.length != 1) {
            System.out.println("Using text file");
            return;
        }
        try {
            text = new FileInputStream(args[0]);
            do {
                i = text.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            }
            while (i != -1);




        } catch (IOException e) {
            System.out.println("Erroe "+e);

        } finally {
            try {

                if (text != null) {
                    text.close();
                }
            } catch (IOException e) {
                System.out.println("Cant close file!");
            }
        }
    }
}
