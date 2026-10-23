package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testApplicationMessage() {
        assertEquals(
            "Task 02 Maven Build and Test Successful",
            App.getMessage()
        );
    }
}
