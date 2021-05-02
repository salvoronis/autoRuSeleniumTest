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

    @FindBy(xpath = "/html/body/div[9]/div[2]/div[2]/div/div/div/div[3]/div/div/div/div/div[2]/ul/li[1]/a/span/span")
    lateinit var somecar: WebElement

    init {
        PageFactory.initElements(driver, this)
    }
}