package com.kodilla.testing.collections;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Colletion test suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test case: end");
    }
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test suite: begin");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Test suite: end");
    }
    @DisplayName("Given to created OddNumbersExterminator class object with a list full of numbers, " +
                    "shall return a new list without odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        Integer[] exampleDataTable = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 101, 108, 932184832};
        List<Integer> sampleList = Arrays.asList(exampleDataTable);
        Integer[] exterminatedDataTable = {0, 2, 4, 6, 8, 10, 12, 108, 932184832};
        List<Integer> exterminatedSampleList = Arrays.asList(exterminatedDataTable);
        //Then
        Assertions.assertEquals(exterminator.exterminate(sampleList), exterminatedSampleList);

    }
    @DisplayName("Given to created OddNumbersExterminator class object with a list, but empty one, " +
            "shall return same, empty list")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> sampleList = new ArrayList<>();
        List<Integer> exterminatedSampleList = new ArrayList<>();
        //Then
        Assertions.assertEquals(exterminator.exterminate(sampleList), exterminatedSampleList);
    }
}
