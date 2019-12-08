package com.xrc.spring.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduleService {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

    @Scheduled(fixedRate = 1000)
    public void timerOne(){
        System.out.println("定时任务fixRate: "+dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0/5 * * * * *")
    public void timerTwo(){
        System.out.println("定时任务cron: "+dateFormat.format(new Date()));
    }

}
