import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface onepen{
    int value();
    char ty() default 'f';
}
@Retention(RetentionPolicy.RUNTIME)
@interface Anno1 {
    int val() default 15;

    char x() default 't';
}

@Retention(RetentionPolicy.RUNTIME)
@interface Anno2 {
    String str() default "Wuuzap";
}

@Retention(RetentionPolicy.RUNTIME)
@interface mark {

}

@Anno1(x = 'z')
@Anno2()
@onepen(50)
@mark

public class Annot2 {
    @Anno1(val = 5)
    @Anno2(str = "Hi, World")
    @mark
    @onepen(100)
    public static void Moet() {
        Annot2 a = new Annot2();
        try {
            Annotation annos[] = a.getClass().getAnnotations();
            System.out.println("All annotations for class Annot2!");
            for (Annotation y : annos) {
                System.out.println(y);
            }
            System.out.println();
            Method m = a.getClass().getMethod("Moet");
            annos = m.getAnnotations();
            System.out.println("All annotations for method Moet!");
            for (Annotation ab : annos) {
                System.out.println(ab);
            }
            System.out.println();

            Method h = a.getClass().getMethod("Moet");
            if (h.isAnnotationPresent(mark.class)) {
                System.out.println("Annotation mark!");
            }

        } catch (
                NoSuchMethodException e) {
            System.out.println("Cant find method!");
        }

    }

    public static void main(String[] args) {
        Moet();
    }

}
