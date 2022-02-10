package eu.benschroeder.assertj;

import org.assertj.core.api.BDDAssertions;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

class WithBDDAssertionsForMockitoTest implements WithAssertions {

    private static final int NUMBER_OF_METHODS_FROM_ASSERTIONS = 82;

    @Test
    void testMethodCountMatches() {

        assertThat(WithBDDAssertionsForMockito.class.getDeclaredMethods().length).isEqualTo(BDDAssertions.class.getDeclaredMethods().length - NUMBER_OF_METHODS_FROM_ASSERTIONS);
        
    }

}
