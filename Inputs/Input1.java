import java.io.*;

public class Input1 {
    public static void main(String[] args) throws IOException {
        char c;
        char x = 'x';
        System.out.write(x);
        System.out.write('\n');
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("This is start!");
        byte g = 127;
        pw.println(g);
        String str2 = "Hi, World";
        pw.println(str2);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("q for exit, lets go!");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
        System.out.println("now test 2");
        String str[] = new String[100];
        System.out.println("ENTER stop FOR STOP XD");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) {
                break;
            }
        }
        System.out.println("Ur text below");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) {
                break;
            }
            System.out.println(str[i] + " : page " + (i));

        }

    }
}
