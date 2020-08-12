package _13proxy.cglib.my;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 孟享广
 * @date 2020-08-12 4:48 下午
 * @description
 */
public class proxyFactory implements MethodInterceptor {
    private Object target;

    public proxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理开始");

        Object invokeVal = method.invoke(target, args);

        System.out.println("代理结束");
        return invokeVal;
    }
}
