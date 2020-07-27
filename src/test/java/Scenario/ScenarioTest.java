package Scenario;

import BaseTest.Base;
import Util.Steps;
import org.junit.Test;

public class ScenarioTest extends Base {
    Steps steps = new Steps();
    @Test
    public void girisTest(){
        steps.sendKeysToElementTest("input[id='L-UserNameField']", "testiniumdeneme123@gmail.com");
        steps.sendKeysToElementTest("input[id='L-PasswordField']", "123456t");
        steps.clickElement("input[id='gg-login-enter']");
    }

    @Test
    public void urunArama(){
        girisTest();
        steps.sendKeysToElementTest("input[id='search_word']", "iphone telefon");
        steps.clickElement("div[id='header-search-find-link']");
    }

    @Test
    public void urunleriCek(){
        girisTest();
        steps.sendKeysToElementTest("input[id='search_word']", "iphone telefon");
        steps.clickElement("div[id='header-search-find-link']");
        steps.pullElements("p[class='image-container product-hslider-container']");

    }

    @Test
    public void sepeteEkle(){
        girisTest();
        steps.sendKeysToElementTest("input[id='search_word']", "iphone telefon");
        steps.clickElement("div[id='header-search-find-link']");
        steps.clickElement("img[src='https://mcdn01.gittigidiyor.net/57938/tn30/579386625_tn30_0.jpg?159571']");
        steps.clickElement("span[class='action-text']");
        steps.clickElement("button[class='wis-btn-2 wis-btn-40056 control-button gg-ui-button plr10 gg-ui-btn-default']");

    }

}
