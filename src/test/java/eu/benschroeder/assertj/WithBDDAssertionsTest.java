package eu.benschroeder.assertj;

import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Test;

public class WithBDDAssertionsTest implements WithAssertions {

    @Test
    void testMethodCountMatches() {

        assertThat(WithBDDAssertions.class.getDeclaredMethods().length).isEqualTo(BDDAssertions.class.getDeclaredMethods().length);

    }

}
