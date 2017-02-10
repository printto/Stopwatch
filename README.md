# Stopwatch tasks by Pappim Pipatkasrira

The result of this program running on my laptop:

|Task                                   |Time         |
|:--------------------------------------|------------:|
|Append 50,000 chars to String          |0.972645 sec |
|Append 100,000 chars to String         |2.835020 sec |
|Append 100,000 chars to StringBuilder  |0.002183 sec |
|Sum array of double primitives         |1.065630 sec |
|Sum array of Double objects            |5.932963 sec |
|Sum array of BigDecimal with           |10.219554 sec|

## Explanation of Results

Appending "StringBuilder" is faster than appending "String" because "StringBuilder" creates empty array of the character ready for adding new character to the array, while appending "String" require creating entirely new "String" object and copy the previous "String" and add new "String" to it.

"primative double" is faster than "Double" and "BigDecimal" because it is primitive variable but "Double" and "BigDecimal" are objects.

"BigDecimal" creates the slots for the decimal while "Double" just extend more function for "primitive double" so "BigDecimal" performs slowest.
