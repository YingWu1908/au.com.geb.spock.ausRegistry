package Specification

import Page.AusRegistryHomePage
import Page.AvailabilityPage

class AvailabilityPageTest extends BaseSpec {

    def "Navigate to domain availability page"() {
        given:
        AusRegistryHomePage ausRegistryHomePage = at AusRegistryHomePage

        when:
        ausRegistryHomePage.navigateToDomainPageByClickingIcon()

        then:
        at AvailabilityPage
    }

    def "Check different result of different input domain name"(){
        when:
        AvailabilityPage availabilityPage = at AvailabilityPage
        availabilityPage.inputDomain("test-automation","com.au")

        then:
        availabilityPage.contains("Sorry")

        when:
        availabilityPage.inputDomain("test-automation","org.au")

        then:
        availabilityPage.contains("Great news")
    }
}




