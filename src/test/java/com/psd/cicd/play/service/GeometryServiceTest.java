package com.psd.cicd.play.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeometryServiceTest {

    private GeometryService geometryService;

    @BeforeEach
    public void setup() {
        geometryService = new GeometryService();
    }

    // Imtiaz Kalam Abir - Test
    @Test
    void calculateSquareAreaTest() {
        Assertions.assertThat(geometryService.calculateSquareArea(5.0)).isEqualTo(25.0);
    }

    // Anisur Rahman Tonu - Test
    @Test
    void calculateTriangleAreaTest() {
        Assertions.assertThat(geometryService.calculateAreaOfTriangle(10.0,6.0)).isEqualTo(30.0);
    }
}