public class Moves {
    public static void main(String[] args) {
        int x;
        x = 5;
        int mass[];
        int summ = 0;
        mass = new int[4];
        for (int i = 0; i < 4; i++) {
            mass[i] = x + 2;
            x = x * 2;
            summ = summ + mass[i];
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("summa = " + summ);
        for (int i = 0; i < 4; i++) {
            if (mass[i] < 30) {
                System.out.println("Element massiva [" + i + "]=" + mass[i] + "<30");
            }
        }
        int mass2[];
        mass2 = new int[4];
        x = 5;
        int summ2 = 0;
        for (int j = 0; j < 4; j++) {
            mass2[j] = x + 10;
            x = x + 5;
            summ2 += mass2[j];
        }
        for (int j = 0; j < 4; j++) {
            System.out.print(mass2[j] + " ");
        }
        System.out.println("summa = " + summ2);
        System.out.println();
        if (summ < summ2) {
            System.out.println("massiv 1 < massiv 2!");
        }
        int s1=summ+summ2;
        System.out.println("summa 2-uh massivov = "+s1);
    }
}
