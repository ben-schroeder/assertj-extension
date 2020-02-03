package eu.benschroeder.assertj;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class WithAssertionsTest implements WithAssertions {

    @Test
    void testMethodCountMatches() {

        assertThat(WithAssertions.class.getDeclaredMethods().length).isEqualTo(Assertions.class.getDeclaredMethods().length);

    }

}
