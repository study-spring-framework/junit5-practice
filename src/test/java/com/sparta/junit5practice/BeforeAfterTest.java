package com.sparta.junit5practice;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {
    @BeforeEach
    void setUp() {
        // 각각의 테스트 코드가 실행 되기전에 수행되는 메소드를 만들어 준다
        System.out.println("각각의 테스트 코드가 실행되기 전에 수행");
    }

    @AfterEach
    void tearDown() {
        System.out.println("각각의 테스트 코드가 실행되기 후에 수행\n");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("모든 테스트 코드가 실행되기 전에 최초로 수행\n");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("모든 테스트 코드가 실행되기 후 마지막으로 수행\n");
    }

    @Test
    void test1() {
        System.out.println("테스트 코드 작성 1");
    }

    @Test
    void test2() {
        System.out.println("테스트 코드 작성 2");
    }
}
