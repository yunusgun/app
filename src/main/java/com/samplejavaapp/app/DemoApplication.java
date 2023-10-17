package com.samplejavaapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;
import io.pyroscope.javaagent.PyroscopeAgent;
import io.pyroscope.javaagent.config.Config;
import io.pyroscope.javaagent.EventType;
import io.pyroscope.http.Format;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        PyroscopeAgent.start(
            new Config.Builder()
                .setApplicationName("yunus-sample-app-java")
                .setProfilingEvent(EventType.ITIMER)
                .setFormat(Format.JFR)
                .setServerAddress("http://pyroscope.bkmdevops.com")
                .build()
        );

        SpringApplication.run(DemoApplication.class, args);
    }

}
