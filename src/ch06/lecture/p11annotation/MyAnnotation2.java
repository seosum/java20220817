package ch06.lecture.p11annotation;

public @interface MyAnnotation2 {
	String value() default ""; //element(attribute)
	int age() default 0;
}
