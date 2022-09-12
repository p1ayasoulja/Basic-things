interface Myint<T> {
    boolean check(T v1, T v2);
}

class Rost {
    private int ros;

    Rost(int ros) {
        this.ros = ros;
    }

    boolean check1(Rost g) {
        return g.ros == ros;
    }

    boolean check2(Rost g) {
        return g.ros > ros;
    }

}

public class Links {
    static <T> int checker(T[] vals, Myint<T> f, T v) {
        int checker = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.check(vals[i], v)) {
                checker++;
            }
        }
        return checker;

    }

    public static void main(String[] args) {
        int count;
        Rost[] myrost={new Rost(177),new Rost(175),new Rost(174),new Rost(179),new Rost(152),new Rost(177)};
        count=checker(myrost,Rost::check1,new Rost(177));
        System.out.println("Reb9t = moi rost = " +count);
        count=checker(myrost,Rost::check2,new Rost(177));
        System.out.println("Reb9t < moi rost = "+count);
    }

}
