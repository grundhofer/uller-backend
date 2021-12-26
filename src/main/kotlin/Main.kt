import logic.AvailabilityChecker
import network.initFirebase
import network.startRestService

fun main() {
    initFirebase()
    startRestService()
    val availabilityChecker = AvailabilityChecker()
    availabilityChecker.startAvailabilityChecker()
}