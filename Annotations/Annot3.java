import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Insiderepeat.class)
@interface Inside {
    String str() default "Pop";
}

@Retention(RetentionPolicy.RUNTIME)
@interface Insiderepeat {
    Inside[] value();
}

public class Annot3 {
    @Inside(str = "First")
    @Inside(str = "Second")
    public static void Repeat(String c) {
        Annot3 ab = new Annot3();
        try {
            Class<?> dm = ab.getClass();
            Method jk = dm.getMethod("Repeat", String.class);
           /* Annotation anno = jk.getAnnotation(Insiderepeat.class);
            System.out.println(anno);*/
            Annotation[] anno = jk.getAnnotationsByType(Inside.class);
            for (Annotation a : anno) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Cant find method!");
        }
    }

    public static void main(String[] args) {
        Repeat("Lol");
    }


}

