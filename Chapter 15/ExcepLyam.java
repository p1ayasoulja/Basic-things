
interface Doublesum{
    double sum(double[] n) throws EmptyArrayException;

}
class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("None in massive");
    }
}
public class ExcepLyam {
    public static void main(String[] args) throws EmptyArrayException{
        double[] gg={1.2,2.3,3.4};
        Doublesum su=n -> {
            double summ=0;
            if(n.length==0){
                throw new EmptyArrayException();
            }
            for(int i=0;i<n.length;i++){
                summ+=n[i];
            }
return summ;
        };
        System.out.println("Summa massiva gg = "+su.sum(gg));
        double[] n={};
        System.out.println("Summa massiva n = "+su.sum(n));
    }
}
