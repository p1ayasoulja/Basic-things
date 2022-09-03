import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Myanno {
    String str();

    int anno();
}


class Annotation {
    @Myanno(str = "Hello!", anno = 100)
    public static void Mymeth(String str,double y) {
        Annotation ob = new Annotation();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("Mymeth", String.class, double.class);
            Myanno anno = m.getAnnotation(Myanno.class);
            System.out.println(anno.str() + " " + anno.anno());
        } catch (NoSuchMethodException e) {
            System.out.println("Cant find method");
        }
    }

        public static void main(String[] args) {
            Mymeth("Moscow",25.5);
        }
    }


