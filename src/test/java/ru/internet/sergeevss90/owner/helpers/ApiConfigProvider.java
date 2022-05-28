package ru.internet.sergeevss90.owner.helpers;

import org.aeonbits.owner.ConfigFactory;
import ru.internet.sergeevss90.owner.config.ApiConfig;

public class ApiConfigProvider {
    public static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
}
