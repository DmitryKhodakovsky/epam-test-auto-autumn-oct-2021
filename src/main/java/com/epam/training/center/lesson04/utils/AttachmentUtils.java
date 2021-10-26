package com.epam.training.center.lesson04.utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import java.io.InputStream;
import java.util.List;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AttachmentUtils {

    public void attachFromInputStream(final String name, final InputStream inputStream) {
        Allure.addAttachment(name, inputStream);
    }

    @Attachment
    public String makeStringAttachment(final List<String> stringsAttachment) {
        return stringsAttachment.toString();
    }
}
