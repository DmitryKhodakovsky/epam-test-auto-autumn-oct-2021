package com.epam.training.center.lesson04.tests;

import com.epam.training.center.lesson04.utils.AttachmentUtils;
import com.epam.training.center.lesson04.utils.LoginUtils;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class MoreSteps {

    public static final String CAT_URL =
            "https://upload.wikimedia.org/wikipedia/commons/b/b6/Felis_catus-cat_on_snow.jpg";

    @Test
    public void testLoginWithNormalUser() {
        LoginUtils.login(LoginUtils.DEFAULT_USER);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEmptyUser() {
        LoginUtils.login(LoginUtils.EMPTY_USER);
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testNullLogin() {
        LoginUtils.login(null);
    }

    @Test
    @Epic("Epic Cats")
    @Feature("About cats feature")
    @Story("Story about cats")
    @Severity(SeverityLevel.BLOCKER)
    public void testWithCats() {
        attachCatPics();
        List<String> strings = List.of("First", "Second", "Third");

        AttachmentUtils.makeStringAttachment(strings);
    }

    @SneakyThrows
    private void attachCatPics() {
        try (InputStream is = new URL(CAT_URL).openStream()) {
            AttachmentUtils.attachFromInputStream("We love cats", is);
        }
    }

}
