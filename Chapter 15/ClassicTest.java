interface test{
    int plus(int n);
}
public class ClassicTest {
    public static void main(String[] args) {
        int num=10;
        test te=n->{
            n=num+n;
           //num++;
            return n;
        };
        //num=5;
        System.out.println("Test = "+te.plus(10));

    }
}
