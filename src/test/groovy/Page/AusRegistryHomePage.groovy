package Page

class AusRegistryHomePage extends BasePage{

    static url = "/"

    static at = { title == "Home - AusRegistry" }

    static content = {
        number1 { $("div.domains-registered span.number", 0..6)*.text().toString()}
      }

    String numberDisplay() {
        return number1
    }


    void navigateToDomainPageByClickingIcon() {
        waitFor { tick.isDisplayed() }
        interact {
            moveToElement(tick)
            println "moved to tick"
        }
        tick.click()
    }
}