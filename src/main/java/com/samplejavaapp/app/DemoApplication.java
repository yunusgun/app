package com.samplejavaapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.pyroscope.javaagent.PyroscopeAgent;
import io.pyroscope.javaagent.config.Config;
import io.pyroscope.javaagent.EventType;
import io.pyroscope.http.Format;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
@PostConstruct
public void init() {

    PyroscopeAgent.start(
    new Config.Builder()
        .setApplicationName("yunus-sample-app-java")
        .setProfilingEvent(EventType.ITIMER)
        .setFormat(Format.JFR)
        .setServerAddress("http://35.224.186.90:30334/?query=pyroscope.server.alloc_objects%7B%7D")
        // Optionally, if authentication is enabled, specify the API key.
        // .setAuthToken(System.getenv("PYROSCOPE_AUTH_TOKEN"))
        // Optionally, if you'd like to sets allocation threshold to register events, in bytes. '0' registers all events
        // .setProfilingAlloc("0")
        .build()
    );
}
