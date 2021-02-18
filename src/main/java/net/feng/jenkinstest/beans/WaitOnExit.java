package net.feng.jenkinstest.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class WaitOnExit
{
    @PreDestroy
    public void onExit() throws InterruptedException
    {
        System.out.println("Start Wait ============= ");
        Thread.sleep(7000);
        System.out.println("End Wait ============= ");
    }
}
