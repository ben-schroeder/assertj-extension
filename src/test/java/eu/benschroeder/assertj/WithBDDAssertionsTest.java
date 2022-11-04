package eu.benschroeder.assertj;

import org.assertj.core.api.BDDAssertions;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

class WithBDDAssertionsTest implements WithAssertions {

    @Test
    void testMethodsMatch() {
        
        final Method[] withBddAssertionsMethods = WithBDDAssertions.class.getDeclaredMethods();
        final Method[] bddAssertionsMethods = BDDAssertions.class.getDeclaredMethods();
        final Method[] withAssertionsMethods = WithAssertions.class.getDeclaredMethods();

        for (final Method bddAssertionsMethod : bddAssertionsMethods) {
            final Optional<Method> withBddAssertionsMethod = Arrays.stream(withBddAssertionsMethods)
                    .filter(method -> Objects.equals(method.getName(), bddAssertionsMethod.getName()))
                    .filter(method -> Objects.equals(method.getReturnType(), bddAssertionsMethod.getReturnType()))
                    .filter(method -> Arrays.equals(method.getParameterTypes(), bddAssertionsMethod.getParameterTypes()))
                    .findFirst();
            if (!withBddAssertionsMethod.isPresent()) {
                final Optional<Method> withAssertionsMethod = Arrays.stream(withAssertionsMethods)
                        .filter(method -> Objects.equals(method.getName(), bddAssertionsMethod.getName()))
                        .filter(method -> Objects.equals(method.getReturnType(), bddAssertionsMethod.getReturnType()))
                        .filter(method -> Arrays.equals(method.getParameterTypes(), bddAssertionsMethod.getParameterTypes()))
                        .findFirst();
                if (!withAssertionsMethod.isPresent()) {
                    fail("Missing: " + bddAssertionsMethod.toString());
                }
            }
        }

    }

}
