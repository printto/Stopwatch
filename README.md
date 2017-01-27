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

Appending StringBuilder is faster than appending String because appending String require creating entirely new String object.

"double" is faster than "Double object" and "BigDecimal" because it is primitivevariable but "Double object" and "BigDecimal" are objects.

BigDecimal requires more memory so it perform slowest.
