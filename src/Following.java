import org.w3c.dom.ls.LSOutput;

class A {
    int j;

      /*  A(int x) {
            j = x;
        }*/

    void show() {
        System.out.println("J= " + j);
    }
}

class B extends A {
    int k;

    void show() {
        System.out.println("K= " + k);
    }

    void summ() {
        System.out.println("j+k=" + (j + k));
    }

}

public class Following {


    public static void main(String[] args) {
        A ber;
        ber = new A();
        B reb= new B();
        ber.j=2;
        reb.k=5;
        reb.summ();
        reb.j=100;
        reb.summ();
    }
}
