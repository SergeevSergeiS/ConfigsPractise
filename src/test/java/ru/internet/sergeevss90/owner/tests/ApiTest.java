package ru.internet.sergeevss90.owner.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import ru.internet.sergeevss90.owner.config.ApiConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiTest {
    @Test
    void apiTest() {
        //Когда-нибудь я узнаю, как делать такие тесты
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(config.baseUrl()).isEqualTo("https://github.com");
        assertThat(config.token()).isEqualTo("any_token");
    }
}
