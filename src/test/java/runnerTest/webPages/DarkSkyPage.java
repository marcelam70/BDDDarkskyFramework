package runnerTest.webPages;
import Utils.BasePage;
import org.openqa.selenium.By;

public class DarkSkyPage  extends  ElementUtil {
    By searchBtn = By.xpath("//a[@class='searchButton']");

    // By searchLocation = By.xpath("//div[@id='savedLocations']");
    By today = By.xpath("//*[@id=\'week\']/a[1]");
    private By lowTop = By.xpath("//span[@class='low-temp-text']");
    private By highTop = By.xpath("//span[@class='high-temp-text']");
    private By lowToday = By.xpath("//a[@data-day='0']//span[@class='minTemp']");
    private By highToday = By.xpath("//a[@data-day='0']//span[@class='maxTemp']");


    public String getPageTitle() {
        return BasePage.get().getTitle();

    }

    public void myCity()  {
        getTextFromElement(today);
    }
    public boolean verifyLowTemp() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String temp1 = getTextFromElement(lowTop);
        String temp2 = getTextFromElement(lowToday);
        return temp1.equals(temp2);
    }

    public boolean verifyHighTemp() {
        String temp1 = getTextFromElement(highTop);
        String temp2 = getTextFromElement(today);
        return temp1.equals(temp2);
    }

    public void tempIsDisplayedCorrectly() {
 isElementDisplayed(today);

    }

}

