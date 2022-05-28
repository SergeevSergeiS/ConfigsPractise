package ru.internet.sergeevss90.owner.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebTest extends TestBase {

    @Test
    public void testGithubTitle() {
        assertEquals("GitHub: Where the world builds software · GitHub", title());
    }

}
