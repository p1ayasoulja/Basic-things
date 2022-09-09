public class Methood {
    static <T extends Comparable<T>, V extends T> boolean is(T ob, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (ob.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer mass[]= {1,2,3};
        int y=3;
        if(is(y,mass)) System.out.println("mass contains y = "+y);
        else System.out.println("cant find y in mass!");
String mass2[]={ "odin","dva"};
String msq="odin";
        if(is(msq,mass2)) System.out.println("mass2 contains y = "+msq);
        else System.out.println("cant find y in mass!");
    }


}