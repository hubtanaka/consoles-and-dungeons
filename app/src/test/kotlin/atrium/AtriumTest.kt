package atrium

import ch.tutteli.atrium.api.fluent.en_GB.*
import ch.tutteli.atrium.api.verbs.expect
import org.junit.jupiter.api.Test

class AtriumTest {
    @Test
    fun testMessage() {
        val message = "Hello, Atrium!"
        expect(message).toContain("Atrium")
    }
}