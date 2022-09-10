interface Multi<T> {
    T mul(T t);
}

public class lyambda {
    public static void main(String[] args) {
        Multi<String> hj = (str) -> {
            String rev = "";
            for (int i = str.length()-1; i > -1; i--) {
                rev += str.charAt(i);
            }
            return rev;
        };
        Multi<Integer> in = (h) -> {
            int fac = 0;
            for (int i = 1; i < h + 1; i++) {
                fac += i;
            }
            return fac;
        };
        System.out.println("Hjkl; > rev > "+hj.mul("Hjkl;"));
        System.out.println("25 fib = "+in.mul(25));
    }
}
