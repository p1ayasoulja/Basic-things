public class Doublm {
    public static void main(String[] args) {
        int i, j, k = 48;
        int x = 10;
        int two[][] = new int[3][4];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                two[i][j] = x;
                x--;
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(two[i][j] + " ");
            }
            System.out.println();
        }
        int thr[][] = new int[3][];
        thr[0] = new int[1];
        thr[1] = new int[2];
        thr[2] = new int[3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < i + 1; j++) {
                thr[i][j] = 100%k;
                k/=2;

            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(thr[i][j] + " ");
            }
            System.out.println();
        }
        String slovo[];
        slovo = new String[4];
        for (i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                slovo[i] = "M";
            } else slovo[i] = "A";
        }
        for (i = 0; i < 4; i++) {
            System.out.print(slovo[i]);
        }


    }
}
