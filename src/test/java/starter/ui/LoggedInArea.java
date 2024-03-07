package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoggedInArea {
    public static Target welcomeText = Target
            .the("Welcome text")
            .located(By.xpath("//android.widget.TextView[contains(@text,'You are logged in')]"));
}
