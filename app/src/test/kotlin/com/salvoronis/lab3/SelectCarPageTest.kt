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
        WebDriverWait(driver, 25L)
        .until(ExpectedConditions.visibilityOf(page.showCarsBody)).click()
    }

    @Test fun mainPage(){
        driver.get(url)
        println("'${driver.title}'")
        assertTrue(driver.title.contains("Каталог автомобилей на Авто.ру"))
    }

    @Test fun newInKatalog() {
        driver.get(url)
        WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.newInKatalogue))
    }

    @Test fun families() {
        driver.get(url)
        WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.families))
    }

    @Test fun classi() {
        driver.get(url)
        WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.classi))
    }

    @Test fun special() {
        driver.get(url)
        WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.special))
    }

    @Test fun newVideos() {
        driver.get(url)
        WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.newVideos))
    }

    @Test fun dialers() {
        driver.get(url)
        WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.dialers))
    }
}