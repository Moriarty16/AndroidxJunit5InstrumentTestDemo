package com.jk.androidjunit5instrumenttestdemo;

import android.app.UiAutomation;
import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.UiDevice;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class InstrumentationTestDemo {

    // Possible needed components
    private static UiDevice mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    private static UiAutomation mUiAutomation = InstrumentationRegistry.getInstrumentation().getUiAutomation();
    private static Context ctx = InstrumentationRegistry.getInstrumentation().getTargetContext();

    @BeforeAll
    static void setUpBeforeClass() {

    }

    @AfterAll
    static void tearDownAfterClass() {

    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void testEqualDemo() {
        Assert.assertEquals("Demo test for integer add", 10, 2 + 8);
    }

}
