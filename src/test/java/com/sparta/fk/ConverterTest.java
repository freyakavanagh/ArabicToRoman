package com.sparta.fk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConverterTest {
    @Test
    @DisplayName("Check that 0 returns Nulla")
    void checkThat0ReturnsNoNumeralStatement() {
        Assertions.assertEquals("Nulla", Converter.convertToRoman(0));
    }

    @Test
    @DisplayName("Check that 4 returns IV")
    void checkThat4ReturnsIV() {
        Assertions.assertEquals("IV", Converter.convertToRoman(4));
    }

    @Test
    @DisplayName("Check that 9 returns IX")
    void checkThat9ReturnsIX() {
        Assertions.assertEquals("IX", Converter.convertToRoman(9));
    }

    @Test
    @DisplayName("Check that 29 returns XVI")
    void checkThat29ReturnsXXIX() {
        Assertions.assertEquals("XXIX", Converter.convertToRoman(29));
    }

    @Test
    @DisplayName("Check that 80 returns LXXX")
    void checkThat80ReturnsLXXX() {
        Assertions.assertEquals("LXXX", Converter.convertToRoman(80));
    }

    @Test
    @DisplayName("Check that 294 returns CCXCIV")
    void checkThat294ReturnsCCXCIV() {
        Assertions.assertEquals("CCXCIV", Converter.convertToRoman(294));
    }

    @Test
    @DisplayName("Check that 2019 returns MMXIX")
    void checkThat2019ReturnsMMXIX() {
        Assertions.assertEquals("MMXIX", Converter.convertToRoman(2019));
    }
}
