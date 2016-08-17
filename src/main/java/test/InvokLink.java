package test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class InvokLink {

	@Pointcut("execution(* com.test.HelloWorld.*(..))")
	public void logpoint() {
	};

	@Before("logpoint()")
	public void test(JoinPoint point) {
		System.out.println(point.getSourceLocation());
	}
}
