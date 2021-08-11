package com.kodilla.testing.forum;

import org.junit.jupiter.api.*;

@DisplayName("Forum test suite")
public class ForumTestSuite {


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
    @DisplayName("When created SimpleUser with name, " +
            "then getRealname should return correct real name")
    @Test
    void testCaseRealname(){
        //Given
        SimpleUser user = new SimpleUser("theForumUser", "John Snow");
        //When
        String result = user.getRealname();
        String expectedResult = "John Snow";
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
    @DisplayName("When created SimpleUser with name, " +
            "then getUsername should return correct user name")

    @Test
    void testCaseUsername() {
        //Given
        SimpleUser user = new SimpleUser("theForumUser", "theForumUserRealName");
        //When
        String result = user.getUsername();
        String expectedResult = "theForumUser";
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
