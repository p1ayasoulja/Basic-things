
class A<T> {
    T x;

    A(T o) {
        x = o;
    }

}
class B<T> extends A<T>{

    B(T ob){
       super(ob);
    }
}


public class Testi {
    public static void main(String[] args) {
        A<String> ob1=new A<String>("SAY");
        B<Integer> ob2=new B<Integer>(32);
        System.out.println(ob1 instanceof A<?>);
        System.out.println(ob1 instanceof B<?>);
        System.out.println(ob2 instanceof A<?>);
        System.out.println(ob2 instanceof B<?>);
    }
}
