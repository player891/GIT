package Andersen.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class TraidePage {
    public TraidePage(WebDriver driver ) {
        PageFactory.initElements ( driver , this );
        this.driver = driver;
    }

    public  String Desc = "n-filter-sorter i-bem n-filter-sorter_js_inited n-filter-sorter_sort_desc n-filter-sorter_state_select";
    public  String Asc = "n-filter-sorter i-bem n-filter-sorter_js_inited n-filter-sorter_sort_asc n-filter-sorter_state_select";
    public  WebDriver driver;
    public  ArrayList List;
    private String SortedPrice;

    @FindBy ( css = "[class='link topmenu__link'][href='/catalog/54425?hid=91009&track=menu']" )
    private WebElement computers;
    @FindBy ( css = "[class='link topmenu__subitem'][href='/catalog/54545/list?hid=6427100&track=menuleaf']" )
    private WebElement tablet;
    @FindBy ( css = "[class='button button_theme_normal button_arrow_down button_size_s select__button i-bem button_js_inited']" )
    private WebElement viewButton;
    @FindBy ( css = "div.n-filter-block_pos_left.i-bem > div:nth-child(3)" )
    public  WebElement sortedPrice;
    @FindBy ( css = "[class='n-snippet-card2__title']" )
    private List <WebElement> item;
    @FindBy ( css = "div[class='price']" )
    private List <WebElement> priceLinks;
    @FindBy ( css = "[class='layout__col i-bem layout__col_search-results_normal'] > div > div >div >div:last-child   div[class='price']:last-child" )
    private WebElement lastPrice;
    @FindBy ( css = "div > div:nth-child(2) > div.n-snippet-card2__hover > div > div > div" )
    private WebElement secondItem;
    @FindBy ( css = "div > div:first-child > div.n-snippet-card2__hover > div > div > div" )
    private WebElement firstItem;
    @FindBy ( css = "[href='/compare?track=head']" )
    private WebElement        compareLink;
    @FindBy ( css = ".n-compare-head.i-bem.n-compare-head_js_inited > div > div > div >div" )
    public  List <WebElement> ItemsList;
    @FindBy ( css = ".n-compare-head.i-bem.n-compare-head_js_inited > div > div > div >div:first-child > div > span" )
    private WebElement firstDeleteButton;
    @FindBy ( css = ".n-compare-head.i-bem.n-compare-head_js_inited > div > div > div >div:nth-child(2) > div > span" )
    private WebElement secondDeleteButton;
    @FindBy ( css = ".n-compare-head.i-bem.n-compare-head_js_inited > div > div > div >div:first-child" )
    public  WebElement firstItemSum;
    @FindBy ( css = ".n-compare-head.i-bem.n-compare-head_js_inited > div > div > div >div:nth-child(2)" )
    public  WebElement        secondItemSum;

    public ArrayList <String> obtained = new ArrayList <String> ( );
    public ArrayList <String> sortedList   = new ArrayList <String> ( );

    public void clickItemDelete( ) {
        WebElement explicitWait = ( new WebDriverWait ( driver , 10 ) )
                .until ( ExpectedConditions.elementToBeClickable (firstDeleteButton) );
        firstDeleteButton.click ( );
    }

    public void clickSecondDelete( ) {
        WebElement explicitWait = ( new WebDriverWait ( driver , 10 ) )
                .until ( ExpectedConditions.elementToBeClickable (secondDeleteButton) );
        secondDeleteButton.click ( );
    }

    public void CompareLink( ) {

        WebElement Wait = ( new WebDriverWait ( driver , 10 ) )
                .until ( ExpectedConditions.elementToBeClickable ( compareLink ) );
        compareLink.click ( );
    }

    public void clickSecondItem( ) {
        secondItem.click ( );
    }

    public void clickFirstItem( ) {
        firstItem.click ( );
    }

    public void moveLink2( ) {
        Actions actions = new Actions ( driver );
        actions.moveToElement (secondDeleteButton);
        actions.perform ( );
    }

    public void moveLink( ) {
        Actions actions = new Actions ( driver );
        actions.moveToElement (firstDeleteButton);
        actions.perform ( );
    }

    public void moveComputers( ) {
        Actions actions = new Actions ( driver );
        actions.moveToElement (computers);
        actions.perform ( );
    }

    public void CountButton( ) {
        viewButton.click ( );
    }



    public void sortPrice( ) {
        Boolean explicitWait = ( new WebDriverWait ( driver , 10 ) )
                .until ( ExpectedConditions.invisibilityOf ( priceLinks.get ( 11 ) ) );
        obtained.clear ( );
        sortedList.clear ( );
        priceLinks.clear ( );
        for ( WebElement we : priceLinks ) {
            obtained.add ( we.getText ( ) );
        }
        for ( String s : obtained) {
            sortedList.add ( s );
        }
    }

    public void sortedByPrice( ) {
        sortedPrice.click ( );
    }

    public void clickTabletLink ( ) {
        WebElement explicitWait = ( new WebDriverWait ( driver , 10 ) )
                .until ( ExpectedConditions.elementToBeClickable (tablet) );
        tablet.click ( );
    }


 }