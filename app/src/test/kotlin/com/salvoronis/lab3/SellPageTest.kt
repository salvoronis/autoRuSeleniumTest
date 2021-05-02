package com.salvoronis.lab3

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

class SellPageTest : TestMainClass() {
    override var url = "https://auto.ru/cars/used/add/"
    lateinit var page: SellPage

    @BeforeEach fun page(){
        page = SellPage(driver)
    }

    @Test fun mainTest(){
        driver.get(url)
        println("'${driver.title}'")
        assertTrue(driver.title.contains("Размещение объявления"))
    }

    @Test fun sellTest(){
        driver.get(url)

        WebDriverWait(driver, 15L)
        .until(ExpectedConditions.visibilityOf(page.lada)).click()

        WebDriverWait(driver, 15L)
        .until(ExpectedConditions.visibilityOf(page.model)).click()

        WebDriverWait(driver, 15L)
        .until(ExpectedConditions.visibilityOf(page.year)).click()

        WebDriverWait(driver, 15L)
        .until(ExpectedConditions.visibilityOf(page.body)).click()
    }
}