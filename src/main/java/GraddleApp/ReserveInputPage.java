package GraddleApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ReserveInputPage{
    WebDriver driver;

    @FindBy(how = How.ID,id = "reserve_year")
    WebElement reserve_y;
    
    @FindBy(how=How.ID,id="reserve_month")
    WebElement reserve_m;

    @FindBy(how=How.ID,id="reserve_day")
    WebElement reserve_d;

    @FindBy(how=How.ID,id="reserve_term")
    WebElement reserve_term;

    @FindBy(how=How.ID,id="headcount")
    WebElement headcount;

    @FindBy(how=How.ID,id="breakfast_on")
    WebElement breakfast_on;

    @FindBy(how = How.ID,id="breakfast_off")
    WebElement breakfast_off;

    @FindBy(how = How.ID,id="plan_a")
    WebElement plan_a;

    @FindBy(how =How.ID,id="plan_b")
    WebElement plan_b;

    @FindBy(how=How.ID,id="guestname")
    WebElement guestname;

    @FindBy(how=How.ID,id="goto_next")
    WebElement goto_next;

    public ReserveInputPage(WebDriver driver){
        this.driver = driver;
        if (driver.getTitle() == null || driver.getTitle().equals("予約情報入力")){
            throw new IllegalStateException("現在のページがReserveInputPageではありません");
        }
    }

    public void setschedule(String year,String month,String day,String term){
        reserve_y.clear();
        reserve_y.sendKeys(year);
        reserve_m.clear();
        reserve_m.sendKeys(month);
        reserve_d.clear();
        reserve_d.sendKeys(day);
    }

    public void setTerm(String term){
        reserve_term.clear();
        reserve_term.sendKeys(term);
    }

    public void setGuestName(String name){
        guestname.clear();
        guestname.sendKeys(name);
    }
    
    public void setheadCount(String head){
        headcount.clear();
        headcount.sendKeys(head);
    }

    public ReserveConfirmPage gotoNext(){
        goto_next.click();
        return new ReserveConfirmPage(driver);
    }

}