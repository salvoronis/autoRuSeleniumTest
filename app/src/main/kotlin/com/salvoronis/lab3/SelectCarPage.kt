package com.salvoronis.lab3

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
/* import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions */

class SelectCarPage(var driver: WebDriver) {
    @FindBy(xpath = "/html/body/div[9]/div[2]/div[2]/div/div/form/div[1]/div[2]/span[1]")
    lateinit var brand: WebElement

    @FindBy(xpath = "/html/body/div[9]/div[2]/div[2]/div/div/form/div[1]/div[4]/div/div[2]/div[1]/div[1]/a")
    lateinit var audi: WebElement

    @FindBy(xpath = "/html/body/div[9]/div[2]/div[2]/div/div/form/div[1]/div[4]/div/div[2]/div[1]/div[1]/a")
    lateinit var model: WebElement

    @FindBy(xpath = "//div[3]/div[3]/div/button/span[2]")
    lateinit var showCarsBody: WebElement

    @FindBy(xpath = "//h2[contains(.,'Новинки каталога')]")
    lateinit var newInKatalogue: WebElement

    @FindBy(xpath = "/html/body/div[9]/div[2]/div[2]/div/div/div/div[2]")
    lateinit var families: WebElement

    @FindBy(xpath = "//div[2]/div[2]/div/div/div/div[3]")
    lateinit var classi: WebElement

    @FindBy(xpath = "//div[2]/div/div/div/div[5]/div")
    lateinit var special: WebElement

    @FindBy(xpath = "//div[2]/div/div/div/div[6]")
    lateinit var newVideos: WebElement

    @FindBy(xpath = "//div[2]/div/div/div/div[7]/div")
    lateinit var dialers: WebElement

    init {
        PageFactory.initElements(driver, this)
    }
}