package com.kodilla.testing.shape;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


@DisplayName("TDD: FigureCollector Testing")

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Testing adding figures")
        class AddFigureTests {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(new Square(5));
            shapeCollector.addFigure(new Circle(3));
            shapeCollector.addFigure(new Triangle(3,5));

            //Then
            Assertions.assertEquals(3,shapeCollector.getShapesQuantity());


        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle1 = new Circle(5);
            Circle circle2 = new Circle(10);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(circle2);
            //When
            boolean result = shapeCollector.removeFigure(circle1);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        }


        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            Circle circle3 = new Circle(10);
            shapeCollector.addFigure(circle3);

            //When
            Shape retrievedFigure;
            retrievedFigure = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(circle3, retrievedFigure);
        }
    }
}
