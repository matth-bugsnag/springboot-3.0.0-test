package com.example.demo;

import com.bugsnag.Bugsnag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.bugsnag.BugsnagSpringConfiguration;

@Configuration
// @Import(BugsnagSpringConfiguration.class) // <<< THIS line, when included casuses {'command '/opt/homebrew/Cellar/openjdk@17/17.0.5/libexec/openjdk.jdk/Contents/Home/bin/java'' finished with non-zero exit value 1}
// When not included, the project runs fine, and is able to sent events to Bugsnag. 
public class Config {
    @Bean
    public Bugsnag bugsnag() {
        return new Bugsnag("5f058259a8c0dc684ee3cbb8648c5cb8");
    }

    @Bean
    public String exampleWebsiteLinks() {
        return "<a href=\"/send-handled-exception\">Send a handled exception to Bugsnag</a><br/>"
                + "<a href=\"/send-handled-exception-info\">Send a handled exception to Bugsnag with INFO severity</a><br/>"
                + "<a href=\"/send-handled-exception-with-metadata\">Send a handled exception to Bugsnag with custom MetaData</a><br/>"
                + "<a href=\"/send-unhandled-exception\">Send an unhandled exception to Bugsnag</a><br/>"
                + "<a href=\"/send-unhandled-exception-async\">Send an unhandled exception to Bugsnag from an async method</a><br/>"
                + "<a href=\"/send-unhandled-exception-async-future\">Send an unhandled exception to Bugsnag from an async method that returns a Future</a><br/>"
                + "<a href=\"/shutdown\">Shutdown the application</a><br/>";
    }
}

