package Class22;

public class WebDriverTester {


    public static void main(String[] args) {
   Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();
        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();
        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.test();
        fireFox.closeBrowser();


        WebDriver[] browsers={new Chrome(),new Safari(),new FireFox()};
        for (WebDriver browser:browsers
        ) {
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }

        .findElement(By.id("email")).sendKeys("janel");
.findElement(By.id("pass")).sendKeys("janel123");
.findElement(By.name("login")).click();
        From Janel to Everyone 07:46 PM
        args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            WebDriver face=new ChromeDriver();
            face.get("https://facebook.com/");
            Thread.sleep(2000);
            face.findElement(By.id("email")).sendKeys("janel@gmail.com");
            face.findElement(By.id("pass")).sendKeys("janel123");
            face.findElement(By.name("login")).click();



        }}

.findElement(By.id("email")).sendKeys("janel");
.findElement(By.id("pass")).sendKeys("janel123");
.findElement(By.name("login")).click();
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver face=new ChromeDriver();
        face.get("https://facebook.com/");

        face.findElement(By.id("email")).sendKeys("janel@gmail.com");
        face.findElement(By.id("pass")).sendKeys("janel123");

        Thread.sleep(2000);
        face.findElement(By.linkText("Forgot password?")).click();
        Thread.sleep(2000);
        face.findElement(By.id("identify_email")).sendKeys("545454545");
        Thread.sleep(3000);
        face.findElement(By.id("did_submit")).click();
        Thread.sleep(3000);
        //face.findElement(By.name("login")).click();
        face.quit();



          /* Chrome chrome=new Chrome();
        FireFox fireFox=new FireFox();
        Safari safari=new Safari();
        WebDriver[] browsers={chrome,fireFox,safari};
        */
        /*
        Creating objects of all Child classes and storing them in an array of
        type Webdriver we can do this bcause upcasting allows us to do this

         */
    for(int i=0; i<browsers.length; i++){
        browsers[i].startBrowser();
        browsers[i].test();
        browsers[i].closeBrowser();
    }


System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
    WebDriver face=new ChromeDriver();
        face.get("https://facebook.com/");

        face.findElement(By.id("email")).sendKeys("janel@gmail.com");
        face.findElement(By.id("pass")).sendKeys("janel123");

        Thread.sleep(2000);
        face.findElement(By.linkText("Forgot password?")).click();
        Thread.sleep(2000);
        face.findElement(By.id("identify_email")).sendKeys("545454545");
        Thread.sleep(3000);
        face.findElement(By.id("did_submit")).click();
        Thread.sleep(3000);
    //face.findElement(By.name("login")).click();
        face.quit();



    }
}