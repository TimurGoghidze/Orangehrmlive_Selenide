import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class Start {

    @Test
    public void successLogin(){
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
