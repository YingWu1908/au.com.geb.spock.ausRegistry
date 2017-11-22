package Specification
import Page.AusRegistryHomePage


class AusRegistryHomePageTest extends BaseSpec{

    def "Check Register number >3000000" (){
        given: "navigate to home page"
        AusRegistryHomePage ausRegistryHomePage = to AusRegistryHomePage


        when: "Scroll down to the number at home page"
        at AusRegistryHomePage
        js.exec("window.scrollBy(0,1500)")

//        def number
//        number= js.exec("var data=document.getElementsByClassName('number');"
//                + "var m='';"
//                + "for (var i=0; i<document.getElementsByClassName('number').length; i++)"
//                + "{m+=data[i].innerHTML}; return m;")


        then: "Verify whether the registered number >3000000"
//      Integer.parseInt(number.toString())>3000000
        def String s=ausRegistryHomePage.numberDisplay()
        println "s= :" +s
        s>"3000000"
    }
}
