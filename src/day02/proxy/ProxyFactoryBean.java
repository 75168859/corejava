package day02.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//��������InvocationHandler
public class ProxyFactoryBean implements InvocationHandler {
	private Object target;// Ŀ�����--->�����������Ĵ������
	//private Before before;
	//private After after;
	public void setTarget(Object target) {
		this.target = target;
	}

	// target�Ĵ������������κη����ĵ��ö��ᱻinvoke��������
	// targetProxy.g(������

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Ȩ�ޡ�������־...");
		//method.invoke(target, args);// �����仰������Ŀ�귽���ǲ��ᱻ���õġ�
		System.out.println("������־...");
		return null;
	}

	public Object getProxy() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this);
	}

}
