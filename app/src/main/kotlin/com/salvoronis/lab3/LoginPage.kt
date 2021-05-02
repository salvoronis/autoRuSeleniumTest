package com.salvoronis.lab3

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

class LoginPage(var driver: WebDriver) {
    @FindBy(xpath = "/html/body/div/div/div/div/form/div/div[3]/div/span[5]/a/span")
    lateinit var loginIcon: WebElement

    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    lateinit var login: WebElement

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")
    lateinit var submit: WebElement

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/div/h1/span")
    lateinit var errorText: WebElement

    fun login(loginStr: String):String {
        loginIcon.click()
        val parentWindow: String = driver.getWindowHandle()
        val wait: WebDriverWait = WebDriverWait(driver, 5L)
        wait.until(ExpectedConditions.numberOfWindowsToBe(2))
        lateinit var result: String
        for (i1 in driver.getWindowHandles()) {
            println("parent - ${parentWindow} cur - ${i1}")
            if (!parentWindow.equals(i1)) {
                driver.switchTo().window(i1)
                val wait2: WebDriverWait = WebDriverWait(driver, 20L)
                wait2.until(ExpectedConditions.elementToBeClickable(login))
                .sendKeys(loginStr)
                submit.click()
                val wait3: WebDriverWait = WebDriverWait(driver, 20L)
                result = wait3.until(ExpectedConditions.visibilityOf(errorText)).text
                break
            }
        }
        println("$result")
        return result
    }

    init {
        PageFactory.initElements(driver, this)
    }
}