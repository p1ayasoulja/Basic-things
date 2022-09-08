class Two {
    int x;
    int y;

    public Two(int a, int b) {
        this.x = a;
        this.y = b;
    }
}

class Three extends Two {
    int z;

    Three(int a, int b, int c) {
        super(a, b);
        this.z = c;
    }

}

class Four extends Three {
    int t;

    Four(int a, int b, int c, int d) {
        super(a, b, c);
        this.z = d;
    }
}

class Soup<T extends Two> {
    T[] cords;

    Soup(T[] o) {
        cords = o;
    }

}

class ShowMagic {
    static void showXY(Soup<? super Three> c) {
        for (int i = 0; i < c.cords.length; i++) {
            System.out.println("[X] [Y] = [" + c.cords[i].x + "] [" + c.cords[i].y + "]");

        }
        System.out.println();

    }

    static void showXYZ(Soup<? extends Three> c) {
        for (int i = 0; i < c.cords.length; i++) {
            System.out.println("[X] [Y] [Z] = [" + c.cords[i].x + "] [" + c.cords[i].y + "] [" + c.cords[i].z+"]");
        }
        System.out.println();
    }

    static void showALL(Soup<? extends Four> c) {
        for (int i = 0; i < c.cords.length; i++) {
            System.out.println("[X] [Y] [Z] [T]" +
                    " = [" + c.cords[i].x + "] [" + c.cords[i].y + "] [" + c.cords[i].z + "] [" + c.cords[i].t+"]");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Two Dva[] = {
                new Two(0, 1),
                new Two(1, 2),
        };
        Three Tri[] = {
                new Three(0, 1, 2),
                new Three(1, 2, 3),
        };
        Four Chet[] = {
                new Four(0, 1, 2, 3),
                new Four(1, 2, 3, 4),
        };
        Soup<Two> dvaa = new Soup<Two>(Dva);
        Soup<Three> threee = new Soup<Three>(Tri);
        Soup<Four> fourr = new Soup<Four>(Chet);
        showXY(dvaa);
        showXYZ(threee);
        showALL(fourr);
    }
}
