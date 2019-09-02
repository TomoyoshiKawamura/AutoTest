package GraddleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReserveConfirmPage{
    private WebDriver driver;
    
    public ReserveConfirmPage(WebDriver driver){
        this.driver = driver;
        if (!"予約内容確認".equals(this.driver.getTitle())) {
            throw new IllegalStateException("現在のページが間違っています" + this.driver.getTitle());
        }
    }

    public String getPrice(){
        return driver.findElement(By.id("price")).getText();
    }
    
    public String getName(){
        return driver.findElement(By.id("gname")).getText();
    }

    public void commit(){
        driver.findElement(By.id("commit")).click();
    }
}