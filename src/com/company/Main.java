package com.company;

/* 
1. Открыть http://booking.uz.gov.ua/ , ввести Откуда Київ, Куда Івано-Франківськ,  на 20 Червня 2015, нажимаем Поиск,
смотрим что у нас 2 результата, 1-й 043К поезд, 2-й 143К поезд.
Кликаем на 043К, смотрим что повилось окошко "Маршрут поїзда", закрываем его, нажимаем кнопку Выбрать возле Купе 043К,
смотрим что  одно место (24) свободно, и что выбран 5-й вагон. Кликаем на свое свободное место,
проверяем что цена 212,70, заполняем Фамилию Имя (тестовые).

Как-то так:
        UzPage.open(); // Открьіть http://booking.uz.gov.ua/
        UzPage.from("Київ"); // ввести Откуда Київ
        UzPage.to("Івано-Франківськ"); // ввести Куда Івано-Франківськ
        UzPage.date("Червень 2015", 20); // на 20 Червня 2015
        UzPage.search(); // нажимаем Поиск
        Assert.assertEquals(2, UzPage.resultsCount()); // смотрим что у нас 2 результата
        WebElement sel = findElement(By.name("time_dep"));
        Select s = new Select(sel);
        s.selectByVisibleText("03:00");

2. Выбираем Киев-Киев - сообщение о совпадении маршрутов
 
 
*/


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class Main {

// ==================================================== Один раз открыть/закрыть браузер ===============================

    @BeforeClass
    public static void OpenBrowser () {
        MyBrowserFunction.OpenBrowser();
        MyBrowserFunction.OpenURL();
    }

    @AfterClass
    public static void CloseBrowser() {
        // MyBrowserFunction.CloseBrowser();
    }

// ==================================================== Каждый раз открывать/закрывать браузер =========================
/*
    @Before
    public void OpenBrowser() {
        MyLibrary.OpenBrowser();
        MyLibrary.OpenURL();
    }

    @After
    public void CloseBrowser() {
        MyLibrary.CloseBrowser();
    }
*/
// ==================================================== Собственно - тесты =============================================

    @Test
    public void Test01_SmokeTest01 () {
        // First smoke test
        // Открыть http://booking.uz.gov.ua/
        // Done - в @BeforeClass
        // Убедиться, что открылся правильный сайт
        Assert.assertEquals("Test with title checking", "Онлайн резервирование и покупка билетов - Укрзализныця", MyBrowserFunction.TitleChecker());
        // ввести Откуда Київ
        MyBrowserFunction.FillField("From", "Киев");
        // куда Куда Івано-Франківськ
        MyBrowserFunction.FillField ("To", "Львов");
        // Нажать главную кнопку
        MyBrowserFunction.ClickMainButton();

        Assert.assertTrue("Test with empty right field", true);
    }

}
