package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int one = 1;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int one = 3;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int one = 3;
        int two = 3;
        int result = Max.max(one, two);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To3To4Then6() {
        int one = 3;
        int two = 4;
        int three = 6;
        int result = Max.max(one, two, three);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8To3To4To6Then8() {
        int one = 3;
        int two = 4;
        int three = 6;
        int four = 8;
        int result = Max.max(one, two, three, four);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
}