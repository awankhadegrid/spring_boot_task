package com.TaskProject.Test;

import com.TaskProject.Test.Test1.MainService;
import com.TaskProject.Test.dirtyContext.CounterService;
import com.TaskProject.Test.envTask.ReadEnvInArray;
import com.TaskProject.Test.test2.MainConfig;
import lombok.experimental.FieldNameConstants;
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
        ReadEnvInArray readEnvInArray  = context.getBean(ReadEnvInArray.class);
        readEnvInArray.print();

        CounterService counterService = context.getBean(CounterService.class);


    }
}
