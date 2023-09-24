package Project2;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
 interface RemoteWDriver extends WebDriver {
    void navigate();
     @Override
     default void open() {}
     @Override
     default void close() {}
     @Override
     default String getTitle() {return null;}
 }
interface TakesScreenshot{
    void getScreenshot();
}
class ChromeDriver implements RemoteWDriver{

    @Override
    public void navigate() {}
    @Override
    public void open() {RemoteWDriver.super.open();}
    @Override
    public void close() {RemoteWDriver.super.close();}
    @Override
    public String getTitle() {return RemoteWDriver.super.getTitle();}
}
class firefoxDriver implements RemoteWDriver{
    @Override
    public void navigate() {}
    @Override
    public void open() {RemoteWDriver.super.open();}
    @Override
    public void close() {RemoteWDriver.super.close();}
    @Override
    public String getTitle() {return RemoteWDriver.super.getTitle();}
}
class SafariDriver implements RemoteWDriver{
    @Override
    public void navigate() {}
    @Override
    public void open() {RemoteWDriver.super.open();}
    @Override
    public void close() {RemoteWDriver.super.close();}
    @Override
    public String getTitle() {return RemoteWDriver.super.getTitle();}
}
class Tester{
    public static void main(String[] args) {
        WebDriver[] driver = {new ChromeDriver(), new firefoxDriver(), new SafariDriver()};
        for (WebDriver w:driver){
            w.close();
            w.open();
            w.getTitle();
        }
    }
}
