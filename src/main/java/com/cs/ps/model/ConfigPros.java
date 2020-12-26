package com.cs.ps.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="product")
@Component
@Getter
@Setter
public class ConfigPros {
    private String greeting;
}
