package com.learn.mq.activemq.helloworld;
 
/**
 * Hello world!
 */
public class HelloWorldMain {
 
    public static void main(String[] args) throws Exception {
        thread(new HelloWorldProducer(), false);
        Thread.sleep(3000);
        thread(new HelloWorldConsumer(), false);
    }
 
    public static void thread(Runnable runnable, boolean daemon) {
        Thread brokerThread = new Thread(runnable);
        brokerThread.setDaemon(daemon);
        brokerThread.start();
    }    
}