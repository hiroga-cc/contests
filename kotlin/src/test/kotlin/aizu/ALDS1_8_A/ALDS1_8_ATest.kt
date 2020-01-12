package aizu.ALDS1_8_A

import assertIO
import org.junit.Test

class ALDS1_8_ATest {
    @Test
    fun case1() {
        assertIO(
            """
            8
            insert 30
            insert 88
            insert 12
            insert 1
            insert 20
            insert 17
            insert 25
            print  
            """.trimIndent(),
            """ 1 12 17 20 25 30 88
 30 12 1 20 17 25 88""",
            ::main
        )
    }
}