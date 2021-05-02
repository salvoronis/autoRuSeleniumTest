package com.salvoronis.lab3

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions

open class TestMainClass {
    open lateinit var driver: WebDriver
    open lateinit var url: String
    //open lateinit var page: T

    @BeforeEach fun setDriver() {
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver")

        val options: FirefoxOptions = FirefoxOptions()
        //options.addPreference("javascript.enabled", "false")
        //options.add
        driver = FirefoxDriver(options)
        driver.manage().window().maximize()

        //page = T(driver)
    }

    @AfterEach fun quitDriver() {
        driver.quit()
    }
}
