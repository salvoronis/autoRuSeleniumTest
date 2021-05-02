package com.salvoronis.lab3

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

class SelectCarPageTest : TestMainClass() {
    override var url = "https://auto.ru/catalog/cars/"
    lateinit var page: SelectCarPage

    @BeforeEach fun page(){
        page = SelectCarPage(driver)
    }

    @Test fun selectBodyTest(){
        driver.get(url)
        page.brand.click()
        page.audi.click()
        page.model.click()
        val wait: WebDriverWait = WebDriverWait(driver, 10L)
        wait.until(ExpectedConditions.visibilityOf(page.somecar))
        page.somecar.click()
    }
}