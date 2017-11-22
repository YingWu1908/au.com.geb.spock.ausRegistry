package Specification

import Page.AvailabilityPage
import Page.RegistrarsPage
import Page.TechnicalPage

class RegistrarsPageTest extends BaseSpec{

    def "Navigate to Find a Registrar Page and get the number of extenal links" (){
        when:
        AvailabilityPage availabilityPage = at AvailabilityPage
        availabilityPage.navigateToRegistrarPage()

        and:
        RegistrarsPage registrarsPage = at RegistrarsPage

        then:
        println "External Links: " + registrarsPage.calculateExtenalDomain()
    }

    def "Navigate to Become a Registrar Page and verify email/phone information" (){
        when:
        RegistrarsPage registrarsPage = at RegistrarsPage
        registrarsPage.pressLearnMore()

        and:
        TechnicalPage technicalPage = at TechnicalPage

        then:
        technicalPage.contains("Email")
        technicalPage.contains("Phone")
    }
}
