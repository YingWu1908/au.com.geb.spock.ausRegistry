package Page

import org.openqa.selenium.JavascriptExecutor

class RegistrarsPage extends BasePage{

    static url="/registrars/"

    static at ={title.contains("Find a Registrar")}

    static content ={
        extenaldomain {$(".alignnone")}
        learnmore {$("a.button-xlarge")}
    }

    String calculateExtenalDomain(){
        def extenalLink
        extenalLink = extenaldomain.size()
        return extenalLink
    }

    void pressLearnMore(){
        js.exec ("window.scrollBy(0,2000)")
//      (driver as JavascriptExecutor).executeScript("arguments[0].scrollIntoView();", learnmore)
        //         js."argument[0].scrollIntoView();",learnmore
        learnmore.click()
    }
}
