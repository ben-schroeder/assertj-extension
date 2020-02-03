package eu.benschroeder.assertj;

import org.assertj.core.api.BDDAssertions;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

public class WithBDDAssertionsForMockitoTest implements WithAssertions {

    @Test
    void testMethodCountMatches() {

        assertThat(WithBDDAssertionsForMockito.class.getDeclaredMethods().length).isEqualTo(BDDAssertions.class.getDeclaredMethods().length);

    }

}
