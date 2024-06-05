package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        System.out.println("??");
        assertThat(actual).isEqualTo("adc");
    }
    @Test
    void splitByComma() {
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitByCommaSingleElement() {
        String actual = "abc".replace("b", "d");
        System.out.println("??");
        assertThat(actual).isEqualTo("adc");
    }
}
