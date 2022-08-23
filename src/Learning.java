public class Learning {
    static void Lear(double y,int ... l){
        System.out.println(l.length);
        for(int x:l){
            System.out.print((x+y) + " ");

        }
        System.out.println();
    }static void Lear(int ... l){
        System.out.println(l.length);
        for(int x:l){
            System.out.print((x) + " ");

        }
        System.out.println();
    }static void Lear(boolean ... l){
        System.out.println(l.length);
        for(boolean x:l){
            System.out.print((x) + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lear(false,true);
        Lear(2.3,2,3);
        Lear(5,4);
    }
}
