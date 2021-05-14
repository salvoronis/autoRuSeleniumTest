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
        val body = WebDriverWait(driver, 25L)
        .until(ExpectedConditions.visibilityOf(page.showCarsBody)).click()
        assertNotNull(body)
    }

    @Test fun mainPage(){
        driver.get(url)
        println("'${driver.title}'")
        val mainPage = assertTrue(driver.title.contains("Каталог автомобилей на Авто.ру"))
        assertNotNull(mainPage)
    }

    @Test fun newInKatalog() {
        driver.get(url)
        val mainPage = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.newInKatalogue))
        assertNotNull(mainPage)
    }

    @Test fun families() {
        driver.get(url)
        val families = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.families))
        assertNotNull(families)
    }

    @Test fun classi() {
        driver.get(url)
        val classi = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.classi))
        assertNotNull(classi)
    }

    @Test fun special() {
        driver.get(url)
        val special = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.special))
        assertNotNull(special)
    }

    @Test fun newVideos() {
        driver.get(url)
        val newVideos = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.newVideos))
        assertNotNull(newVideos)
    }

    @Test fun dialers() {
        driver.get(url)
        val dialers = WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.dialers))
        assertNotNull(dialers)
    }
}