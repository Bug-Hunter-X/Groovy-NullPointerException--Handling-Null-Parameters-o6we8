def myMethod(param) {
  if (param == null) {
    // Handle the null case appropriately.  Options include:
    // 1. Return a default value:
    return 0 // Or some other suitable default
    // 2. Throw a more informative exception:
    throw new IllegalArgumentException("Parameter cannot be null")
    // 3. Log a warning and use a default value
    println "Warning: Parameter is null. Using default value."
    return 0
  }
  // ... rest of the method
}

// Safer way to call the method
someVariableThatMightBeNull?.with {
    myMethod(it)
}
//or
myMethod(someVariableThatMightBeNull ?: 0) 