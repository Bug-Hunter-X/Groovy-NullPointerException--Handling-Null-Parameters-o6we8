def myMethod(param) {
  if (param == null) {
    throw new NullPointerException("Parameter cannot be null")
  }
  // ... rest of the method
}

// Calling the method without checking for null
myMethod(someVariableThatMightBeNull)