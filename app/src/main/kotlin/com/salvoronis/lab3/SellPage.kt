package com.salvoronis.lab3

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.WebDriverWait

class SellPage(var driver: WebDriver) {
    @FindBy(xpath = "//div[2]/div[2]/div/div")
    lateinit var lada: WebElement

    @FindBy(xpath = "//div[3]/div[3]/div[2]/div/div")
    lateinit var model: WebElement

    @FindBy(xpath = "//button/span")
    lateinit var year: WebElement

    @FindBy(xpath = "//div[5]/span/label/button")
    lateinit var body: WebElement

    init {
        PageFactory.initElements(driver, this)
    }
}