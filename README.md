# Groovy NullPointerException: Handling Null Parameters

This repository demonstrates a common error in Groovy: handling null parameters without proper null checks.  The `BuggyGroovyCode.groovy` file shows how a `NullPointerException` can occur when passing a null value to a method.  `FixedGroovyCode.groovy` provides a corrected version with robust null handling.  Understanding how to handle null values is crucial for writing robust and reliable Groovy applications.

## How to reproduce:

1. Clone the repository.
2. Run `BuggyGroovyCode.groovy`. Observe the `NullPointerException`. 
3. Run `FixedGroovyCode.groovy`. This version handles null input gracefully.