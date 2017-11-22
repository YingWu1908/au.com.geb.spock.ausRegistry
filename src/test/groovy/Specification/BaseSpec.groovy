package Specification

import geb.Page
import geb.spock.GebSpec

class BaseSpec extends GebSpec {
    def <T extends Page> T at(Class<T> pageType) {
        def atResult = browser.at(pageType)
        return atResult
    }

    def <T extends Page> T to(Class<T> pageType) {
        def toResult = browser.to(pageType)
        return toResult
    }
}
