package Andersen.Tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import Andersen.pages.YandexPage;


public class YandexTest extends BaseTest {

    public static YandexPage yandexPage;

    @Test
    public void comparisonTest( ) throws InterruptedException {
        yandexPage = new YandexPage( driver );

        driver.get ( "https://www.yandex.ru/" );
        yandexPage.clickVideo( );
        Assert.assertEquals ( yandexPage.Url( ) , ( "https://yandex.ru/video/" ) );
        Assert.assertTrue ( ( yandexPage.videoLinks.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        yandexPage.clickImages( );
        Assert.assertEquals ( yandexPage.Url( ) , ( "https://yandex.ru/images/" ) );
        Assert.assertTrue ( ( yandexPage.imagesLinks.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        yandexPage.clickNews( );
        Assert.assertEquals ( yandexPage.Url( ) , ( "https://news.yandex.ru/" ) );
        Assert.assertTrue ( ( yandexPage.newsMainLink.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        yandexPage.clickMaps( );
        Assert.assertTrue ( yandexPage.Url( ).contains ( "https://yandex.ru/maps" ) );
        Assert.assertTrue ( ( yandexPage.mapsMainBody.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        yandexPage.clickMarket( );
        Assert.assertTrue ( yandexPage.Url( ).contains ( "https://market.yandex.ru/" ) );
        Assert.assertTrue ( ( yandexPage.marketMainLink.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        yandexPage.clickTranslate( );
        Assert.assertEquals ( yandexPage.Url( ) , ( "https://translate.yandex.ru/" ) );
        Assert.assertTrue ( ( yandexPage.translateInputField.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        yandexPage.clickMusic( );
        Assert.assertTrue ( yandexPage.Url( ).contains ( "https://music.yandex.ru/" ) );
        Assert.assertTrue ( ( yandexPage.musicInputField.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

    }
}
