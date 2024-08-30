package com.psd.cicd.play.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloWorldServiceTest {

    private HelloWorldService helloWorldService;

    @BeforeEach
    public void setup() {
        helloWorldService = new HelloWorldService();
    }

    @Test
    void sayHelloWorldTest() {
        Assertions.assertThat(helloWorldService.sayHelloWorld()).isEqualTo("HELLO WORLD");
    }
}
