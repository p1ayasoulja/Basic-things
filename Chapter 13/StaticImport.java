import static java.lang.Math.*;

class Sidez {
    double side1, side2;
    double hypo;

    Sidez(double i, double j) {
        side1 = i;
        side2 = j;
    }

    Sidez(double i) {
        this(i, i );
    }

    Sidez() {
        this(1, 1);
    }

    double hypo() {
        hypo = sqrt(pow(side1, 2) + pow(side2, 2));
        return hypo;

    }
}

public class StaticImport {
    public static void main(String[] args) {
        Sidez ob = new Sidez(2.3, 4.5);
        Sidez ob1 = new Sidez(2);
        Sidez ob2 = new Sidez();
        System.out.println(ob.hypo());
        System.out.println(ob1.hypo());
        System.out.println(ob2.hypo());
    }
}

