package impl;

import org.springframework.core.Ordered;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2021/8/27 16:37
 */
public class A implements Ordered {

	public A(){
		System.out.println("A");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
