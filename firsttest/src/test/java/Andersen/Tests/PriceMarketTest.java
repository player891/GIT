package Andersen.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Andersen.pages.TraidePage;
import Andersen.pages.YandexPage;
import java.util.Collections;


public class PriceMarketTest extends BaseTest {
    public static TraidePage traidePage;
    public static YandexPage yandexPage;

    @Test
    public void PriceTest( ) {
        traidePage = new TraidePage( driver );
        yandexPage = new YandexPage( driver );
        driver.get ( "https://www.yandex.ru/" );
        yandexPage.clickMarket( );
        traidePage.moveComputers( );
        traidePage.clickTabletLink ( );
        traidePage.CountButton( );
        traidePage.sortedByPrice( );
        traidePage.sortPrice( );
        Collections.sort ( traidePage.sortedList );
        Assert.assertTrue ( traidePage.sortedList.equals ( traidePage.obtained) );
        Assert.assertEquals ( traidePage.sortedPrice.getAttribute ( "Class" ) , traidePage.Asc);
        traidePage.sortedByPrice( );
        traidePage.sortPrice( );
        Collections.sort ( traidePage.sortedList );
        Collections.reverse ( traidePage.sortedList );
        Assert.assertTrue ( traidePage.sortedList.equals ( traidePage.obtained) );
        Assert.assertEquals ( traidePage.sortedPrice.getAttribute ( "Class" ) , traidePage.Desc);
    }
}