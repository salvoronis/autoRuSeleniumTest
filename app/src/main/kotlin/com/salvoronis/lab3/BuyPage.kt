package com.salvoronis.lab3

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.WebDriverWait
/* import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions */

class BuyPage(var driver: WebDriver) {
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/button")
    lateinit var phoneButton: WebElement

    @FindBy(xpath = "//div[2]/div[2]/div/a")
    lateinit var phoneNumb: WebElement

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/div[4]")
    lateinit var mainInfo: WebElement

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/div[5]/div/div")
    lateinit var special: WebElement

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/div[6]/div/div")
    lateinit var simillar: WebElement

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/div[7]")
    lateinit var parts: WebElement

    init {
        PageFactory.initElements(driver, this)
    }
}