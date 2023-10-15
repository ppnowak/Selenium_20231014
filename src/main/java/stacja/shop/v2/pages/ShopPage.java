package stacja.shop.v2.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import stacja.Global;
import stacja.shop.v2.components.ShopItemComponent;

import java.util.List;

public class ShopPage extends TemplatePage {

    @Getter
    @FindBy(css = ".card")
    private List<ShopItemComponent> items;

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        getDriver().get(Global.PAGE_URL + "/shop/");
    }

}
