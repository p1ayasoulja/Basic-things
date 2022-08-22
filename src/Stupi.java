/*public class Stupi {
    int b;

    Stupi(int a) {
        b = a;
    }

    Stupi Double() {
        Stupi w4 = new Stupi(b * b);
        return w4;
    }

    int umn(Stupi o) {
        o.b -= 2;
        return o.b;
    }

    void show() {
        System.out.println(b);
    }

    public static void main(String[] args) {
        Stupi w1 = new Stupi(5);
        Stupi w2;
        Stupi w3;
        w2 = w1.Double();
        w2.show();
        w3=w2.Double();
        w3.show();
        w1.umn(w1);
        System.out.println(w1.umn(w1));
    }
}*/
/*public class Stupi {
    int x;

    int summa(int x) {
        int result;
        if (x == 1) return result = 1;
        else return result = summa(x - 1) + x;

    }
  /*  Stupi(int y){
        x=y+5;
    }
    void show(){
        System.out.println(x);
    }*/
/*
    public static void main(String[] args) {
        Stupi ob = new Stupi();

        System.out.println("Arifmet Summa= " + ob.summa(10));

    }
}*/
/*class Stupi {
    int numb[];

    Stupi(int i) {
        numb = new int[i];
    }

    void show(int i) {
        if (i == 0) return;
        else {
            show(i - 1);
            System.out.println("numb[" + (i-1) + "] = " + numb[i-1]);
        }
    }

    public static void main(String[] args) {
        Stupi ob=new Stupi(5);
        for(int i=0;i<5;i++) ob.numb[i]=i+23;
        ob.show(3);
        System.out.println("Dlina massiva = " +ob.numb.length);
    }
}
*/
/*class Stupi {
    static void showness() {
        System.out.println("Static!");
    }

    class Stupi2 {
        int set1(int c) {
            b = c;
            return b;
        }
    }

    int a;
    private int b;

    void set(int c) {
        Stupi2 W1 = new Stupi2();
        W1.set1(c);
    }

    void get() {
        System.out.println("b=" + b);

    }

    public static void main(String[] args) {
        Stupi rt = new Stupi();
        rt.a = 5;
        //  rt.c=6;
        rt.set(10);
        System.out.println("A=" + rt.a);
        rt.get();
        Stupi.showness();
    }
}*/
class Stupi {
    public static void main(String[] args) {
        String a1 = "Kowka";
        String a2 = "Sobaka";
        String a3 = a1;
        if (a1.equals(a2)) {
            System.out.println("a1 i a2 Equal");
        } else {
            if (a1.equals(a3)) {
                System.out.println("a1 i a3 Equal");
            } else if (a2.equals((a3))) {
                System.out.println("a2 i a3 Equal");
            }
        }
        if (a1.charAt(1) == a2.charAt(1)) System.out.println("2-aya bukva u a1 b a2 - odinakovaya");
        System.out.println(a1.charAt(1));
    }
}