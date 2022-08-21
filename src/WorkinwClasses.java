/*class Numb {
    int odno;
    int dvu;
    int treh;

    Numb(int i, int j, int k) {
        System.out.println("Konstructed!");
        this.odno = i;
        this.dvu = j;
        this.treh = k;
    }


    int umnozh() {

        return odno * dvu * treh;
    }

    void entr(int i, int j, int k) {
        odno = i;
        dvu = j;
        treh = k;
    }

    void entr(int i, int j) {
        odno = i;
        dvu = j;
    }

}
*/

/*class Stack {
    int stck[] = new int[15];
    int pos;

    Stack() {
        pos = -1;

    }

    void entr(int numb) {
        if (pos == 15) {
            System.out.println("Stack rdy");
        } else stck[++pos] = numb;

    }

    int exit() {
        if (pos < 0) {
            System.out.println("Nothing");
            return 0;
        } else return stck[pos--];
    }
}
*/
/*class Pereg {
    double a;
    double b;

    Pereg(int i, int j) {
        a = i;
        b = j;
        System.out.println("Dannie vvedeni!");
    }

   void umn(int i, double j) {
        i *= 2;
        j /= 2;
        System.out.println("i= " + i + " j= " + j);

    }


    double summ(int i, int j, int k) {
        a = i;
        b = j;
        return (a + b) * k;
    }

    double summ(double i, double j) {
        a = i;
        b = j;
        return (a + b);

    }

    void summ(double a) {
        System.out.println("Vvedite 2 zna4enie!");

    }

    boolean equal(Pereg o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }

    Pereg(Pereg o) {
        a = o.a;
        b = o.b;
        System.out.println(a + " " + b);
    }
}

public class WorkinwClasses {
    public static void main(String[] args) {
    /*    Numb Mynumb = new Numb(3,13,100);
        //Mynumb.entr(2, 22, 100);

        System.out.println("* = " + Mynumb.umnozh());
    }*/
     /*   Stack myst = new Stack();
        for (int i = 0; i < 15; i++) {
            myst.entr(i * i);
        }
        System.out.println("Contains");
        for (int i = 0; i < 15; i++) {
            System.out.print(myst.exit() + " ");
        }
    }*/
     /*   System.out.println("Start");
        Pereg w1 = new Pereg(14, 2);
        Pereg w2 = new Pereg(15, 2);
        /*System.out.println("Int (a+b)*k= " + w1.summ(23, 10, 2));
        w1.summ(3.2);
        System.out.println("Int a+b= " + w1.summ(23.1, 23.1));
        System.out.println();
        System.out.println(w1.equal(w2));
        Pereg w3 = new Pereg(w1);

    }
}*/
class Memory {
    int a;
    int b;

    void umn(int i, int j) {
        i *= 2;
        j += j;
        System.out.println("I= " + i + " J= " + j);
    }

    /*
        Memory(int i, int j) {
            a = i;
            b = j;
        }

        void umn(Memory o) {
            o.a = a * 2;
            o.b = b * b;
            System.out.println("A=" + o.a + " B= " + o.b);
        }

    */
    public static void main(String[] args) {
        Memory me = new Memory();
        int a = 25;
        int b = 25;
        me.umn(a, b);
        System.out.println("A=" + a + " b= " + b);

    }
}