class A <T>{
    T x;
    A(T ob){
        x=ob;
    }
    T getobb(){
        System.out.println("Method getobb A");
        return x;
    }
}
class B<T> extends A<T>{
    B(T ob){
        super(ob);
    }
    T getobb(){
        System.out.println("mEThod getobb B");
        return x;
    }

}
public class Pereopredelenie {
    public static void main(String[] args) {
        A<String> ob=new A<>("OBJECT");
        B<String> ob2=new B<>("OBJECT2");
        System.out.println(ob.getobb());
        System.out.println(ob2.getobb());
    }
}
