package CodeOnline1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Create by mr.wl on 2017/8/7
 *描述自定义注解的注解叫元注解
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
   public String value();
   public String desc() default "this is a description";
}
