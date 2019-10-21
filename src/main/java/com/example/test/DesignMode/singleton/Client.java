package com.example.test.DesignMode.singleton;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.concurrent.CountDownLatch;

public class Client {

    public static void main(String[] args) {
        SingletonDemo01 s1 = SingletonDemo01.getInstance();
        SingletonDemo01 s2 = SingletonDemo01.getInstance();
        System.out.println(s1+"-----"+s2);

        System.out.println(SingletonDemo05.INSTANCE==SingletonDemo05.INSTANCE);
    }
}





 class Client2 {

    public static void main(String[] args) throws Exception {
        SingletonDemo06 s1 = SingletonDemo06.getInstance();
        SingletonDemo06 s2 = SingletonDemo06.getInstance();
        System.out.println(s1+"-----"+s2);


//		通过反射的方式调用私有构造器
//		Class<SingletonDemo06> clazz = (Class<SingletonDemo06>) Class.forName("com.bjsxt.singleton.SingletonDemo06");
//		Constructor<SingletonDemo06> c = clazz.getDeclaredConstructor(null);
//		c.setAccessible(true);
//		SingletonDemo06 s3 = c.newInstance();
//		SingletonDemo06 s4 = c.newInstance();
//
//		System.out.println(s3+"----"+s4);

        //通过反序列化的方式构造多个对象
        FileOutputStream fos = new FileOutputStream("d:/a.txt");
        ObjectOutputStream oss = new ObjectOutputStream(fos);
        oss.writeObject(s1);
        oss.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
        SingletonDemo06 s3 =(SingletonDemo06) ois.readObject();

        System.out.println(s3);

    }
}






/**
 * 测试多线程环境下五种创建单例模式的效率
 * @author Administrator
 *
 */

 class Client3 {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for(int i = 0; i < threadNum; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {

                    for(int i = 0; i < 10000000; i ++){
                        Object o = SingletonDemo07.getInstance();
			//			Object o = SingletonDemo05.INSTANCE;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }

        countDownLatch.await();//main线程阻塞，直到计数器为0，才继续往下执行。

        long end = System.currentTimeMillis();

        System.out.println(end-start);

    }
}
