package Andersen.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Andersen.pages.TraidePage;
import Andersen.pages.YandexPage;

public class TreideTest extends BaseTest {
    public static TraidePage traidePage;
    public static YandexPage yandexPage;

    @Test
    public void CompareTest ( ) {
        traidePage = new TraidePage( driver );
        yandexPage = new YandexPage( driver );
        driver.get ( "https://www.yandex.ru/" );
        yandexPage.clickMarket( );
        traidePage.moveComputers( );
        traidePage.clickTabletLink ( );
        traidePage.clickFirstItem( );
        traidePage.clickSecondItem( );
        traidePage.CompareLink( );
        Assert.assertEquals ( traidePage.firstItemSum.isDisplayed ( ) , traidePage.secondItemSum.isDisplayed ( ) , "true" );
        traidePage.moveLink( );
        traidePage.clickItemDelete( );
        traidePage.moveLink2( );
        traidePage.clickSecondDelete( );
        Assert.assertEquals ( traidePage.firstItemSum.isDisplayed ( ) , traidePage.secondItemSum.isDisplayed ( ) , "false" );



    }
}