class Gen<T, V> {
    T object;
    V object2;

    Gen(T o, V a) {
        object = o;
        object2 = a;
    }

    T getObject() {
        return object;
    }

    V getObject2() {
        return object2;
    }

    void show() {
        System.out.println("Object = " + object.getClass().getName());
        System.out.println("Object2 = " + object2.getClass().getName());

    }

}

class Mass<T extends Number> {
    T numz[];

    Mass(T[] o) {
        numz = o;
    }

    T max() {
        T max = numz[0];
        for (int i = 0; i < numz.length; i++) {
            if (max.doubleValue() < numz[i].doubleValue()) {
                max = numz[i];
            }
        }
        return max;

    }

    boolean same(Mass<?> ob) {
        if (max() == ob.max()) {
            return true;
        }
        return false;
    }
}

public class Obob {
    public static void main(String[] args) {
       /* Gen<String, Integer> ab = new Gen<String, Integer>("Soos", 2);
        ab.show();
        int x = ab.getObject2();
        String sh = ab.getObject();
        System.out.println("ab = " + sh);
        System.out.println("cd = " + x);*/
        Integer mas[] = new Integer[5];
        for (int i = 0; i < 5; i++) {
            mas[i] = i + i;
        }
        Integer mas2[] = {1, 2, 3, 4, 8};
        Mass<Integer> ma1 = new Mass<Integer>(mas);
        Mass<Integer> ma2 = new Mass<Integer>(mas2);
        if(ma1.same(ma2)){
        System.out.println("max value same and = " + ma1.max());}
        else System.out.println("Max value diff, ma1 max = "+ma1.max()+", ma2 max = "+ma2.max());

    }
}
