package lesson09_interface;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface UserAnno {
	String[] value() default ""; // annotation 에서만 가능한 문자열배열 디폴트
//	String value() default "";
	int number() default 5;
	
	
	
	
}
