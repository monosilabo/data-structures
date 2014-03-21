# Laboratory practice

## Q&A

1. What is the value of `Math.abs(-2147483648)`?

	`-2147483648`. This strange (but true) result is a typical example of the effects of integer overflow. By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -2^31 and a maximum value of 2^31-1.
	
	*Source*: `MathAbsApp.java`

2. Can you use < and > to compare String variables?


	No. Those operators are defined only for primitive types. Use String `compareTo` method to compare two strings lexicographically.

	*Compilation error*: `error: bad operand types for binary operator '<'`
	*Source*: `StringComparisonApp.java`, `StringComparableApp.java`


3. Why do we say (a && b) and not (a & b)? What is the difference between those operators?

	The operators &, |, and ^ are **bitwise logical** operations for integer types that do and, or, and exclusive or (respectively) on each bit position. Thus the value of 10 & 6 is 2, the value of 10 | 6 is 14 and the value of 10 ^ 6 is 12. The operators && and | | are valid only in boolean expressions; they differ from the operators & and | because of short-circuiting: an expression is evaluated left-to-right and the evaluation stops when the value is known.

	*Source*: `BitwiseApp.java`	


4. If a[] is an array, why does System.out.println( a) print out a hexadecimal integer, such as @f62373, instead of the elements of the array?

	Typically, it prints the memory address of the array, which, unfortunately, is rarely what you want. Instead, you can first call `Arrays.toString(a)`. This method returns a string representation of the contents of the specified array. The string representation consists of a list of the array's elements, enclosed in square brackets ("[]").
	
	The `toString` method for class `Array` returns a string consisting of the name of the class of which the object is an instance, the at-sign character `@', and the unsigned hexadecimal representation of the hash code of the object.

	*Source*: `ArrayPrintApp.java`	
	


## Exercises

1. Write a program that takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwise.

	*Source*: `NumberEqualityApp.java`, `NumberEqualityForApp.java`

2. What does the following program print?

	```
	int f = 0;
	int g = 1; 
	for (int i = 0; i <= 15; i++) {
		System.out.println(f); 
		f = f + g;
		g = f - g;
	}
	```

	A sequence of numbers defined by `a_k = a_{k-1} + a_{k-2}` for every `k > 1`.

	*Source*: `SequenceApp.java`

3. What do each of the following print? Explain each outcome.
	
	a. `System.out.println('b');`: b
	
	The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).  Always use 'single quotes' for char literals and "double quotes" for String literals. 
	
	b. `System.out.println('b' + 'c');`: 197
	c. `System.out.println((char) ('a' + 4));`: e
	
	*Source*: `CharApp.java`

4. Write a code fragment that puts the binary representation of a positive integer N into a String s.

	*Source*: `BinaryStringApp.java`	

5. Write a code fragment that prints the contents of a two-dimensional boolean array (N x M), using * to represent true and a - to represent false. Include row and column numbers.

	* Input: 0 1 0 1 | 1 1 1 1 | 0 0 0 0
	* Output:
	
		0,0 -  
		0,1 *  
		0,2 -  
		0,3 *  
		1,0 *  
		...
		
6. 	Write a code fragment to print the transposition (rows and columns changed) of a two-dimensional array with M rows and N columns.

7. 	Write a static method `histogram()` that takes an array `a[]` of `int` values and an integer `M` as arguments and returns an array of length `M` whose `i`th entry is the number of times the integer `i` appeared in the argument array. If the values in `a[]` are all between `0` and `M − 1`, the sum of the values in the returned array should be equal to `a.length`.


	* Input: 2 3 3 1 | 4
	* Output: 0 1 1 2
