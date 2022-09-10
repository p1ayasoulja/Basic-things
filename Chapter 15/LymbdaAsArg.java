import java.util.Locale;

interface arg {
    String func(String str);
}

public class LymbdaAsArg {
    static String meth(arg gt, String str2) {
        return gt.func(str2);
    }

    public static void main(String[] args) {
        String a1 = "Eto first stroka";
        System.out.println(a1);
        String a2;
        a2 = meth((str) -> str.toLowerCase(), a1);
        System.out.println(a2);
        String a3;
        a3 = meth((str) -> {
            String a = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'e' || str.charAt(i) == 't') {
                    a += str.charAt(i);

                }
            }
            return a;

        }, a2);
        System.out.println(a3);
    }
}
