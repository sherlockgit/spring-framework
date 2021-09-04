package impl;

import org.springframework.stereotype.Component;

import java.lang.reflect.AnnotatedElement;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2021/8/26 17:42
 */
@Component
public class HelloImpl implements Hello{
	@Override
	public void sayHello() {
		System.out.println("OK");
	}

	@Override
	public void menth(AnnotatedElement element) {

	}
}
