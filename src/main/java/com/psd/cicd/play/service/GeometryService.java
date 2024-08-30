package com.psd.cicd.play.service;

import org.springframework.stereotype.Service;

@Service
public class GeometryService {

    // Imtiaz Kalam Abir - Function
    public double calculateSquareArea(double length) {
        return length * length;
    }

    // Anisur Rahman Tonu - Function
    public double calculateAreaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }
}
