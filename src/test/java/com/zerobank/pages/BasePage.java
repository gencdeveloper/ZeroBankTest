package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * bu sayfayi kurma nedenimiz sayfalar arasinda merkez komuta olusturma ve
 * En cok tekrarlanan methodlari burada da toparlayabiliriz. Ornegin tab lar arasi gecis gibi.
 * */

public class BasePage {

    public BasePage(){ //Constructor
        PageFactory.initElements(Driver.getDriver(),this); //initilize to PageFactory
    }

    @FindBy(className = "active")
    public WebElement selectedTab;


    public void getTab(String menu){
        String menuLocator = "//a[.='"+menu+"']";

        Driver.getDriver().findElement(By.xpath(menuLocator)).click();
        BrowserUtils.sleep(1);

    }

}
