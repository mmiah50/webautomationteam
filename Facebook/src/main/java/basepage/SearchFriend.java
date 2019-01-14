package basepage;

import base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFriend extends CommonApi {
   @FindBy (id ="u_e_2")
    WebElement SearchFriend;
   @FindBy(id="js_o")
    WebElement Button;
   public void Search(){
       SearchFriend.sendKeys("Barak Obama");

   }
   public void btn(){
       Button.click();
   }

}
