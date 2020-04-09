package com.xuecheng.test.rabbitmq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Consumer01 {
    private static final String QUEUE = "helloworld";

    public static void main(String[] args) throws IOException, TimeoutException {
        // 通过连接工厂和mq简历连接
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("127.0.0.1");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        // 设置虚拟机, 一个mq可以设置多个虚拟机，每个虚拟机相当于一个独立的mq
        connectionFactory.setVirtualHost("/");
        Connection connection = null;

        connection = connectionFactory.newConnection();
        // 创建会话通道 生产者和服务所有的通信都在channel中完成
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE, true, false, false, null);

        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            // 当接收到消息后此方法调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String exchange = envelope.getExchange();
                // 消息id，mq在channer中标识消息的id，可用于确认消息已接受
                long deliveryTag = envelope.getDeliveryTag();
                String s = new String(body, "utf-8");
                System.out.println(s);
            }
        };
        //监听队列
        //参数：String queue, boolean autoAck, Consumer callback
        /**
         * 参数明细：
         * 1、queue 队列名称
         * 2、autoAck 自动回复，当消费者接收到消息后要告诉mq消息已接收，如果将此参数设置为tru表示会自动回复mq，如果设置为false要通过编程实现回复
         * 3、callback，消费方法，当消费者接收到消息要执行的方法
         */
        channel.basicConsume(QUEUE, true, defaultConsumer);
    }
}
