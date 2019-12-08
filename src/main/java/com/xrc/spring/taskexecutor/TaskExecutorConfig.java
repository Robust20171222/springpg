package com.xrc.spring.taskexecutor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;



@Configuration
@ComponentScan("com.xrc.spring.taskexecutor")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(0);// 核心线程数
        taskExecutor.setMaxPoolSize(10);//最大线程数
        taskExecutor.setQueueCapacity(25);//等待队列容量
        taskExecutor.setKeepAliveSeconds(1);//线程存活时间
        taskExecutor.initialize();

        return taskExecutor;

    }
}
