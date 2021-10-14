package com.epam.training.center.lesson01;

import org.testng.annotations.DataProvider;

public class MultiplyDataProvider {

    @DataProvider
    public Object[][] multiplyData() {
        return new Object[][] {
            {2, 3, 6},
            {7, 7, 49}
        };
    }
}
