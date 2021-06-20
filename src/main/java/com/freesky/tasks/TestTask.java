package com.freesky.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class TestTask {

    private static final SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss a");

    // @Scheduled(fixedRate = 3000)
    // @Scheduled(cron = "5-50 * * * * ?")
    public void reportCurrentTime() {
        System.out.println("现在时间：" + df.format(new Date()));
    }

}
