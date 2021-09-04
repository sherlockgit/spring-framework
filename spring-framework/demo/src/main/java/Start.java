import impl.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: linmuyu
 * @Date: 2021/8/26 17:39
 */
public class Start {
	public static void main(String[] args) {
//		B b = new B();
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(C.class);
		applicationContext.refresh();
//		Hello hello = applicationContext.getBean(HelloImpl.class);
//		hello.sayHello();


		test(new HelloImpl2());
	}

	public static void test(Hello hello){
		hello.sayHello();
	}
}
