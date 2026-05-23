package com.TaskProject.Test;

import com.TaskProject.Test.dirtyContext.CounterService;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.Properties;

@SpringBootTest(properties={ "app.name=TestApplication",
        "app.version=1.0-test"})
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class TestApplicationTests {

    @Autowired
    CounterService counterService;

    @Test
	void contextLoads() {
	}

    @Test
    void test1(){
        counterService.increment();
        Assertions.assertEquals(1,counterService.getCount());
    }

    @Test
    void test2(){
        Assertions.assertEquals(0,counterService.getCount());
    }

    @Test
    void test3(){
        counterService.increment();
        Assertions.assertEquals(1,counterService.getCount());
    }
}
