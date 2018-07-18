package it.weeg.billing.service;

import org.springframework.stereotype.Service;

@Service
public class ServerService {
    public static String version = "v.0.1";
    public static String[] frameworks = {"org.springframework.spring-webmvc:5.0.1.RELEASE",
            "org.springframework.security.spring-security-config:5.0.6.RELEASE",
            "org.springframework.security.spring-security-web:5.0.6.RELEASE",
            "com.fasterxml.jackson.core.jackson-databind:2.9.6",
            "mysql.mysql-connector-java:6.0.6",
            "org.springframework.bootspring-boot-starter-data-jpa:2.0.3.RELEASE",
            "joda-time.joda-time-hibernate:1.4",
            "joda-time.joda-time:2.10"};
}
