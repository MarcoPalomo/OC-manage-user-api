package com.openclassrooms.manageuserapi;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration

//On va scanner dans application.properties toutes les valeurs qui ont pour prefix com.openclassrooms.manageuserapi
@ConfigurationProperties(prefix="com.openclassrooms.manageuserapi")
public class CustomProperties {
    private String apiUrl;
}
