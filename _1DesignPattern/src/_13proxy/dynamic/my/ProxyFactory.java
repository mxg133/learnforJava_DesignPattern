package _13proxy.dynamic.my;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 孟享广
 * @date 2020-08-12 3:21 下午
 * @description
 */
public class ProxyFactory implements iTeacher {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getproxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始·····");
                        Object returnValue = method.invoke(target, args);
                        System.out.println("代理结束");
                        return returnValue;
                    }
                });
    }




    @Override
    public void teach() {

    }
}
