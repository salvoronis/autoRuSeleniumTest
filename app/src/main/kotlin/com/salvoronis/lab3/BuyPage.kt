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

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div/div/div/div/div/div[1]/div[1]/div/div[2]/div[2]/div/a")
    lateinit var phoneNumb: WebElement

    init {
        PageFactory.initElements(driver, this)
    }
}