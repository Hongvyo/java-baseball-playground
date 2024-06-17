package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String singleElement = "1";
        String actual = "1,2";
        assertThat(singleElement.split(",")).isEqualTo(new String[]{"1"});
        assertThat(actual.split(",")).isEqualTo(new String[]{"1", "2"});
    }

}
