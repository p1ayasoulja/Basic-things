interface Myinter<T> {
    int func(T[] mass, T v);
}

class Check {
    static <T> int checker(T[] massi, T v) {
        int sovpadenie = 0;
        for (int i = 0; i < massi.length; i++) {
            if (massi[i] == v) {
                sovpadenie++;
            }
        }return sovpadenie;
    }
}
public class Obobwenie {
    static <T> int MyCheck(Myinter<T> g,T[] mas,T v){
        return g.func(mas,v);
    }

    public static void main(String[] args) {
        Integer[] massi={1,2,3,2,3,3};
        String[] massi2 ={"Odin","Dva","Tri","Dva","Tri","Tri"};
        int count = MyCheck(Check::<Integer>checker,massi,2);
        System.out.println("2 vstre4aetsya = "+count+" raz(a)");
        count = MyCheck(Check::<String>checker,massi2,"Tri");
        System.out.println("<Tri> vstre4aetsya = "+count+" raz(a)");
    }
}
