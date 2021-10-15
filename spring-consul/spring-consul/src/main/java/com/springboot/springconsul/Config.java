package com.springboot.springconsul;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(value = "user")
public class Config {

    private String ordername;
    private String password;

}
