package demo
class DemoController {

    def index() {
        def prop1 = grailsApplication.config.grails.demo.prop1
        def prop2 = grailsApplication.config.grails.demo.prop2

        render "prop1: ${prop1}, prop2: ${prop2}"
    }
}
