import spock.lang.Specification

class SlotMachineSpec extends Specification {

    def "test spin results and payout"() {
        given:
        SlotMachine slotMachine = new SlotMachine()

        when:
        def result = slotMachine.spin(betAmount)

        then:
        result.reels.size() == 3
        result.payout >= 0

        where:
        betAmount << [10, 50, 100]
    }
}