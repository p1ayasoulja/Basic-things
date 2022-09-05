import java.io.*;

public class NewTry {
    public static void main(String[] args) {
        int i;
        if (args.length != 1) {
            System.out.println("Using NewTry : name of file");
            return;
        }
        try (FileInputStream file = new FileInputStream(args[0]);
             FileOutputStream file2 = new FileOutputStream(args[1])) {
            do {
                i = file.read();
                if (i != -1) {
                    file2.write(i);
                }
            } while (i != -1);

        } catch (FileNotFoundException e) {
            System.out.println("Cant open file! " + e);

        } catch (IOException e1) {
            System.out.println("Cant open file! " + e1);
        }
    }
}
