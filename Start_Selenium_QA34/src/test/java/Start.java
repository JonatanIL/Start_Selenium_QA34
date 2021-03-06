import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void start() {
        wd = new ChromeDriver(); // веб элемент должен быть равен веб драйвер
        // wd.get("https://contacts-app.tobbymarshall815.vercel.app/home"); //without history
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home"); //with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        // wd.close();//close only one tab
        wd.quit(); //close every tabs
    }

    @Test
    public void firstLoginSuccess() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home"); //with history
        //open form --> click login button
        WebElement loginTab = wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();
        //fill valid email
        WebElement emailTextBox = wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("JonatanIL@gmail.com");
        //fill valid password
        WebElement passwordTextBox = wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Nnoa12345$");
        //click login button
        WebElement loginButton = wd.findElement(By.cssSelector("button"));
        loginButton.click();

        //Asert

        //framework= сценарий
    }

}
