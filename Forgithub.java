import java.sql.SQLOutput;

public class Forgithub {
    public static void main(String[] args) {
        int x = 129;
        double y = 27.25;
        byte c = 5;
        int z = (int) (y + c + x);
        System.out.println("int summa = " + z);
        double t = (double) (y + c + x);
        System.out.println("double summa = " + t);
        byte m = (byte) (y + c + x);
        System.out.println("byte summa = " + m);
        if (z < t) {
            System.out.println("u good");
        }
        double summ=0;
        double mass[] = {z, t, m};
        for (int i = 0; i < 3; i++) {
            summ += mass[i];

        }
        System.out.println("summa = "+summ);
    }
}


