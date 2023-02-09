import tasks.clientes.JavascriptExecutor;

public class Utilidades {
	
	public void scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
	}

}
