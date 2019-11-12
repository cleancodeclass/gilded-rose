# Conditional complexity Refactoring

1. Invert-if 
 
	```java  
    // Before
    if (!A) {
      B
    } else {
      C
    }
	```
	```java
    // After
    if (A) {
      C
    } else {
      B
    }
	```

1. Split Condition
  
	```java
    // Before
    if (A || B) {
      C
    } else {
      D
    }
	```
	```java
    // After
    if (A) {
      C
    } else if (B) {
      C
    } else {
      D
    }
	```

1. Add else block
  
	```java
    // Before
    if (A) {
      B
    }
	```
	```java
    // After
    if (A) {
      B
    } else {
    }
	```

1. Join if-statement with inner if-statement  

	```java
    // Before
    if (A) {
      if (B) {
        C
      }
    }
	```
	```java
    // After
    if (A && B) {
      C
    }
	```

1. Exchange conditions for inner and outer if-statement  

	```java
    // Before
    if (A) {
      if (B) {
        C
      } else {
        D
      }
    }
	```
	```java
    // After
    if (B) {
      if (A) {
        C
      }
    } else {
      if (A) {
        D
      }
    }
	```

1. Combine outer else and inner if-statement  

	```java
    // Before
    if (A) {
      B
    } else {
      if (C) {
        D
      } else {
        E
      }
    }
	```
	```java
    // After
    if (A) {
      B
    } else if (C) {
      D
    } else {
      E
    }
	```

1. Consolidate Duplicate Conditional Fragments  

	```java
    // Before
    if (A) {
      B
      D
    } else {
      C
      D
    }
	```
	```java
    // After
    if (A) {
      B
    } else {
      C
    } 
    D
	```

1. Duplicate Statements into if-statement  

	```java
    // Before
    Z
    if (A) {
      B
    } else {
      C
    }
    D
	```
	```java
    // After
    if (A) {
      Z
      B
      D
    } else {
      Z
      C
      D
    }
	```
