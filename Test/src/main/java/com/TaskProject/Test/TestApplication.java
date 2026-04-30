package com.TaskProject.Test;

import com.TaskProject.Test.Test1.MainService;
import com.TaskProject.Test.test2.MainConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TestApplication.class, args);

        MainService service = context.getBean(MainService.class);
        service.runLogic();

        MainConfig mainConfig = context.getBean(MainConfig.class);
        mainConfig.mainProcess();

    }
}
