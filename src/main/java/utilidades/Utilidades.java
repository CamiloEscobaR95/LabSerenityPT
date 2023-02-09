package utilidades;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;

public class Utilidades {

	static WebDriver driver = Serenity.sessionVariableCalled("driver");
	static JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	public static void scrollDownFull() {
		jse.executeScript("window.scrollBy(0,1050)");
	}
}
