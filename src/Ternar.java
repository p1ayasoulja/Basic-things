import org.w3c.dom.ls.LSOutput;

public class Ternar {
    public static void main(String[] args)
            throws java.io.IOException {
        int z = 5;
        int k = 2;
        int x = 10;
        System.out.println("Проверка Ивчиков");
        k = x > 0 ? k : -k;
        System.out.println(k);
        int u = 10;
        if (u < 6) {
            if (u < 3) {
                if (u < 2) {
                    System.out.println("u=1");
                } else System.out.println("u=2");
            } else if (u < 4) {
                System.out.println("u=3");
            } else {
                if (u < 5) {
                    System.out.println("u=4");
                } else System.out.println("u=5");

            }
        } else if (u < 9) {
            if (u < 7) {
                System.out.println("u=6");
            } else if (u < 8) {
                System.out.println("u=7");
            } else System.out.println("u=8");
        } else if (u < 10) {
            System.out.println("u=9");
        } else System.out.println("u=10");
        System.out.println("Проверка свитчей стрингами");
        String qw;
        qw = "zima";
        switch (qw) {
            case "zima": {
                System.out.println("O4en Holodno");
                break;
            }
            case "vesna":
            case "osen": {
                System.out.println("Gryazzno!");
                break;
            }
            case "leto": {
                System.out.println("Zharko");
                break;
            }
            default:
        }
        System.out.println("Проверка вложенных свитчей");
        int season = 15;
        int month = 4;

        switch (season) {
            case 1:
                switch (month) {
                    case 1:
                        System.out.println("Feb - Winter");
                        break;
                    case 2:
                        System.out.println("Jan - Winter");
                        break;
                    case 12:
                        System.out.println("Dec - Winter");
                        break;
                }
            case 2:
                switch (month) {
                    case 3:
                        System.out.println("March - Spring");
                        break;
                    case 4:
                        System.out.println("April - Spring");
                        break;
                    case 5:
                        System.out.println("May - Spring");
                        break;
                }
            case 3:
                switch (month) {
                    case 6:
                        System.out.println("June - Summer");
                        break;
                    case 7:
                        System.out.println("July - Summer");
                        break;
                    case 8:
                        System.out.println("Aug - Summer");
                        break;
                }
            case 4:
                switch (month) {
                    case 9:
                        System.out.println("Sep - Autumn");
                        break;
                    case 10:
                        System.out.println("Oct - Autumn");
                        break;
                    case 11:
                        System.out.println("Nov - Autumn");
                        break;
                }
            default:

        }
        System.out.println("Проверка do while");
        int rt = 50;
        int yu = 10;
        do {
            rt -= yu;
            yu--;
            System.out.println("new Rt= " + rt + " umenshenniy na " + yu);
        } while (rt > 0);
        boolean d = true;
        System.out.println("Проверка сложных for");
        for (int a = 10, b = 14; d; a += 2, b += 1) {
            if (a == b) {
                d = false;
                System.out.println(a + b);
            }
        }
        System.out.println("Проверка for each");
        int summ = 0;
        int mass[] = {1, 2, 3, 4, 5};
        for (int ui : mass) {
            System.out.println(ui);
            summ += ui;


        }
        System.out.println(summ);
        for (int ui : mass) {
            System.out.print(ui + ", ");
            if (ui == 3) {
                break;

            }
        }
        System.out.println();
        System.out.println("Проверка 2m massives/continue");
        int gucci[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                gucci[i][j] = i + 2 * j;
            }
        }
        cont:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (i < j) {
                    System.out.println();
                    continue cont;
                }
                System.out.print(gucci[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Проверка break");
        first:
        {
            second:
            {


                int max = 0;
                for (int nums[] : gucci) {
                    for (int numz : nums) {
                        if (max < numz)
                            max = numz;

                    }
                    break first;
//ne idet dalwe
                }
                System.out.println("Max= " + max);
                while (max < 7) {
                    max++;
                }
                System.out.println("Max= " + max);
            }
        }
        
    }

}