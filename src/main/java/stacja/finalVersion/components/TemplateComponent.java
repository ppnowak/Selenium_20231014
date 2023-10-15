package stacja.finalVersion.components;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import stacja.finalVersion.factory.CustomPageFactory;

public class TemplateComponent {

    @Getter
    private final WebElement wrappedElement;

    public TemplateComponent(WebElement wrappedElement) {
        this.wrappedElement = wrappedElement;
        CustomPageFactory.init(wrappedElement, this);
    }
}