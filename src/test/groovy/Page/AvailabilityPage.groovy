package Page
import org.openqa.selenium.support.ui.Select

class AvailabilityPage extends BasePage {
    static url = "/domain-availability"

    static at = {title.contains("Domain availability")}

    static content ={
        dinput {$("input#whois-input-box")}
        doption {$("select#a_zone")}
    }

    void inputDomain(String domainName, String domainDepartment){
        dinput.value(domainName)
        println "domain name was inputted"
        doption.value(domainDepartment)
        println "domain department was selected"
    }

    void navigateToRegistrarPage() {
        waitFor { findr.isDisplayed() }
        interact {
            moveToElement(findr)
            println "moved to find a registrar"
        }
        findr.click()
    }
}
