package impl;

import org.springframework.context.annotation.Scope;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.AnnotationsScanner;
import org.springframework.core.annotation.MergedAnnotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2021/8/31 14:08
 */
public class Test {

	public Integer Test2;

	public static void test1(Class<?> type) throws NoSuchFieldException {
		System.out.println(Ordered.class);
		System.out.println(type);
		if (type.getName().startsWith("java.") || type == Ordered.class) {
			System.out.println("XXXXX");
		}
		;
	}

	public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
//		Test.test1(A.class);
//		System.out.println(AnnotationsScanner.hasPlainJavaAnnotationsOnly(A.class));
//		System.out.println(AnnotationsScanner.isKnownEmpty(A.class, MergedAnnotationsedAnnotations.SearchStrategy.INHERITED_ANNOTATIONS));
		Method[] methods = Scope.class.getDeclaredMethods();

	}
}
