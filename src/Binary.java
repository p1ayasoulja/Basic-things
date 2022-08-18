public class Binary {
    public static void main(String[] args) {
        String binary[] = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111",};
        int a = 3;//0011
        int b = 5;//0101
        int c = 7;//0111
        int g = -8;//1000
        int n, d, j, h;
        n = a | b; //=7 0111
        d = b ^ c;//=2 0010
        j = c & a;//=3 0011
        h = ~g;// 0111 =7
        System.out.println(n + " " + binary[n]);
        System.out.println(d + " " + binary[d]);
        System.out.println(j + " " + binary[j]);
        System.out.println(h + " " + binary[h]);
        int v;
        int y;
        v = n << 1; //=14 1110
        y = h >> 2;// 0001
        System.out.println(v + " " + binary[v]);
        System.out.println(y + " " + binary[y]);
        int u = 45;//...101101>>>...001011
        int t;
        t = u >>> 2;
        System.out.println(t);
        int rt = 1;
        if (rt == 1) {
            System.out.println("True");
        }
        ;
        if (rt == 0) {
            System.out.println("False");
        }
        boolean a1 = true;
        boolean a2 = false;
        boolean b2 = !(a1 ^ (a2 | a1)) & !a2 & a2;
        boolean b1 = !a1 | a2;
        System.out.println("!a1|a2 = " + b1);
        boolean b3 = a2^a2&a1|!a1;
        System.out.println("a2^a2&a1|!a1 = " + b3);
        System.out.println("!(a1^(a2|a1))&!a2&a2 = " + b2);
    }
}