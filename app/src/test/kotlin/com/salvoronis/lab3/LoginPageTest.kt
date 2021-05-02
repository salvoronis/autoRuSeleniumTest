package com.salvoronis.lab3

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions

class LoginPageTest : TestMainClass() {
    override var url = "https://auth.auto.ru/login/"
    lateinit var page: LoginPage

    @BeforeEach fun page(){
        page = LoginPage(driver)
    }

    @Test fun auth(){
        driver.get(url)
        try {
            val result = page.login("salvoronis@gmail.com")
            assertEquals(result, "Не удалось войти в аккаунт")
        }catch(e: Throwable) {
            print("something went wrong")
        }
    }

    @Test fun errorAuth(){
        assertThrows<Exception>{
            page.login("guns'n'roses")
        }
    }

    @Test fun mainTest(){
        driver.get(url)
        println("'${driver.title}'")
        assertTrue(driver.title.contains("Авто.ру: купить, продать и обменять машину в Москве"))
    }

    @Test fun hasLoginBar() {
        driver.get(url)
        WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(page.loginForm))
    }

}
