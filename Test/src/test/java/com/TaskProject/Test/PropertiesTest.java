package com.TaskProject.Test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties={ "app.name=TestApplication",
        "app.version=1.0-test",
"app.details=test"})
public class PropertiesTest {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @Value(("${app.details}"))
    private String appDetails;

    @Test
    void testProperties() {
        assertEquals("TestApplication", appName);
        assertEquals("1.0-test", appVersion);
        assertEquals("test",appDetails);
    }
}
