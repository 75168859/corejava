package day02.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理处理器InvocationHandler
public class ProxyFactoryBean implements InvocationHandler {
	private Object target;// 目标对象--->生成这个对象的代理对象
	//private Before before;
	//private After after;
	public void setTarget(Object target) {
		this.target = target;
	}

	// target的代理对象产生后，任何方法的调用都会被invoke方法拦截
	// targetProxy.g(参数）

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("权限、事务、日志...");
		//method.invoke(target, args);// 如果这句话不出现目标方法是不会被调用的。
		System.out.println("事务、日志...");
		return null;
	}

	public Object getProxy() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this);
	}

}
