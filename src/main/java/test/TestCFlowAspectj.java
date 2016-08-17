package test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestCFlowAspectj {
	@Pointcut("execution(* foo(..))")
	public void fooPoint() {
	}

	@Pointcut("execution(* bar(..))")
	public void barPoint() {
	}
	
	@Pointcut("!cflow(barPoint())")
	public void barCFlow() {
	}
	
	@Pointcut("barCFlow() && fooPoint()")
	public void fooInBar() {
	}

	@Before("fooInBar()")
	public void test(JoinPoint point) {
		System.out.println(point.getSourceLocation());
	}
}
