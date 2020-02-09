package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyDocumentation {
    // Na koniec mam dla Ciebie zadanie. Napisz adnotację @MyDocumentation, która będzie miała elementy author oraz comment.
    // Informacja o tej adnotacji powinna być dostępna w trakcie uruchomienia programu.

    String author() default "Wojek";

    String comment() default "no comment";

}
