package com.crackingthecodinginterview.dsa.problem1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class DoesStringHasUniqueCharactersTest {

    @ParameterizedTest
    @MethodSource("approachesProvider")
    void positiveCases(DoesStringHasUniqueCharacters approachImpl) {
        boolean result = approachImpl.hasUniqueCharacters("abcd");
        Assertions.assertThat(result).isTrue();
    }

    @ParameterizedTest
    @MethodSource("approachesProvider")
    void negativeCases(DoesStringHasUniqueCharacters approachImpl) {
        boolean result = approachImpl.hasUniqueCharacters("aaabbccdaa");
        Assertions.assertThat(result).isFalse();
    }

    static Stream<DoesStringHasUniqueCharacters> approachesProvider() {
        return Stream.of(new Approach1(), new Approach2(), new Approach3(), new Approach4(), new Approach5());
    }
}