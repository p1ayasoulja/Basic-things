class kor {
    int x, y, z;

    kor(int q, int w, int e) {
        x = q;
        y = w;
        z = e;

    }

    kor(kor ob) {
        x = ob.x;
        y = ob.y;
        z = ob.z;
    }

    kor() {
        x = y = z = -1;
    }

    int V() {

        return x * y * z;
    }
}

class Ves extends kor {

    int vves;

    Ves(int u, int c, int n, int m) {
        x = u;
        y = c;
        z = n;
        vves = m;

    }

    Ves() {
        System.out.println("Enter vves");
    }

    int Plot() {

        return (x * y * z) / vves;
    }

    public static void main(String[] args) {

    }
}

public class Boxx {
    public static void main(String[] args) {
        Ves bo = new Ves(1, 2, 3, 4);
        int vol;
        vol = bo.V();
        int plotnost = bo.Plot();
        System.out.println("Plot= " + plotnost);
        System.out.println("V= " + vol);
    }
}

