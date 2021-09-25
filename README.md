# Just a simple example of how using the TDD

1. Create an empty class (example : Calculator.java)
2. Create a test class (example: CalculatorTest.java)
3. Have in mind which functions we want to implement : an **addition** and a **division**
4. Create a method in `CalculatorTest.java` to illustrate a Test Case :

- 2 = 5 should give 7
- 10/5 should give 2
- 10/0 should give an Exception

5. When creating the method, declare a method which still doesn't exist in `Calculator.java` like add(), divide()
6. When defining the `add()` or `divide()` method, first let them return 0 : the purpose is to detect failures when testing our App.
7. Then you implement the code in one of the 2 methods to return a success when testing