# JUnit 4 & JUnit 5 Testing

A hands-on repository for learning and practicing Java unit testing with **JUnit 4 and JUnit 5**. It demonstrates the fundamentals of test case design, assertions, lifecycle methods, exception testing, and organized test execution.

## Overview

This repository focuses on understanding unit testing in Java, comparing JUnit 4 and JUnit 5, and writing maintainable tests for application logic.



## Concepts Covered

### JUnit 4

- `@Test`
- `@Before` and `@After`
- `@BeforeClass` and `@AfterClass`
- Assertions using `Assert`
- Exception testing
- Test execution and lifecycle

### JUnit 5

- `@Test`
- `@BeforeEach` and `@AfterEach`
- `@BeforeAll` and `@AfterAll`
- Assertions using `Assertions`
- `assertThrows()` for exception testing
- Parameterized tests
- `@DisplayName`
- Nested tests and test organization

## JUnit 4 vs JUnit 5

| Feature | JUnit 4 | JUnit 5 |
|---|---|---|
| Test annotation | `@Test` | `@Test` |
| Before each test | `@Before` | `@BeforeEach` |
| After each test | `@After` | `@AfterEach` |
| Before all tests | `@BeforeClass` | `@BeforeAll` |
| After all tests | `@AfterClass` | `@AfterAll` |
| Assertions | `Assert` | `Assertions` |
| Architecture | Single framework | Platform, Jupiter, Vintage |


Maven test discovery depends on your `pom.xml` configuration and the test framework provider. If both JUnit versions are configured, verify that each suite is discovered and executed as expected.

## Author

**Pushkar Narayan**
