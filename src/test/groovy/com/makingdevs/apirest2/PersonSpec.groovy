package com.makingdevs.apirest2
import spock.lang.Specification

class PersonSpec extends Specification {
    void "do test"(){
        when:
        def result = 5 + 5
        then:
        result === 10
    }
}
