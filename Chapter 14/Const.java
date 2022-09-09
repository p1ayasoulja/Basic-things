public class Const {
    private int x;

    <T extends Number> Const(T y) {
        x = y.intValue();
    }
    void show(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        Const xx=new Const(2f);
        xx.show();

    }
}
