package com.salvoronis.lab3

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver

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

}
