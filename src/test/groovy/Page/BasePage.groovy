package Page

import geb.Page

class BasePage extends Page{
    static content ={
        tick { $("i.fa-check") }
        checkAvailability { $("i.ct-active") }
        findr {$("i.fa-search")}
    }

    public <T extends Page> T at(Class<T> pageType) {
        def atResult = browser.at(pageType)
        return atResult
    }

    public <T extends Page> T to(Class<T> pageType, Object[] args) {
        def toResult = browser.to(pageType)
        return toResult
    }
}

