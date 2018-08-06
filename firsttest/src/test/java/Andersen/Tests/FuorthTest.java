package Andersen.Tests;


import Andersen.pages.SityPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FuorthTest extends BaseTest {
    public static SityPage sityPage;
    @Test
    public  void FuorthTest() {
        sityPage = new SityPage(driver);

        driver.get("https://www.yandex.by/");

        sityPage.clickLocationLink();
        sityPage.clearCityField();
        sityPage.input("Лондон");
        sityPage.clickCityLinkLondon();
        sityPage.clickMoreLink();
        sityPage.numbersOfElementsLondon();

        sityPage.clickLocationLink();
        sityPage.clearCityField();
        sityPage.input("Париж");
        sityPage.clickCityLinkParis();
        sityPage.clickMoreLink();
        sityPage.numbersOfElementsParis();

        assertEquals (sityPage.numbersOfElementsLondon(), sityPage.numbersOfElementsParis());
        System.out.println(sityPage.numbersOfElementsLondon()+"="+ sityPage.numbersOfElementsParis());
    }
}