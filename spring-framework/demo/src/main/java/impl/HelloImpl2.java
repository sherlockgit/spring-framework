package impl;

import java.lang.reflect.AnnotatedElement;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2021/8/27 10:16
 */
public class HelloImpl2 implements Hello{
	@Override
	public void sayHello() {
		System.out.println("ok");
	}

	@Override
	public void menth(AnnotatedElement element) {

	}
}
