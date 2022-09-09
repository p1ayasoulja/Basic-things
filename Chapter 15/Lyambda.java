interface Mynum {
    boolean test(int y);
}
interface hjk{
        int sum(int hh);

}
interface check {
    boolean testi(String e, String m);
}
interface rev{
    String reve(String r);
}

public class Lyambda {
    public static void main(String[] args) {
        Mynum x = (y) -> (y % 2 == 0);
        if (x.test(10)) System.out.println("True");
        if (!x.test(15)) System.out.println("False");
        Mynum w = (y) -> (y * y < 100);
        if (w.test(-5)) System.out.println("Number less -10<n<10");
        check we = (e, m) -> (e.equals(m));
        if (we.testi("Mam", "Mam")) System.out.println("Good");
        hjk gg = (u) ->{
            int factsum=0;
            for(int i=1;i<u+1;i++){
                factsum+=i;
            }
            return factsum;
        };
        System.out.println(gg.sum(10));
        rev yy=(m)->{
            String rever="";
            for(int i=m.length()-1;i>-1;i--){
                rever+=m.charAt(i);
            }
            return rever;
        };
        System.out.println("Hello >rever >"+yy.reve("Hello"));

    }
}
