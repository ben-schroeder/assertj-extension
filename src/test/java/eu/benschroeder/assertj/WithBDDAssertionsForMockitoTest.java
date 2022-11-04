package eu.benschroeder.assertj;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class WithBDDAssertionsForMockitoTest implements WithAssertions {

    @Test
    void testMethodCountMatches() {

        assertThat(WithBDDAssertionsForMockito.class.getDeclaredMethods().length).isEqualTo(WithBDDAssertions.class.getDeclaredMethods().length);

    }

}
