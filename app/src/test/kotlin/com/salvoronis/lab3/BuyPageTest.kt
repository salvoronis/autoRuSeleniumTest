package com.salvoronis.lab3

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

class BuyPageTest : TestMainClass() {
    override var url = "https://auto.ru/cars/used/sale/audi/100/1103386449-fe21f2aa/"
    lateinit var page: BuyPage

    @BeforeEach fun page(){
        page = BuyPage(driver)
    }

    @Test fun buyTest(){
        driver.get(url)

        WebDriverWait(driver, 15L)
        .until(ExpectedConditions.visibilityOf(page.phoneButton)).click()

        WebDriverWait(driver, 10L)
        .until(ExpectedConditions.visibilityOf(page.phoneNumb))
        val regex = Regex("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$")
        assertTrue(regex.matches(page.phoneNumb.text))
    }

    @Test fun mainTest(){
        driver.get(url)
        println("'${driver.title}'")
        assertTrue(driver.title.contains("Купить б/у"))
    }

    @Test fun mainInfo() {
        driver.get(url)
        WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.mainInfo))
    }

    @Test fun special() {
        driver.get(url)
        WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.special))
    }

    @Test fun simillar() {
        driver.get(url)
        WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.simillar))
    }

    @Test fun parts() {
        driver.get(url)
        WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.parts))
    }
}