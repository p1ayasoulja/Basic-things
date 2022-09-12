interface Myinterface<R, T> {
    R func(T v);
}
interface Array<T>{
    T func(int v);
}

class A<T> {
    private T val1;

    A(T val1) {
        this.val1 = val1;
    }

    A() {
        val1 = null;
    }
    T getVal1(){
        return val1;
    }
}
class B{
    String val2;

    public B(String val2) {
        this.val2 = val2;
    }

    public String getVal2() {
        return val2;
    }
}

public class ConLinks<R,T> {
    static <R,T> R MYcheck(Myinterface<R,T> f,T v){
        return f.func(v);
    }
    static <T> T MYcheck(Array<T> f,int v){
        return f.func(v);
    }

    public static void main(String[] args) {
        Myinterface <A<Double>,Double> lego= A<Double>::new;
        A<Double> aa= MYcheck(lego,23.3);
        System.out.println("aa = "+aa.getVal1());
        Myinterface <B,String> lego2 = B::new;
        B bb=MYcheck(lego2,"Hello");
        System.out.println("bb = "+bb.getVal2());
        Array<A[]> aa2=A[]::new;
        A[] aa3=aa2.func(3);
        aa3[0]=new A(2);
        aa3[1]=new A(3);
        aa3[2]=new A(4);

    }
}
